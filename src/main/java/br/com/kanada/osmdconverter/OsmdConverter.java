package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptLexer;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.tools.ant.DirectoryScanner;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class OsmdConverter {
    public static final int MAX_LINE_LENGTH = 1000;
    AtomicInteger counter = new AtomicInteger(0);
    //String rootDir = "src/test/resources/opensheetmusicdisplay-develop";
    String rootDir = "src/test/resources/simple-tests";
    String outputDir = "src/test/resources/opensheetmusicdisplay-develop-dart";
    List<ParseTreeListener> firstPassListeners = new ArrayList<>();
    List<ParseTreeListener> secondPassListeners = new ArrayList<>();
    List<ParseTreeListener> generatorsListeners = new ArrayList<>();
    Map<String, NavigableMap<Integer, String>> hiddenTokenMap = Collections.synchronizedMap(new HashMap<>());
    Map<String, TypeScriptParser.ProgramContext> mapWalker = Collections.synchronizedMap(new HashMap<>());
    Map<String, TypeScriptParser.ClassDeclarationContext> classMap = Collections.synchronizedMap(new HashMap<>());
    Map<String, Map<Integer, Integer>> minColMap = Collections.synchronizedMap(new HashMap<>());
    Map<String, NavigableSet<String>> importsMap = Collections.synchronizedMap(new HashMap<>());
    TSQuerier querier = new TSQuerier(this);


    private void doInitialParse(List<String> files) {
        if (files.size() > 0) {
            counter.set(0);
            System.setErr(System.out);
            files.parallelStream().forEach(file -> {
                try {
                    int localCounter = counter.incrementAndGet();
                    System.out.println(localCounter + "/" + files.size() + " Initial Parse: " + file);
                    System.out.flush();
                    String fileName = rootDir + File.separator + file;
                    CommonTokenStream tokens = new CommonTokenStream(
                            new TypeScriptLexer(
                                    CharStreams.fromStream(new ByteArrayInputStream(
                                            Files.readAllBytes(Paths.get(fileName))))));
                    HiddenTokensCollectorListener hiddenTokensCollectorListener = new HiddenTokensCollectorListener(tokens, this);
                    hiddenTokensCollectorListener.setFileName(file);
                    MinColCollectorListener minColCollectorListener = new MinColCollectorListener(tokens, this);
                    minColCollectorListener.setFileName(file);
                    TypeScriptParser parser = new TypeScriptParser(tokens);
                    //parser.setTrace(true);
                    parser.addParseListener(hiddenTokensCollectorListener);
                    parser.addParseListener(minColCollectorListener);
                    TypeScriptParser.ProgramContext programContext = parser.program();
                    mapWalker.put(file, programContext);
                } catch (Exception e) {
                    System.out.println("Error in file: " + file);
                    e.printStackTrace(System.out);
                }
            });
        }
    }

    private void runPassListeners(List<String> files, List<ParseTreeListener> listeners) {
        if (files.size() > 0 && listeners.size() > 0) {
            files.stream().sequential().forEach(file -> {
                try {
                        listeners.forEach(listener -> {
                            OsmdConverterTSListener tsListener = (OsmdConverterTSListener) listener;
                            tsListener.setFileName(file);
                            ParseTreeWalker.DEFAULT.walk(tsListener, mapWalker.get(file));
                        });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public void run() {
        DirectoryScanner scanner = new DirectoryScanner();
        scanner.setBasedir(rootDir);
        scanner.setIncludes(new String[]{"**/*.ts", "**/*.js"});
        scanner.scan();
        String[] files = scanner.getIncludedFiles();
        long time = System.currentTimeMillis();
        System.out.println("--- Initial Parse ---");
        System.out.flush();
        List<String> filesList = Arrays.asList(files);
        doInitialParse(filesList);
        System.out.println("Initial Parse time: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        System.out.println("--- First Pass ---");
        runPassListeners(filesList, firstPassListeners);
        System.out.println("First Pass time: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        System.out.println("--- Second Pass ---");
        runPassListeners(filesList, secondPassListeners);
        System.out.println("Second Pass time: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();

        runGeneratorVisitor(filesList);

        System.out.println("Generators time: " + (System.currentTimeMillis() - time));
    }

    private void runGeneratorVisitor(List<String> files) {
        if (files.size() > 0) {
            files.stream().sequential().forEach(file -> {
                try {
                    File outputDirFile = new File(outputDir);
                    if (!outputDirFile.exists()) {
                        outputDirFile.mkdirs();
                    }
                    String originalFileName = file;
                    String newFileName = file.replace(".ts", ".xml");
                    //String newFileName = file.replace(".ts", ".dart");

                    if (newFileName.indexOf(File.separatorChar) != -1) {
                        File dir = new File(outputDir, newFileName.substring(0, newFileName.lastIndexOf(File.separatorChar)));
                        dir.mkdirs();
                    }

                    Writer out = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File(outputDir, newFileName))));
                    //DartGeneratorFromTSVisitor visitor = new DartGeneratorFromTSVisitor(this, file);
                    //GenericGeneratorVisitor visitor = new GenericGeneratorVisitor(this, file);
                    DebugVisitor visitor = new DebugVisitor();

                    out.write(visitor.visit(mapWalker.get(file)));
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public static void main(String[] args) {
        OsmdConverter converter = new OsmdConverter();
        converter.firstPassListeners.add(new TSClassCollectorListener(converter));
        converter.firstPassListeners.add(new ImportsCollectorListener(converter));
        //converter.firstPassListeners.add(new DebugListener(converter));
        //converter.generatorsListeners.add(new DartGeneratorFromTSListener(converter));
        converter.run();
    }
}
