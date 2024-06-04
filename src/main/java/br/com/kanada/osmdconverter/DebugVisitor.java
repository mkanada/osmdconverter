package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseVisitor;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DebugVisitor extends TypeScriptParserBaseVisitor<String> {
    @Override
    public String visitChildren(RuleNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(node.getClass().getSimpleName()).append(">\n");
        sb.append(super.visitChildren(node)).append("\n");
        sb.append("</").append(node.getClass().getSimpleName()).append(">\n");
        return sb.toString();
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (text == null) {
            return "";
        }
        return node.getText();
    }

    @Override
    public String visitErrorNode(ErrorNode node) {
        String text = node.getText();
        if (text == null) {
            return "";
        }
        return node.getText();
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        String left = aggregate == null ? "" : aggregate;
        String right = nextResult == null ? "" : nextResult;
        return left + right;
    }
}
