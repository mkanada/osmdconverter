package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseListener;

public class CountImportsInFileListener extends TypeScriptParserBaseListener {
    private int importsCount = 0;

    @Override
    public void exitImportStatement(TypeScriptParser.ImportStatementContext ctx) {
        importsCount++;
    }

    public int getImportsCount() {
        return importsCount;
    }
}
