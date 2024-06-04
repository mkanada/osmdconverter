package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseListener;
import org.antlr.v4.runtime.RuleContext;

import java.io.*;
import java.util.*;

public class DartGeneratorFromTSListener extends TypeScriptParserBaseListener implements OsmdConverterTSListener {
    private final OsmdConverter converter;
    private String originalFileName;
    private String newFileName;
    private Writer out;
    private RuleContext currentClassCtx;
    private String currentClassName;
    private static Map<String, String> typeConversionMap = new HashMap<>();
    private int numWhiteIdentation = 4;
    private int currentLevel = 0;

    static {
        typeConversionMap.put("number", "double");
        typeConversionMap.put("string", "String");
        typeConversionMap.put("boolean", "bool");
    }

    public DartGeneratorFromTSListener(OsmdConverter converter) {
        this.converter = converter;
        out = null;
    }

    @Override
    public void setFileName(String fileName) {
        this.originalFileName = fileName;
        this.newFileName = fileName.replace(".ts", ".dart");
        out = null;
        System.out.println("DartGeneratorFromTSListener.setFileName: " + fileName);
    }

    @Override
    public void enterProgram(TypeScriptParser.ProgramContext ctx) {
        File outputDirFile = new File(converter.outputDir);
        if (!outputDirFile.exists()) {
            outputDirFile.mkdirs();
        }
        if (newFileName.indexOf(File.separatorChar) != -1) {
            File dir = new File(converter.outputDir, newFileName.substring(0, newFileName.lastIndexOf(File.separatorChar)));
            dir.mkdirs();
        }
        try {
            out = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File(converter.outputDir, newFileName))));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        currentLevel = 0;
    }

    @Override
    public void enterPropertyDeclarationExpression(TypeScriptParser.PropertyDeclarationExpressionContext ctx) {
        writeHiddenTokens(ctx.start.getTokenIndex());
        String staticModifier = "";
        if (ctx.propertyMemberBase() != null && ctx.propertyMemberBase().Static() != null) {
            staticModifier = "static ";
        }
        String privateModifier = "";
        if (ctx.propertyMemberBase() != null && ctx.propertyMemberBase().accessibilityModifier().Private() != null) {
            privateModifier = "private ";
        }

        String type = ctx.typeAnnotation().type_().getText();
        String propertyName = ctx.propertyName().identifierName().getText();
        String initializer = "";
        if (ctx.initializer() != null) {
            initializer = " = " + ctx.initializer().singleExpression().getText();
        }

        writeIdent();
        writeString(privateModifier + staticModifier + convertType(type) + " " + propertyName + initializer + ";\n");
    }

    @Override
    public void enterExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx) {
        writeHiddenTokens(ctx.start.getTokenIndex());
        writeIdent();
    }

    @Override
    public void exitExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx) {
        writeString(ctx.getText() + "\n");
    }

    @Override
    public void exitExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) {
        //ctx.addChild(TypeScriptParser.);
        super.exitExpressionSequence(ctx);
    }

    @Override
    public void enterMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
        writeHiddenTokens(ctx.start.getTokenIndex());
        String methodName = ctx.propertyName().identifierName().getText();

        TSMethodInfo info = converter.querier.queryMethod(currentClassName, methodName);

        writeIdent();
        writeString(info.visibility + " " + info.staticModifier + " " + convertType(info.returnType) + " " + methodName + "(");
        for (int i = 0; i < info.parameters.size(); i++) {
            TSMethodInfo.Parameter param = info.parameters.get(i);
            if (i > 0) {
                writeString(", ");
            }
            if (param.type == null || param.type.trim().isEmpty()) {
                param.type = converter.querier.queryVarTypeInMethod(currentClassName, methodName, param.name);
            }
            writeString(convertType(param.type) + " " + param.name);
        }
        writeString(") {\n");
        currentLevel++;
    }

    @Override
    public void exitMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
        currentLevel--;
        writeIdent();
        writeString("}\n");
    }

    private String convertType(String type) {
        if (type == null) {
            return "/* undefined */";
        }
        String toGetInMap = type;
        String modifiedType = type;
        if (type.endsWith("[]")) {
            toGetInMap = type.substring(0, type.length() - 2);
            modifiedType = toGetInMap;
        }
        if (typeConversionMap.containsKey(toGetInMap)) {
            modifiedType = typeConversionMap.get(toGetInMap);
        }
        if (type.endsWith("[]")) {
            modifiedType = "List<" + modifiedType + ">";
        }
        return modifiedType;
    }



    @Override
    public void exitProgram(TypeScriptParser.ProgramContext ctx) {
        //System.out.println("DartGeneratorFromTSListener.exitProgram: " + newFileName);
        if (out != null) {
            try {
                out.close();
                out = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        currentLevel--;
    }

    @Override
    public void enterClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) {
        writeHiddenTokens(ctx.start.getTokenIndex());
        writeString("class " + ctx.identifier().getText() + " {\n");
        currentClassName = ctx.identifier().getText();
        currentLevel++;
    }

    private void writeString(String str) {
        try {
            out.write(str);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void exitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) {
        writeString("}\n");
        currentLevel--;
    }

    private void writeHiddenTokens(int tokenIndex) {
//        NavigableMap<Integer, List<Token>> navMap = converter.hiddenTokenMap.get(originalFileName);
//        while (navMap.size() > 0 && navMap.firstEntry().getKey() < tokenIndex) {
//            Map.Entry<Integer, List<Token>> entry = navMap.firstEntry();
//            for (Token token : entry.getValue()) {
//                String[] lines = token.getText().split("\n");
//                for(String line : lines) {
//                    if (!line.trim().isEmpty()) {
//                        writeIdent();
//                        writeString(line.trim() + "\n");
//                    }
//                }
//            }
//            navMap.remove(entry.getKey());
//        }
    }

    private void writeIdent() {
        for (int i = 0; i < currentLevel * numWhiteIdentation; i++) {
            writeString(" ");
        }
    }
}
