package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseVisitor;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class DartGeneratorFromTSVisitor extends TypeScriptParserBaseVisitor<String> {
    OsmdConverter converter;
    String fileName;
    private static Map<String, String> typeConversionMap = new HashMap<>();
    private static Map<String, String> dotMemberReplace = new HashMap<>();

    static {
        typeConversionMap.put("number", "double");
        typeConversionMap.put("string", "String");
        typeConversionMap.put("boolean", "bool");
        dotMemberReplace.put("Math.log", "log");
        dotMemberReplace.put("Math.min", "min");
        dotMemberReplace.put("Math.max", "max");
        dotMemberReplace.put("Math.pow", "pow");
    }


    public DartGeneratorFromTSVisitor(OsmdConverter converter, String fileName) {
        this.converter = converter;
        this.fileName = fileName;
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        if (node != null) {
            String hidden = "";
            String nodeText = node.getText();
            if ("<EOF>".equals(nodeText)) {
                nodeText = "";
            } else if ("===".equals(nodeText)) {
                nodeText = "==";
            } else if ("!==".equals(nodeText)) {
                nodeText = "!=";
            }
//            else if ("let".equals(nodeText)) {
//                StringBuilder sb = new StringBuilder(nodeText);
//                ParseTree thisNode = node.getParent();
//                while (thisNode != null) {
//                    sb.append(" " + thisNode.getClass().getSimpleName() + " ");
//                    thisNode = thisNode.getParent();
//                }
//                nodeText = sb.toString();
//            }
            if (node.getSymbol().getTokenIndex() > 0) {
                hidden = getHiddenTokens(node.getSymbol().getTokenIndex());
            }
            return hidden + nodeText;
        } else {
            return "";
        }
    }

    @Override
    public String visitProgram(TypeScriptParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        NavigableSet imports = converter.importsMap.get(fileName);
        if (imports != null && !imports.isEmpty()) {
            for (Object imp : imports) {
                sb.append("import '" + imp + "';\n");
            }
        }

        sb.append(super.visitProgram(ctx));

        return sb.toString();
    }

    //    @Override
//    public String visitVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
//        String hidden = getHiddenTokens(ctx.start.getTokenIndex());
//        String declare = visitTerminal(ctx.Declare());
//        String readOnly = visitTerminal(ctx.ReadOnly());
//        String variableDeclarationList = visitChildren(ctx.variableDeclarationList());
//        String varModifier = visitChildren(ctx.varModifier());
//        return hidden + "/*aqui?*/"
//                + "/* declare */" + declare + " /*declare*/"
//                + "/* readOnly */" + readOnly + " /*readOnly*/"
//                + "/* varModifier */" + varModifier + " /*varModifier*/"
//                + "/* variableDeclarationList */" + variableDeclarationList + " /*variableDeclarationList*/"
//                + "/*aqui?*/";
//    }

//    public String visitVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
//        ctx.
//    }


    @Override
    public String visitVarModifier(TypeScriptParser.VarModifierContext ctx) {
        String hidden = getHiddenTokens(ctx.start.getTokenIndex());
        return hidden;
    }

    @Override
    public String visitVariableDeclarationList(TypeScriptParser.VariableDeclarationListContext ctx) {
        List<TypeScriptParser.VariableDeclarationContext> x = ctx.variableDeclaration();
        StringBuilder sb = new StringBuilder();
        sb.append(removeSpacesAfterNewLine(getHiddenTokens(ctx.start.getTokenIndex())));
        sb.append(getIndentation(ctx.start.getLine()));
//        DebugVisitor dv = new DebugVisitor();
//        sb.append(dv.visitChildren(ctx));
        for (TypeScriptParser.VariableDeclarationContext var : x) {
            String type = (var.typeAnnotation() != null && var.typeAnnotation().type_() != null) ? visitType_(var.typeAnnotation().type_()) : "";
            String varName = visitChildren(var.identifierOrKeyWord());
            StringBuilder sb2 = new StringBuilder();
            for(TypeScriptParser.SingleExpressionContext singleExpressionContext : var.singleExpression()) {
                sb2.append(visitChildren(singleExpressionContext));
            }
            String initializer = sb2.toString();

            if (!type.isEmpty()) {
                sb.append(type).append(" ");
            }
            sb.append(varName);
            if (!initializer.isEmpty()) {
                sb.append(" = ").append(initializer);
            }
        }
        return sb.toString();
    }

    private String getHiddenTokens(int tokenIndex) {
        StringBuilder sb = new StringBuilder();
        NavigableMap<Integer, String> navMap = converter.hiddenTokenMap.get(fileName);
        while (!navMap.isEmpty() && navMap.firstEntry().getKey() < tokenIndex) {
            sb.append(navMap.firstEntry().getValue());
            navMap.remove(navMap.firstEntry().getKey());
        }

        return sb.toString();
    }

    private String removeSpacesAfterNewLine(String text) {
        if (text.indexOf('\n') == -1) {
            return text;
        } else {
            return text.substring(0, text.lastIndexOf('\n') + 1);
        }
    }

    private String getIndentation(int line) {
        Map<Integer, Integer> minColMap = converter.minColMap.get(fileName);
        if (minColMap == null) {
            return "";
        }
        int minCol = minColMap.get(line);
        return " ".repeat(minCol);
    }

    @Override
    public String visitErrorNode(ErrorNode node) {
        return node.getSymbol().getText();
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        String left = aggregate == null ? "" : aggregate;
        String right = nextResult == null ? "" : nextResult;
        return left + right;
    }

    @Override
    public String visitType_(TypeScriptParser.Type_Context ctx) {
        String type = visitChildren(ctx);
        if (type == null) {
            return "/* undefined */";
        }
        boolean startsWithBlanks = type.startsWith(" ");
        type = type.trim();
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
        if (startsWithBlanks) {
            modifiedType = " " + modifiedType;
        }

        return modifiedType;
    }

    @Override
    public String visitParameterList(TypeScriptParser.ParameterListContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(visitParameter(ctx.parameter(i)));
        }
        return sb.toString();
    }

    @Override
    public String visitPropertyDeclarationExpression(TypeScriptParser.PropertyDeclarationExpressionContext ctx) {
        String hidden = removeSpacesAfterNewLine(getHiddenTokens(ctx.stop.getTokenIndex()));
        String propertyName = ctx.propertyName().getText();
        String type = visitType_(ctx.typeAnnotation().type_());
        String identation = getIndentation(ctx.propertyName().start.getLine());
        if (ctx.initializer() != null) {
            String initializer = visitChildren(ctx.initializer().singleExpression()).trim();
            return hidden + identation + type + " " + propertyName + " = " + initializer + ";";
        } else {
            return hidden + identation + type + " " + propertyName + ";";
        }
    }

    @Override
    public String visitMemberDotExpression(TypeScriptParser.MemberDotExpressionContext ctx) {
        String memberDotExp = super.visitMemberDotExpression(ctx);

        System.out.println("memberDotExp: " + memberDotExp);

        for(String replaceKeys : dotMemberReplace.keySet()) {
            if (memberDotExp.contains(replaceKeys)) {
                memberDotExp = memberDotExp.replace(replaceKeys, dotMemberReplace.get(replaceKeys));
            }
        }

        return memberDotExp;
    }

    @Override
    public String visitArgumentsExpression(TypeScriptParser.ArgumentsExpressionContext ctx) {
        System.out.println("argumentsExpression: " + ctx.getText());
        return super.visitArgumentsExpression(ctx);
    }

    @Override
    public String visitRequiredParameter(TypeScriptParser.RequiredParameterContext ctx) {
        String typeStr = visitType_(ctx.typeAnnotation().type_()).trim();
        String name = visitIdentifierName(ctx.identifierOrPattern().identifierName());
        return typeStr + " " + name;
    }

    @Override
    public String visitMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
        String propertyBase = visitPropertyMemberBase(ctx.propertyMemberBase());
        getHiddenTokens(ctx.OpenBrace().getSymbol().getTokenIndex());
        String methodName = visitChildren(ctx.propertyName());
        String parameters = "";
        if (ctx.callSignature().parameterList() != null) {
            parameters = visitParameterList(ctx.callSignature().parameterList());
        }
        String returnType = visitType_(ctx.callSignature().typeAnnotation().type_());
        String functionBody = visitChildren(ctx.functionBody());
        String indentation = getIndentation(ctx.propertyName().stop.getLine());
        return propertyBase + returnType + " " + methodName + "(" + parameters + ") {"
                + functionBody
                + "\n" + indentation + "}";
    }

    @Override
    public String visitPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx) {
        String hidden = removeSpacesAfterNewLine(getHiddenTokens(ctx.stop.getTokenIndex()));
        String indentation = getIndentation(ctx.start.getLine());
        String staticModifier = visitTerminal(ctx.Static());
        if (!staticModifier.isEmpty()) {
            staticModifier += " ";
        }

        return hidden + indentation + staticModifier;
    }

    @Override
    public String visitGetAccessor(TypeScriptParser.GetAccessorContext ctx) {
        String methodName = ctx.getter().classElementName().propertyName().getText();
        String returnType = visitType_(ctx.typeAnnotation().type_());
        String functionBody = visitChildren(ctx.functionBody());
        String indentation = getIndentation(ctx.functionBody().stop.getLine());
        return returnType + " get " + methodName + " {"
                + functionBody
                + "\n" + indentation + "}";
    }



    @Override
    public String visitSetAccessor(TypeScriptParser.SetAccessorContext ctx) {
        String methodName = ctx.setter().classElementName().propertyName().getText();
        String functionBody = visitChildren(ctx.functionBody());
        String indentation = getIndentation(ctx.CloseBrace().getSymbol().getLine());
        String parameterName = ctx.formalParameterList().formalParameterArg().get(0).assignable().getText();
        String parameterType = visitType_(ctx.formalParameterList().formalParameterArg().get(0).typeAnnotation().type_());

        return "set " + methodName + "(" + parameterType + " " + parameterName + ") {"
                + functionBody
                + "\n" + indentation + "}";
    }

    @Override
    public String visitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) {
        String hiddenBefore = removeSpacesAfterNewLine(getHiddenTokens(ctx.classTail().start.getTokenIndex()));
        String className = visitIdentifier(ctx.identifier());
        String block = visitClassTail(ctx.classTail());
        String heritage = visitChildren(ctx.classHeritage());
        String identation = getIndentation(ctx.identifier().start.getLine());
        return hiddenBefore + identation + "class " + className + " " + heritage + " " + block;
    }

    @Override
    public String visitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) {
        //ctx.
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public String visitChildren(RuleNode node) {
        if (node == null) {
            return "";
        }
        String childText = super.visitChildren(node);
        if (childText == null) {
            childText = "";
        }
        //String ruleName = TypeScriptParser.ruleNames[node.getRuleContext().getRuleIndex()];
        //return "---i--- " + ruleName + " ---i---\n"
        //        + childText +
        //        "\n---f--- " + ruleName + " ---f---\n";
        return childText;
    }

    //    private final OsmdConverter converter;
//    private String originalFileName;
//    private String newFileName;
//    private RuleContext currentClassCtx;
//    private String currentClassName;
//    private static Map<String, String> typeConversionMap = new HashMap<>();
//    private int numWhiteIdentation = 4;
//    private int currentLevel = 0;
//
//    static {
//        typeConversionMap.put("number", "double");
//        typeConversionMap.put("string", "String");
//        typeConversionMap.put("boolean", "bool");
//    }
//
//    public DartGeneratorFromTSVisitor(OsmdConverter converter, String originalFileName) {
//        this.converter = converter;
//        this.originalFileName = originalFileName;
//    }
//
//    @Override
//    public String visitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getHiddenTokens(ctx.classTail().start.getTokenIndex()));
//        currentClassName = ctx.identifier().getText();
//        sb.append(getIndentation());
//        sb.append("class ").append(currentClassName).append(' ');
//        sb.append(visitClassTail(ctx.classTail()));
//        //sb.append(getIndentation()).append("}\n");
//        return sb.toString();
//    }
//
//    @Override
//    public String visitClassTail(TypeScriptParser.ClassTailContext ctx) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("{\n");
//        currentLevel++;
//        for(TypeScriptParser.ClassElementContext childCtx : ctx.classElement()) {
//            sb.append(visitClassElement(childCtx));
//        }
//        currentLevel--;
//        sb.append(getIndentation()).append("}\n");
//        return sb.toString();
//        //return mockImpl(ctx, "class tail");
//    }
//
//    @Override
//    public String visitPropertyDeclarationExpression(TypeScriptParser.PropertyDeclarationExpressionContext ctx) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getHiddenTokens(ctx.start.getTokenIndex()));
//        sb.append(getIndentation());
//        if (ctx.propertyMemberBase() != null && ctx.propertyMemberBase().accessibilityModifier().Private() != null) {
//            sb.append("private ");
//        }
//        if (ctx.propertyMemberBase() != null && ctx.propertyMemberBase().Static() != null) {
//            sb.append("static ");
//        }
//
//        String type = ctx.typeAnnotation().type_().getText();
//        String propertyName = ctx.propertyName().identifierName().getText();
//
//        sb.append(convertType(type)).append(" ").append(propertyName);
//        if (ctx.initializer() != null) {
//            sb.append(" = ").append(ctx.initializer().singleExpression().getText());
//        }
//        sb.append(";\n");
//
//        return sb.toString();
//    }
//
//    @Override
//    public String visitMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getHiddenTokens(ctx.functionBody().start.getTokenIndex()));
//        sb.append(getIndentation());
//        String methodName = ctx.propertyName().identifierName().getText();
//
//        TSMethodInfo info = converter.querier.queryMethod(currentClassName, methodName);
//
//        if (info == null) {
//            sb.append("// ").append("Method not found: ")
//                    .append("class: ").append(currentClassName)
//                    .append(methodName).append("\n");
//        } else {
//            sb.append(info.visibility).append(" ").append(info.staticModifier).append(" ").append(convertType(info.returnType)).append(" ").append(methodName).append("(");
//            for (int i = 0; i < info.parameters.size(); i++) {
//                TSMethodInfo.Parameter param = info.parameters.get(i);
//                if (i > 0) {
//                    sb.append(", ");
//                }
//                sb.append(convertType(param.type)).append(" ").append(param.name);
//            }
//        }
//        sb.append(") {\n");
//        currentLevel++;
//        sb.append(visitChildren(ctx.functionBody()));
//        currentLevel--;
//        sb.append(getIndentation()).append("}\n");
//
//        return sb.toString();
//    }
//
//    @Override
//    public String visitStatement(TypeScriptParser.StatementContext ctx) {
//        var sb = new StringBuilder();
//        sb.append(getHiddenTokens(ctx.start.getTokenIndex()));
//        sb.append(getIndentation());
//        sb.append(visitChildren(ctx));
//        return sb.toString();
//    }
//
//    @Override
//    public String visitTerminal(TerminalNode node) {
////        StringBuilder sb = new StringBuilder();
////        sb.append("// Hidden Token - i\n");
////        sb.append(getHiddenTokens(node.getSymbol().getTokenIndex()));
////        sb.append("// Hidden Token - f\n");
////        sb.append("termina node: ").append(node.getText());
////        return sb.toString();
//        if (!"<EOF>".equals(node.getText())) {
//            return "/* tr */ " + node.getText() + " /* tr */";
//        } else {
//            return "";
//        }
//    }
//
//    private String mockImpl(RuleNode ctx, String context) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("// ").append(context).append(" - i\n");
//        String childStr = visitChildren(ctx);
//        if (childStr != null && !childStr.isEmpty()) {
//            sb.append(childStr);
//        }
//        sb.append("// ").append(context).append(" - f\n");
//        return sb.toString();
//    }
//
//    @Override
//    protected String aggregateResult(String aggregate, String nextResult) {
//        StringBuilder sb = new StringBuilder();
//        if (aggregate != null && !aggregate.isEmpty()) {
//            sb.append(aggregate);
//        }
//        if (nextResult != null && !nextResult.isEmpty()) {
//            sb.append(nextResult);
//        }
//        return sb.toString();
//    }
//
//
//    private String getHiddenTokens(int tokenIndex) {
//        StringBuilder sb = new StringBuilder();
////        NavigableMap<Integer, List<Token>> navMap = converter.hiddenTokenMap.get(originalFileName);
////        while (!navMap.isEmpty() && navMap.firstEntry().getKey() < tokenIndex) {
////            Map.Entry<Integer, List<Token>> entry = navMap.firstEntry();
////            for (Token token : entry.getValue()) {
////                String[] lines = token.getText().split("\n");
////                for(String line : lines) {
////                    if (!line.trim().isEmpty()) {
////                        sb.append(getIndentation()).append(line.trim()).append("\n");
////                    }
////                }
////            }
////            navMap.remove(entry.getKey());
////        }
//        return sb.toString();
//    }
//
//    private String getIndentation() {
//        return  " ".repeat(currentLevel * numWhiteIdentation);
//    }
//
//    ///////////////////////////////
//    ///////////////////////////////
//    /////////////////////////////// to NOT implement
//    ///////////////////////////////
//    ///////////////////////////////
//
//    @Override
//    public String visitExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx) {
//        var sb = new StringBuilder();
//        sb.append(getHiddenTokens(ctx.start.getTokenIndex()));
//        sb.append(getIndentation());
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public String visitExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) {
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public String visitIdentifierExpression(TypeScriptParser.IdentifierExpressionContext ctx) {
//        return visitChildren(ctx);
//    }
//
//    private String compactMock(RuleNode ctx, String context) {
//        return "/* " + context + " */ " + visitChildren(ctx) + " /* " + context + " */";
//    }
//
//    @Override
//    public String visitSourceElements(TypeScriptParser.SourceElementsContext ctx) {
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public String visitKeyword(TypeScriptParser.KeywordContext ctx) {
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public String visitReservedWord(TypeScriptParser.ReservedWordContext ctx) {
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public String visitEos(TypeScriptParser.EosContext ctx) {
//        return "";
//    }
//
//    ///////////////////////////////
//    ///////////////////////////////
//    /////////////////////////////// to implement
//    ///////////////////////////////
//    ///////////////////////////////
//
//
//    @Override
//    public String visitInitializer(TypeScriptParser.InitializerContext ctx) {
//        return mockImpl(ctx, "initializer");
//    }
//
//    @Override
//    public String visitBindingPattern(TypeScriptParser.BindingPatternContext ctx) {
//        return mockImpl(ctx, "binding pattern");
//    }
//
//    @Override
//    public String visitTypeParameters(TypeScriptParser.TypeParametersContext ctx) {
//        return mockImpl(ctx, "type parameters");
//    }
//
//    @Override
//    public String visitTypeParameterList(TypeScriptParser.TypeParameterListContext ctx) {
//        return mockImpl(ctx, "type parameter list");
//    }
//
//    @Override
//    public String visitTypeParameter(TypeScriptParser.TypeParameterContext ctx) {
//        return mockImpl(ctx, "type parameter");
//    }
//
//    @Override
//    public String visitConstraint(TypeScriptParser.ConstraintContext ctx) {
//        return mockImpl(ctx, "constraint");
//    }
//
//    @Override
//    public String visitTypeArguments(TypeScriptParser.TypeArgumentsContext ctx) {
//        return mockImpl(ctx, "type arguments");
//    }
//
//    @Override
//    public String visitTypeArgumentList(TypeScriptParser.TypeArgumentListContext ctx) {
//        return mockImpl(ctx, "type argument list");
//    }
//
//    @Override
//    public String visitTypeArgument(TypeScriptParser.TypeArgumentContext ctx) {
//        return mockImpl(ctx, "type argument");
//    }
//
//    @Override
//    public String visitType_(TypeScriptParser.Type_Context ctx) {
//        return mockImpl(ctx, "type_");
//    }
//
//    @Override
//    public String visitIntersection(TypeScriptParser.IntersectionContext ctx) {
//        return mockImpl(ctx, "intersection");
//    }
//
//    @Override
//    public String visitPrimary(TypeScriptParser.PrimaryContext ctx) {
//        return mockImpl(ctx, "primary");
//    }
//
//    @Override
//    public String visitUnion(TypeScriptParser.UnionContext ctx) {
//        return mockImpl(ctx, "union");
//    }
//
//    @Override
//    public String visitRedefinitionOfType(TypeScriptParser.RedefinitionOfTypeContext ctx) {
//        return mockImpl(ctx, "redefinition of type");
//    }
//
//    @Override
//    public String visitPredefinedPrimType(TypeScriptParser.PredefinedPrimTypeContext ctx) {
//        return mockImpl(ctx, "predefined prim type");
//    }
//
//    @Override
//    public String visitArrayPrimType(TypeScriptParser.ArrayPrimTypeContext ctx) {
//        return mockImpl(ctx, "array prim type");
//    }
//
//    @Override
//    public String visitParenthesizedPrimType(TypeScriptParser.ParenthesizedPrimTypeContext ctx) {
//        return mockImpl(ctx, "parenthesized prim type");
//    }
//
//    @Override
//    public String visitThisPrimType(TypeScriptParser.ThisPrimTypeContext ctx) {
//        return mockImpl(ctx, "this prim type");
//    }
//
//    @Override
//    public String visitTuplePrimType(TypeScriptParser.TuplePrimTypeContext ctx) {
//        return mockImpl(ctx, "tuple prim type");
//    }
//
//    @Override
//    public String visitKeyOfType(TypeScriptParser.KeyOfTypeContext ctx) {
//        return mockImpl(ctx, "key of type");
//    }
//
//    @Override
//    public String visitObjectPrimType(TypeScriptParser.ObjectPrimTypeContext ctx) {
//        return mockImpl(ctx, "object prim type");
//    }
//
//    @Override
//    public String visitReferencePrimType(TypeScriptParser.ReferencePrimTypeContext ctx) {
//        return mockImpl(ctx, "reference prim type");
//    }
//
//    @Override
//    public String visitQueryPrimType(TypeScriptParser.QueryPrimTypeContext ctx) {
//        return mockImpl(ctx, "query prim type");
//    }
//
//    @Override
//    public String visitPredefinedType(TypeScriptParser.PredefinedTypeContext ctx) {
//        return mockImpl(ctx, "predefined type");
//    }
//
//    @Override
//    public String visitTypeReference(TypeScriptParser.TypeReferenceContext ctx) {
//        return mockImpl(ctx, "type reference");
//    }
//
//    @Override
//    public String visitTypeGeneric(TypeScriptParser.TypeGenericContext ctx) {
//        return mockImpl(ctx, "type generic");
//    }
//
//    @Override
//    public String visitTypeName(TypeScriptParser.TypeNameContext ctx) {
//        return mockImpl(ctx, "type name");
//    }
//
//    @Override
//    public String visitObjectType(TypeScriptParser.ObjectTypeContext ctx) {
//        return mockImpl(ctx, "object type");
//    }
//
//    @Override
//    public String visitTypeBody(TypeScriptParser.TypeBodyContext ctx) {
//        return mockImpl(ctx, "type body");
//    }
//
//    @Override
//    public String visitTypeMemberList(TypeScriptParser.TypeMemberListContext ctx) {
//        return mockImpl(ctx, "type member list");
//    }
//
//    @Override
//    public String visitTypeMember(TypeScriptParser.TypeMemberContext ctx) {
//        return mockImpl(ctx, "type member");
//    }
//
//    @Override
//    public String visitArrayType(TypeScriptParser.ArrayTypeContext ctx) {
//        return mockImpl(ctx, "array type");
//    }
//
//    @Override
//    public String visitTupleType(TypeScriptParser.TupleTypeContext ctx) {
//        return mockImpl(ctx, "tuple type");
//    }
//
//    @Override
//    public String visitTupleElementTypes(TypeScriptParser.TupleElementTypesContext ctx) {
//        return mockImpl(ctx, "tuple element types");
//    }
//
//    @Override
//    public String visitFunctionType(TypeScriptParser.FunctionTypeContext ctx) {
//        return mockImpl(ctx, "function type");
//    }
//
//    @Override
//    public String visitConstructorType(TypeScriptParser.ConstructorTypeContext ctx) {
//        return mockImpl(ctx, "constructor type");
//    }
//
//    @Override
//    public String visitTypeQuery(TypeScriptParser.TypeQueryContext ctx) {
//        return mockImpl(ctx, "type query");
//    }
//
//    @Override
//    public String visitTypeQueryExpression(TypeScriptParser.TypeQueryExpressionContext ctx) {
//        return mockImpl(ctx, "type query expression");
//    }
//
//    @Override
//    public String visitPropertySignatur(TypeScriptParser.PropertySignaturContext ctx) {
//        return mockImpl(ctx, "property signatur");
//    }
//
//    @Override
//    public String visitTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx) {
//        return mockImpl(ctx, "type annotation");
//    }
//
//    @Override
//    public String visitCallSignature(TypeScriptParser.CallSignatureContext ctx) {
//        return mockImpl(ctx, "call signature");
//    }
//
//    @Override
//    public String visitParameterList(TypeScriptParser.ParameterListContext ctx) {
//        return mockImpl(ctx, "parameter list");
//    }
//
//    @Override
//    public String visitRequiredParameterList(TypeScriptParser.RequiredParameterListContext ctx) {
//        return mockImpl(ctx, "required parameter list");
//    }
//
//    @Override
//    public String visitParameter(TypeScriptParser.ParameterContext ctx) {
//        return mockImpl(ctx, "parameter");
//    }
//
//    @Override
//    public String visitOptionalParameter(TypeScriptParser.OptionalParameterContext ctx) {
//        return mockImpl(ctx, "optional parameter");
//    }
//
//    @Override
//    public String visitRestParameter(TypeScriptParser.RestParameterContext ctx) {
//        return mockImpl(ctx, "rest parameter");
//    }
//
//    @Override
//    public String visitRequiredParameter(TypeScriptParser.RequiredParameterContext ctx) {
//        return mockImpl(ctx, "required parameter");
//    }
//
//    @Override
//    public String visitAccessibilityModifier(TypeScriptParser.AccessibilityModifierContext ctx) {
//        return mockImpl(ctx, "accessibility modifier");
//    }
//
//    @Override
//    public String visitIdentifierOrPattern(TypeScriptParser.IdentifierOrPatternContext ctx) {
//        return mockImpl(ctx, "identifier or pattern");
//    }
//
//    @Override
//    public String visitConstructSignature(TypeScriptParser.ConstructSignatureContext ctx) {
//        return mockImpl(ctx, "construct signature");
//    }
//
//    @Override
//    public String visitIndexSignature(TypeScriptParser.IndexSignatureContext ctx) {
//        return mockImpl(ctx, "index signature");
//    }
//
//    @Override
//    public String visitMethodSignature(TypeScriptParser.MethodSignatureContext ctx) {
//        return mockImpl(ctx, "method signature");
//    }
//
//    @Override
//    public String visitTypeAliasDeclaration(TypeScriptParser.TypeAliasDeclarationContext ctx) {
//        return mockImpl(ctx, "type alias declaration");
//    }
//
//    @Override
//    public String visitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) {
//        return mockImpl(ctx, "constructor declaration");
//    }
//
//    @Override
//    public String visitInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx) {
//        return mockImpl(ctx, "interface declaration");
//    }
//
//    @Override
//    public String visitInterfaceExtendsClause(TypeScriptParser.InterfaceExtendsClauseContext ctx) {
//        return mockImpl(ctx, "interface extends clause");
//    }
//
//    @Override
//    public String visitClassOrInterfaceTypeList(TypeScriptParser.ClassOrInterfaceTypeListContext ctx) {
//        return mockImpl(ctx, "class or interface type list");
//    }
//
//    @Override
//    public String visitEnumDeclaration(TypeScriptParser.EnumDeclarationContext ctx) {
//        return mockImpl(ctx, "enum declaration");
//    }
//
//    @Override
//    public String visitEnumBody(TypeScriptParser.EnumBodyContext ctx) {
//        return mockImpl(ctx, "enum body");
//    }
//
//    @Override
//    public String visitEnumMemberList(TypeScriptParser.EnumMemberListContext ctx) {
//        return mockImpl(ctx, "enum member list");
//    }
//
//    @Override
//    public String visitEnumMember(TypeScriptParser.EnumMemberContext ctx) {
//        return mockImpl(ctx, "enum member");
//    }
//
//    @Override
//    public String visitNamespaceDeclaration(TypeScriptParser.NamespaceDeclarationContext ctx) {
//        return mockImpl(ctx, "namespace declaration");
//    }
//
//    @Override
//    public String visitNamespaceName(TypeScriptParser.NamespaceNameContext ctx) {
//        return mockImpl(ctx, "namespace name");
//    }
//
//    @Override
//    public String visitImportAliasDeclaration(TypeScriptParser.ImportAliasDeclarationContext ctx) {
//        return mockImpl(ctx, "import alias declaration");
//    }
//
//    @Override
//    public String visitDecoratorList(TypeScriptParser.DecoratorListContext ctx) {
//        return mockImpl(ctx, "decorator list");
//    }
//
//    @Override
//    public String visitDecorator(TypeScriptParser.DecoratorContext ctx) {
//        return mockImpl(ctx, "decorator");
//    }
//
//    @Override
//    public String visitDecoratorMemberExpression(TypeScriptParser.DecoratorMemberExpressionContext ctx) {
//        return mockImpl(ctx, "decorator member expression");
//    }
//
//    @Override
//    public String visitDecoratorCallExpression(TypeScriptParser.DecoratorCallExpressionContext ctx) {
//        return mockImpl(ctx, "decorator call expression");
//    }
//
//    @Override
//    public String visitProgram(TypeScriptParser.ProgramContext ctx) {
//        return mockImpl(ctx, "program");
//    }
//
//    @Override
//    public String visitBlock(TypeScriptParser.BlockContext ctx) {
//        return mockImpl(ctx, "block");
//    }
//
//    @Override
//    public String visitStatementList(TypeScriptParser.StatementListContext ctx) {
//        return mockImpl(ctx, "statement list");
//    }
//
//    @Override
//    public String visitAbstractDeclaration(TypeScriptParser.AbstractDeclarationContext ctx) {
//        return mockImpl(ctx, "abstract declaration");
//    }
//
//    @Override
//    public String visitImportStatement(TypeScriptParser.ImportStatementContext ctx) {
//        return mockImpl(ctx, "import statement");
//    }
//
//    @Override
//    public String visitImportFromBlock(TypeScriptParser.ImportFromBlockContext ctx) {
//        return mockImpl(ctx, "import from block");
//    }
//
//    @Override
//    public String visitImportModuleItems(TypeScriptParser.ImportModuleItemsContext ctx) {
//        return mockImpl(ctx, "import module items");
//    }
//
//    @Override
//    public String visitImportAliasName(TypeScriptParser.ImportAliasNameContext ctx) {
//        return mockImpl(ctx, "import alias name");
//    }
//
//    @Override
//    public String visitModuleExportName(TypeScriptParser.ModuleExportNameContext ctx) {
//        return mockImpl(ctx, "module export name");
//    }
//
//    @Override
//    public String visitImportedBinding(TypeScriptParser.ImportedBindingContext ctx) {
//        return mockImpl(ctx, "imported binding");
//    }
//
//    @Override
//    public String visitImportDefault(TypeScriptParser.ImportDefaultContext ctx) {
//        return mockImpl(ctx, "import default");
//    }
//
//    @Override
//    public String visitImportNamespace(TypeScriptParser.ImportNamespaceContext ctx) {
//        return mockImpl(ctx, "import namespace");
//    }
//
//    @Override
//    public String visitImportFrom(TypeScriptParser.ImportFromContext ctx) {
//        return mockImpl(ctx, "import from");
//    }
//
//    @Override
//    public String visitAliasName(TypeScriptParser.AliasNameContext ctx) {
//        return mockImpl(ctx, "alias name");
//    }
//
//    @Override
//    public String visitExportStatement(TypeScriptParser.ExportStatementContext ctx) {
//        return mockImpl(ctx, "export statement");
//    }
//
//    @Override
//    public String visitExportFromBlock(TypeScriptParser.ExportFromBlockContext ctx) {
//        return mockImpl(ctx, "export from block");
//    }
//
//    @Override
//    public String visitExportModuleItems(TypeScriptParser.ExportModuleItemsContext ctx) {
//        return mockImpl(ctx, "export module items");
//    }
//
//    @Override
//    public String visitExportAliasName(TypeScriptParser.ExportAliasNameContext ctx) {
//        return mockImpl(ctx, "export alias name");
//    }
//
//    @Override
//    public String visitDeclaration(TypeScriptParser.DeclarationContext ctx) {
//        return mockImpl(ctx, "declaration");
//    }
//
//    @Override
//    public String visitVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
//        return mockImpl(ctx, "variable statement");
//    }
//
//    @Override
//    public String visitVariableDeclarationList(TypeScriptParser.VariableDeclarationListContext ctx) {
//        return mockImpl(ctx, "variable declaration list");
//    }
//
//    @Override
//    public String visitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx) {
//        return mockImpl(ctx, "variable declaration");
//    }
//
//    @Override
//    public String visitEmptyStatement_(TypeScriptParser.EmptyStatement_Context ctx) {
//        return mockImpl(ctx, "empty statement");
//    }
//
//    @Override
//    public String visitIfStatement(TypeScriptParser.IfStatementContext ctx) {
//        return mockImpl(ctx, "if statement");
//    }
//
//    @Override
//    public String visitDoStatement(TypeScriptParser.DoStatementContext ctx) {
//        return mockImpl(ctx, "do statement");
//    }
//
//    @Override
//    public String visitWhileStatement(TypeScriptParser.WhileStatementContext ctx) {
//        return mockImpl(ctx, "while statement");
//    }
//
//    @Override
//    public String visitForStatement(TypeScriptParser.ForStatementContext ctx) {
//        return mockImpl(ctx, "for statement");
//    }
//
//    @Override
//    public String visitForVarStatement(TypeScriptParser.ForVarStatementContext ctx) {
//        return mockImpl(ctx, "for var statement");
//    }
//
//    @Override
//    public String visitForInStatement(TypeScriptParser.ForInStatementContext ctx) {
//        return mockImpl(ctx, "for in statement");
//    }
//
//    @Override
//    public String visitForVarInStatement(TypeScriptParser.ForVarInStatementContext ctx) {
//        return mockImpl(ctx, "for var in statement");
//    }
//
//    @Override
//    public String visitForOfStatement(TypeScriptParser.ForOfStatementContext ctx) {
//        return mockImpl(ctx, "for of statement");
//    }
//
//    @Override
//    public String visitForVarOfStatement(TypeScriptParser.ForVarOfStatementContext ctx) {
//        return mockImpl(ctx, "for var of statement");
//    }
//
//    @Override
//    public String visitVarModifier(TypeScriptParser.VarModifierContext ctx) {
//        return mockImpl(ctx, "var modifier");
//    }
//
//    @Override
//    public String visitContinueStatement(TypeScriptParser.ContinueStatementContext ctx) {
//        return mockImpl(ctx, "continue statement");
//    }
//
//    @Override
//    public String visitBreakStatement(TypeScriptParser.BreakStatementContext ctx) {
//        return mockImpl(ctx, "break statement");
//    }
//
//    @Override
//    public String visitReturnStatement(TypeScriptParser.ReturnStatementContext ctx) {
//        return mockImpl(ctx, "return statement");
//    }
//
//    @Override
//    public String visitYieldStatement(TypeScriptParser.YieldStatementContext ctx) {
//        return mockImpl(ctx, "yield statement");
//    }
//
//    @Override
//    public String visitWithStatement(TypeScriptParser.WithStatementContext ctx) {
//        return mockImpl(ctx, "with statement");
//    }
//
//    @Override
//    public String visitSwitchStatement(TypeScriptParser.SwitchStatementContext ctx) {
//        return mockImpl(ctx, "switch statement");
//    }
//
//    @Override
//    public String visitCaseBlock(TypeScriptParser.CaseBlockContext ctx) {
//        return mockImpl(ctx, "case block");
//    }
//
//    @Override
//    public String visitCaseClauses(TypeScriptParser.CaseClausesContext ctx) {
//        return mockImpl(ctx, "case clauses");
//    }
//
//    @Override
//    public String visitCaseClause(TypeScriptParser.CaseClauseContext ctx) {
//        return mockImpl(ctx, "case clause");
//    }
//
//    @Override
//    public String visitDefaultClause(TypeScriptParser.DefaultClauseContext ctx) {
//        return mockImpl(ctx, "default clause");
//    }
//
//    @Override
//    public String visitLabelledStatement(TypeScriptParser.LabelledStatementContext ctx) {
//        return mockImpl(ctx, "labelled statement");
//    }
//
//    @Override
//    public String visitThrowStatement(TypeScriptParser.ThrowStatementContext ctx) {
//        return mockImpl(ctx, "throw statement");
//    }
//
//    @Override
//    public String visitTryStatement(TypeScriptParser.TryStatementContext ctx) {
//        return mockImpl(ctx, "try statement");
//    }
//
//    @Override
//    public String visitCatchProduction(TypeScriptParser.CatchProductionContext ctx) {
//        return mockImpl(ctx, "catch production");
//    }
//
//    @Override
//    public String visitFinallyProduction(TypeScriptParser.FinallyProductionContext ctx) {
//        return mockImpl(ctx, "finally production");
//    }
//
//    @Override
//    public String visitDebuggerStatement(TypeScriptParser.DebuggerStatementContext ctx) {
//        return mockImpl(ctx, "debugger statement");
//    }
//
//    @Override
//    public String visitFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx) {
//        return mockImpl(ctx, "function declaration");
//    }
//
//    @Override
//    public String visitClassHeritage(TypeScriptParser.ClassHeritageContext ctx) {
//        return mockImpl(ctx, "class heritage");
//    }
//
//    @Override
//    public String visitClassExtendsClause(TypeScriptParser.ClassExtendsClauseContext ctx) {
//        return mockImpl(ctx, "class extends clause");
//    }
//
//    @Override
//    public String visitImplementsClause(TypeScriptParser.ImplementsClauseContext ctx) {
//        return mockImpl(ctx, "implements clause");
//    }
//
//    @Override
//    public String visitClassElement(TypeScriptParser.ClassElementContext ctx) {
//        return mockImpl(ctx, "class element");
//    }
//
//    @Override
//    public String visitGetterSetterDeclarationExpression(TypeScriptParser.GetterSetterDeclarationExpressionContext ctx) {
//        return mockImpl(ctx, "getter setter declaration expression");
//    }
//
//    @Override
//    public String visitAbstractMemberDeclaration(TypeScriptParser.AbstractMemberDeclarationContext ctx) {
//        return mockImpl(ctx, "abstract member declaration");
//    }
//
//    @Override
//    public String visitPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx) {
//        return mockImpl(ctx, "property member base");
//    }
//
//    @Override
//    public String visitIndexMemberDeclaration(TypeScriptParser.IndexMemberDeclarationContext ctx) {
//        return mockImpl(ctx, "index member declaration");
//    }
//
//    @Override
//    public String visitGeneratorMethod(TypeScriptParser.GeneratorMethodContext ctx) {
//        return mockImpl(ctx, "generator method");
//    }
//
//    @Override
//    public String visitGeneratorFunctionDeclaration(TypeScriptParser.GeneratorFunctionDeclarationContext ctx) {
//        return mockImpl(ctx, "generator function declaration");
//    }
//
//    @Override
//    public String visitGeneratorBlock(TypeScriptParser.GeneratorBlockContext ctx) {
//        return mockImpl(ctx, "generator block");
//    }
//
//    @Override
//    public String visitGeneratorDefinition(TypeScriptParser.GeneratorDefinitionContext ctx) {
//        return mockImpl(ctx, "generator definition");
//    }
//
//    @Override
//    public String visitIteratorBlock(TypeScriptParser.IteratorBlockContext ctx) {
//        return mockImpl(ctx, "iterator block");
//    }
//
//    @Override
//    public String visitIteratorDefinition(TypeScriptParser.IteratorDefinitionContext ctx) {
//        return mockImpl(ctx, "iterator definition");
//    }
//
//    @Override
//    public String visitClassElementName(TypeScriptParser.ClassElementNameContext ctx) {
//        return mockImpl(ctx, "class element name");
//    }
//
//    @Override
//    public String visitPrivateIdentifier(TypeScriptParser.PrivateIdentifierContext ctx) {
//        return mockImpl(ctx, "private identifier");
//    }
//
//    @Override
//    public String visitFormalParameterList(TypeScriptParser.FormalParameterListContext ctx) {
//        return mockImpl(ctx, "formal parameter list");
//    }
//
//    @Override
//    public String visitFormalParameterArg(TypeScriptParser.FormalParameterArgContext ctx) {
//        return mockImpl(ctx, "formal parameter arg");
//    }
//
//    @Override
//    public String visitLastFormalParameterArg(TypeScriptParser.LastFormalParameterArgContext ctx) {
//        return mockImpl(ctx, "last formal parameter arg");
//    }
//
//    @Override
//    public String visitFunctionBody(TypeScriptParser.FunctionBodyContext ctx) {
//        return mockImpl(ctx, "function body");
//    }
//
//    @Override
//    public String visitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx) {
//        return mockImpl(ctx, "array literal");
//    }
//
//    @Override
//    public String visitElementList(TypeScriptParser.ElementListContext ctx) {
//        return mockImpl(ctx, "element list");
//    }
//
//    @Override
//    public String visitArrayElement(TypeScriptParser.ArrayElementContext ctx) {
//        return mockImpl(ctx, "array element");
//    }
//
//    @Override
//    public String visitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx) {
//        return mockImpl(ctx, "object literal");
//    }
//
//    @Override
//    public String visitPropertyExpressionAssignment(TypeScriptParser.PropertyExpressionAssignmentContext ctx) {
//        return mockImpl(ctx, "property expression assignment");
//    }
//
//    @Override
//    public String visitComputedPropertyExpressionAssignment(TypeScriptParser.ComputedPropertyExpressionAssignmentContext ctx) {
//        return mockImpl(ctx, "computed property expression assignment");
//    }
//
//    @Override
//    public String visitPropertyGetter(TypeScriptParser.PropertyGetterContext ctx) {
//        return mockImpl(ctx, "property getter");
//    }
//
//    @Override
//    public String visitPropertySetter(TypeScriptParser.PropertySetterContext ctx) {
//        return mockImpl(ctx, "property setter");
//    }
//
//    @Override
//    public String visitMethodProperty(TypeScriptParser.MethodPropertyContext ctx) {
//        return mockImpl(ctx, "method property");
//    }
//
//    @Override
//    public String visitPropertyShorthand(TypeScriptParser.PropertyShorthandContext ctx) {
//        return mockImpl(ctx, "property shorthand");
//    }
//
//    @Override
//    public String visitSpreadOperator(TypeScriptParser.SpreadOperatorContext ctx) {
//        return mockImpl(ctx, "spread operator");
//    }
//
//    @Override
//    public String visitRestParameterInObject(TypeScriptParser.RestParameterInObjectContext ctx) {
//        return mockImpl(ctx, "rest parameter in object");
//    }
//
//    @Override
//    public String visitGetAccessor(TypeScriptParser.GetAccessorContext ctx) {
//        return mockImpl(ctx, "get accessor");
//    }
//
//    @Override
//    public String visitSetAccessor(TypeScriptParser.SetAccessorContext ctx) {
//        return mockImpl(ctx, "set accessor");
//    }
//
//    @Override
//    public String visitPropertyName(TypeScriptParser.PropertyNameContext ctx) {
//        return mockImpl(ctx, "property name");
//    }
//
//    @Override
//    public String visitArguments(TypeScriptParser.ArgumentsContext ctx) {
//        return mockImpl(ctx, "arguments");
//    }
//
//    @Override
//    public String visitArgumentList(TypeScriptParser.ArgumentListContext ctx) {
//        return mockImpl(ctx, "argument list");
//    }
//
//    @Override
//    public String visitArgument(TypeScriptParser.ArgumentContext ctx) {
//        return mockImpl(ctx, "argument");
//    }
//
//    @Override
//    public String visitTemplateStringExpression(TypeScriptParser.TemplateStringExpressionContext ctx) {
//        return mockImpl(ctx, "template string expression");
//    }
//
//    @Override
//    public String visitGeneratorsExpression(TypeScriptParser.GeneratorsExpressionContext ctx) {
//        return mockImpl(ctx, "generators expression");
//    }
//
//    @Override
//    public String visitPowerExpression(TypeScriptParser.PowerExpressionContext ctx) {
//        return mockImpl(ctx, "power expression");
//    }
//
//    @Override
//    public String visitInExpression(TypeScriptParser.InExpressionContext ctx) {
//        return mockImpl(ctx, "in expression");
//    }
//
//    @Override
//    public String visitGenericTypes(TypeScriptParser.GenericTypesContext ctx) {
//        return mockImpl(ctx, "generic types");
//    }
//
//    @Override
//    public String visitOptionalChainExpression(TypeScriptParser.OptionalChainExpressionContext ctx) {
//        return mockImpl(ctx, "optional chain expression");
//    }
//
//    @Override
//    public String visitArgumentsExpression(TypeScriptParser.ArgumentsExpressionContext ctx) {
//        return mockImpl(ctx, "arguments expression");
//    }
//
//    @Override
//    public String visitThisExpression(TypeScriptParser.ThisExpressionContext ctx) {
//        return mockImpl(ctx, "this expression");
//    }
//
//    @Override
//    public String visitTypeofExpression(TypeScriptParser.TypeofExpressionContext ctx) {
//        return mockImpl(ctx, "typeof expression");
//    }
//
//    @Override
//    public String visitGeneratorsFunctionExpression(TypeScriptParser.GeneratorsFunctionExpressionContext ctx) {
//        return mockImpl(ctx, "generators function expression");
//    }
//
//    @Override
//    public String visitEqualityExpression(TypeScriptParser.EqualityExpressionContext ctx) {
//        return mockImpl(ctx, "equality expression");
//    }
//
//    @Override
//    public String visitBitXOrExpression(TypeScriptParser.BitXOrExpressionContext ctx) {
//        return mockImpl(ctx, "bit xor expression");
//    }
//
//    @Override
//    public String visitCastAsExpression(TypeScriptParser.CastAsExpressionContext ctx) {
//        return mockImpl(ctx, "cast as expression");
//    }
//
//    @Override
//    public String visitMultiplicativeExpression(TypeScriptParser.MultiplicativeExpressionContext ctx) {
//        return mockImpl(ctx, "multiplicative expression");
//    }
//
//    @Override
//    public String visitBitShiftExpression(TypeScriptParser.BitShiftExpressionContext ctx) {
//        return mockImpl(ctx, "bit shift expression");
//    }
//
//    @Override
//    public String visitAdditiveExpression(TypeScriptParser.AdditiveExpressionContext ctx) {
//        return mockImpl(ctx, "additive expression");
//    }
//
//    @Override
//    public String visitRelationalExpression(TypeScriptParser.RelationalExpressionContext ctx) {
//        return mockImpl(ctx, "relational expression");
//    }
//
//    @Override
//    public String visitBitNotExpression(TypeScriptParser.BitNotExpressionContext ctx) {
//        return mockImpl(ctx, "bit not expression");
//    }
//
//    @Override
//    public String visitNewExpression(TypeScriptParser.NewExpressionContext ctx) {
//        return mockImpl(ctx, "new expression");
//    }
//
//    @Override
//    public String visitLiteralExpression(TypeScriptParser.LiteralExpressionContext ctx) {
//        return mockImpl(ctx, "literal expression");
//    }
//
//    @Override
//    public String visitArrayLiteralExpression(TypeScriptParser.ArrayLiteralExpressionContext ctx) {
//        return mockImpl(ctx, "array literal expression");
//    }
//
//    @Override
//    public String visitMemberDotExpression(TypeScriptParser.MemberDotExpressionContext ctx) {
//        return mockImpl(ctx, "member dot expression");
//    }
//
//    @Override
//    public String visitMemberIndexExpression(TypeScriptParser.MemberIndexExpressionContext ctx) {
//        return mockImpl(ctx, "member index expression");
//    }
//
//    @Override
//    public String visitBitAndExpression(TypeScriptParser.BitAndExpressionContext ctx) {
//        return mockImpl(ctx, "bit and expression");
//    }
//
//    @Override
//    public String visitBitOrExpression(TypeScriptParser.BitOrExpressionContext ctx) {
//        return mockImpl(ctx, "bit or expression");
//    }
//
//    @Override
//    public String visitAssignmentOperatorExpression(TypeScriptParser.AssignmentOperatorExpressionContext ctx) {
//        return mockImpl(ctx, "assignment operator expression");
//    }
//
//    @Override
//    public String visitVoidExpression(TypeScriptParser.VoidExpressionContext ctx) {
//        return mockImpl(ctx, "void expression");
//    }
//
//    @Override
//    public String visitTernaryExpression(TypeScriptParser.TernaryExpressionContext ctx) {
//        return mockImpl(ctx, "ternary expression");
//    }
//
//    @Override
//    public String visitLogicalAndExpression(TypeScriptParser.LogicalAndExpressionContext ctx) {
//        return mockImpl(ctx, "logical and expression");
//    }
//
//    @Override
//    public String visitPreIncrementExpression(TypeScriptParser.PreIncrementExpressionContext ctx) {
//        return mockImpl(ctx, "pre increment expression");
//    }
//
//    @Override
//    public String visitObjectLiteralExpression(TypeScriptParser.ObjectLiteralExpressionContext ctx) {
//        return mockImpl(ctx, "object literal expression");
//    }
//
//    @Override
//    public String visitLogicalOrExpression(TypeScriptParser.LogicalOrExpressionContext ctx) {
//        return mockImpl(ctx, "logical or expression");
//    }
//
//    @Override
//    public String visitNonNullAssertionExpression(TypeScriptParser.NonNullAssertionExpressionContext ctx) {
//        return mockImpl(ctx, "non null assertion expression");
//    }
//
//    @Override
//    public String visitNotExpression(TypeScriptParser.NotExpressionContext ctx) {
//        return mockImpl(ctx, "not expression");
//    }
//
//    @Override
//    public String visitPreDecreaseExpression(TypeScriptParser.PreDecreaseExpressionContext ctx) {
//        return mockImpl(ctx, "pre decrease expression");
//    }
//
//    @Override
//    public String visitAwaitExpression(TypeScriptParser.AwaitExpressionContext ctx) {
//        return mockImpl(ctx, "await expression");
//    }
//
//    @Override
//    public String visitFunctionExpression(TypeScriptParser.FunctionExpressionContext ctx) {
//        return mockImpl(ctx, "function expression");
//    }
//
//    @Override
//    public String visitUnaryMinusExpression(TypeScriptParser.UnaryMinusExpressionContext ctx) {
//        return mockImpl(ctx, "unary minus expression");
//    }
//
//    @Override
//    public String visitAssignmentExpression(TypeScriptParser.AssignmentExpressionContext ctx) {
//        return mockImpl(ctx, "assignment expression");
//    }
//
//    @Override
//    public String visitPostDecreaseExpression(TypeScriptParser.PostDecreaseExpressionContext ctx) {
//        return mockImpl(ctx, "post decrease expression");
//    }
//
//    @Override
//    public String visitInstanceofExpression(TypeScriptParser.InstanceofExpressionContext ctx) {
//        return mockImpl(ctx, "instanceof expression");
//    }
//
//    @Override
//    public String visitUnaryPlusExpression(TypeScriptParser.UnaryPlusExpressionContext ctx) {
//        return mockImpl(ctx, "unary plus expression");
//    }
//
//    @Override
//    public String visitDeleteExpression(TypeScriptParser.DeleteExpressionContext ctx) {
//        return mockImpl(ctx, "delete expression");
//    }
//
//    @Override
//    public String visitIteratorsExpression(TypeScriptParser.IteratorsExpressionContext ctx) {
//        return mockImpl(ctx, "iterators expression");
//    }
//
//    @Override
//    public String visitSuperExpression(TypeScriptParser.SuperExpressionContext ctx) {
//        return mockImpl(ctx, "super expression");
//    }
//
//    @Override
//    public String visitParenthesizedExpression(TypeScriptParser.ParenthesizedExpressionContext ctx) {
//        return mockImpl(ctx, "parenthesized expression");
//    }
//
//    @Override
//    public String visitPostIncrementExpression(TypeScriptParser.PostIncrementExpressionContext ctx) {
//        return mockImpl(ctx, "post increment expression");
//    }
//
//    @Override
//    public String visitYieldExpression(TypeScriptParser.YieldExpressionContext ctx) {
//        return mockImpl(ctx, "yield expression");
//    }
//
//    @Override
//    public String visitClassExpression(TypeScriptParser.ClassExpressionContext ctx) {
//        return mockImpl(ctx, "class expression");
//    }
//
//    @Override
//    public String visitCoalesceExpression(TypeScriptParser.CoalesceExpressionContext ctx) {
//        return mockImpl(ctx, "coalesce expression");
//    }
//
//    @Override
//    public String visitAsExpression(TypeScriptParser.AsExpressionContext ctx) {
//        return mockImpl(ctx, "as expression");
//    }
//
//    @Override
//    public String visitAssignable(TypeScriptParser.AssignableContext ctx) {
//        return mockImpl(ctx, "assignable");
//    }
//
//    @Override
//    public String visitAnonymousFunction(TypeScriptParser.AnonymousFunctionContext ctx) {
//        return mockImpl(ctx, "anonymous function");
//    }
//
//    @Override
//    public String visitArrowFunctionDeclaration(TypeScriptParser.ArrowFunctionDeclarationContext ctx) {
//        return mockImpl(ctx, "arrow function declaration");
//    }
//
//    @Override
//    public String visitArrowFunctionParameters(TypeScriptParser.ArrowFunctionParametersContext ctx) {
//        return mockImpl(ctx, "arrow function parameters");
//    }
//
//    @Override
//    public String visitArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) {
//        return mockImpl(ctx, "arrow function body");
//    }
//
//    @Override
//    public String visitAssignmentOperator(TypeScriptParser.AssignmentOperatorContext ctx) {
//        return mockImpl(ctx, "assignment operator");
//    }
//
//    @Override
//    public String visitLiteral(TypeScriptParser.LiteralContext ctx) {
//        return mockImpl(ctx, "literal");
//    }
//
//    @Override
//    public String visitTemplateStringLiteral(TypeScriptParser.TemplateStringLiteralContext ctx) {
//        return mockImpl(ctx, "template string literal");
//    }
//
//    @Override
//    public String visitTemplateStringAtom(TypeScriptParser.TemplateStringAtomContext ctx) {
//        return mockImpl(ctx, "template string atom");
//    }
//
//    @Override
//    public String visitNumericLiteral(TypeScriptParser.NumericLiteralContext ctx) {
//        return mockImpl(ctx, "numeric literal");
//    }
//
//    @Override
//    public String visitBigintLiteral(TypeScriptParser.BigintLiteralContext ctx) {
//        return mockImpl(ctx, "bigint literal");
//    }
//
//    @Override
//    public String visitGetter(TypeScriptParser.GetterContext ctx) {
//        return mockImpl(ctx, "getter");
//    }
//
//    @Override
//    public String visitSetter(TypeScriptParser.SetterContext ctx) {
//        return mockImpl(ctx, "setter");
//    }
//
//    @Override
//    public String visitIdentifierName(TypeScriptParser.IdentifierNameContext ctx) {
//        return mockImpl(ctx, "identifier name");
//    }
//
//    @Override
//    public String visitIdentifier(TypeScriptParser.IdentifierContext ctx) {
//        return mockImpl(ctx, "identifier");
//    }
//
//    @Override
//    public String visitIdentifierOrKeyWord(TypeScriptParser.IdentifierOrKeyWordContext ctx) {
//        return mockImpl(ctx, "identifier or keyword");
//    }
//
//    @Override
//    public String visitErrorNode(ErrorNode errorNode) {
//        return errorNode.getText();
//    }
}
