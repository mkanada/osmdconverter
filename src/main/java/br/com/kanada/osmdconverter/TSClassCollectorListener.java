package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseListener;

public class TSClassCollectorListener extends TypeScriptParserBaseListener implements OsmdConverterTSListener {
    private final OsmdConverter converter;

    public TSClassCollectorListener(OsmdConverter converter) {
        this.converter = converter;
    }

    @Override
    public void enterClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) {
        if (converter.classMap.containsKey(ctx.identifier().getText()))
            System.out.println("Duplicate class: " + ctx.identifier().getText());
        else converter.classMap.put(ctx.identifier().getText(), ctx);
    }

    @Override
    public void setFileName(String fileName) {

    }
}
