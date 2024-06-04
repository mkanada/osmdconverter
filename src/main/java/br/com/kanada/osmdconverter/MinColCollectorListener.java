package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MinColCollectorListener extends TypeScriptParserBaseListener implements OsmdConverterTSListener {
    CommonTokenStream tokens;
    OsmdConverter converter;
    Map<Integer, Integer> minColMap;
    String fileName;

    public MinColCollectorListener(CommonTokenStream tokens, OsmdConverter converter) {
        this.tokens = tokens;
        this.converter = converter;
    }

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
        converter.minColMap.put(fileName, Collections.synchronizedMap(new HashMap<>()));
        minColMap = converter.minColMap.get(fileName);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (!minColMap.containsKey(node.getSymbol().getLine())) {
            minColMap.put(node.getSymbol().getLine(), node.getSymbol().getCharPositionInLine());
        } else {
            int currentCol = node.getSymbol().getCharPositionInLine();
            int minCol = minColMap.get(node.getSymbol().getLine());
            if (currentCol < minCol) {
                minColMap.put(node.getSymbol().getLine(), currentCol);
            }
        }
    }
}
