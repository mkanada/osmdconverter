package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class HiddenTokensCollectorListener extends TypeScriptParserBaseListener implements OsmdConverterTSListener {
    CommonTokenStream tokens;
    OsmdConverter converter;
    String fileName;

    public HiddenTokensCollectorListener(CommonTokenStream tokens, OsmdConverter converter) {
        this.tokens = tokens;
        this.converter = converter;
    }

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
        converter.hiddenTokenMap.put(fileName, Collections.synchronizedNavigableMap(new TreeMap<>()));
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        int tokenIndex = node.getSymbol().getTokenIndex();
        List<Token> hiddenTokens = tokens.getHiddenTokensToLeft(tokenIndex);
        if (hiddenTokens != null && !hiddenTokens.isEmpty()) {
            try {
                for(Token hiddenToken : hiddenTokens) {
                    converter.hiddenTokenMap.get(fileName).put(hiddenToken.getTokenIndex(), hiddenToken.getText());
                }
            } catch (NullPointerException ex) {
                System.out.println("Null for: " + fileName);
                ex.printStackTrace();
            }
        }
    }
}
