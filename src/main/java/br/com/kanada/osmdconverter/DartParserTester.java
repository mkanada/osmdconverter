package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.dart.generated.Dart2Lexer;
import br.com.kanada.osmdconverter.dart.generated.Dart2Parser;
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

public class DartParserTester {
    AtomicInteger counter = new AtomicInteger(0);
    //String rootDir = "src/test/resources/simple-tests-dart";
    //String rootDir = "src/test/resources/packages-main";
    String rootDir = "src/test/resources/opensheetmusicdisplay-develop-dart";

    private void doInitialParse(List<String> files) {
        if (files.size() > 0) {
            counter.set(0);
            files.forEach(file -> {
                try {
                    int localCounter = counter.incrementAndGet();
                    System.out.println(localCounter + "/" + files.size() + " Initial Parse: " + file);
                    System.out.flush();
                    String fileName = rootDir + File.separator + file;
                    CommonTokenStream tokens = new CommonTokenStream(
                            new Dart2Lexer(
                                    CharStreams.fromStream(new ByteArrayInputStream(
                                            Files.readAllBytes(Paths.get(fileName))))));
                    Dart2Parser parser = new Dart2Parser(tokens);
                    Dart2Parser.CompilationUnitContext programContext = parser.compilationUnit();
                } catch (Exception e) {
                    System.out.println("Error in file: " + file);
                    e.printStackTrace(System.out);
                }
            });
        }
    }

    public void run() {
        DirectoryScanner scanner = new DirectoryScanner();
        scanner.setBasedir(rootDir);
        scanner.setIncludes(new String[]{"**/*.dart"});
        scanner.scan();
        String[] files = scanner.getIncludedFiles();
        long time = System.currentTimeMillis();
        System.out.println("--- Initial Parse ---");
        System.out.flush();
        List<String> filesList = Arrays.asList(files);
        doInitialParse(filesList);
        System.out.println("Initial Parse time: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();

        System.out.println("Generators time: " + (System.currentTimeMillis() - time));
    }

    public static void main(String[] args) {
        DartParserTester converter = new DartParserTester();
        converter.run();
    }
}
