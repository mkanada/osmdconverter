package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseListener;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ImportsCollectorListener extends TypeScriptParserBaseListener implements OsmdConverterTSListener {
    OsmdConverter converter;
    String fileName;

    private static final Map<String, String> memberDotToImport = new HashMap<>();

    static {
        memberDotToImport.put("Math.log", "dart:math");
        memberDotToImport.put("Math.min", "dart:math");
        memberDotToImport.put("Math.max", "dart:math");
        memberDotToImport.put("Math.pow", "dart:math");
    }

    public ImportsCollectorListener(OsmdConverter converter) {
        this.converter = converter;
    }

    @Override
    public void enterMemberDotExpression(TypeScriptParser.MemberDotExpressionContext ctx) {
        String memberDotExp = ctx.getText();
        if (memberDotToImport.containsKey(memberDotExp)) {
            converter.importsMap.get(fileName).add(memberDotToImport.get(memberDotExp));
        }
    }

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
        converter.importsMap.put(fileName, Collections.synchronizedNavigableSet(new TreeSet<>()));
    }
}
