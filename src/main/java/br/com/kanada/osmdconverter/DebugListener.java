package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.Arrays;

public class DebugListener implements OsmdConverterTSListener {
    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        writeString("vistTerminal: " + terminalNode.getSymbol().getText() + "\n");
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        writeString("visitErrorNode: " + errorNode.toString() + "\n");
    }

    private final OsmdConverter converter;
    private String originalFileName;
    private String newFileName;
    private Writer out;

    public DebugListener(OsmdConverter converter) {
        this.converter = converter;
        out = null;
    }

    @Override
    public void setFileName(String fileName) {
        System.out.println("----------------------- DebugListener.setFileName: " + fileName + " ----------------------------");
        System.out.println("----------------------- DebugListener.setFileName: " + fileName + " ----------------------------");

        this.originalFileName = fileName;
        this.newFileName = fileName.replace(".ts", ".log");
        out = null;
        System.out.println("DartGeneratorFromTSListener.setFileName: " + fileName);


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

    }

    @Override
    public void enterInitializer(TypeScriptParser.InitializerContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitInitializer(TypeScriptParser.InitializerContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBindingPattern(TypeScriptParser.BindingPatternContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBindingPattern(TypeScriptParser.BindingPatternContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeParameters(TypeScriptParser.TypeParametersContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeParameters(TypeScriptParser.TypeParametersContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeParameterList(TypeScriptParser.TypeParameterListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeParameterList(TypeScriptParser.TypeParameterListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeParameter(TypeScriptParser.TypeParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeParameter(TypeScriptParser.TypeParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterConstraint(TypeScriptParser.ConstraintContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitConstraint(TypeScriptParser.ConstraintContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeArguments(TypeScriptParser.TypeArgumentsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeArguments(TypeScriptParser.TypeArgumentsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeArgumentList(TypeScriptParser.TypeArgumentListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeArgumentList(TypeScriptParser.TypeArgumentListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeArgument(TypeScriptParser.TypeArgumentContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeArgument(TypeScriptParser.TypeArgumentContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterType_(TypeScriptParser.Type_Context ctx) {
        writeString(ctx);
    }

    @Override
    public void exitType_(TypeScriptParser.Type_Context ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIntersection(TypeScriptParser.IntersectionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIntersection(TypeScriptParser.IntersectionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPrimary(TypeScriptParser.PrimaryContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPrimary(TypeScriptParser.PrimaryContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterUnion(TypeScriptParser.UnionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitUnion(TypeScriptParser.UnionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterRedefinitionOfType(TypeScriptParser.RedefinitionOfTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitRedefinitionOfType(TypeScriptParser.RedefinitionOfTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPredefinedPrimType(TypeScriptParser.PredefinedPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPredefinedPrimType(TypeScriptParser.PredefinedPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArrayPrimType(TypeScriptParser.ArrayPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArrayPrimType(TypeScriptParser.ArrayPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterParenthesizedPrimType(TypeScriptParser.ParenthesizedPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitParenthesizedPrimType(TypeScriptParser.ParenthesizedPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterThisPrimType(TypeScriptParser.ThisPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitThisPrimType(TypeScriptParser.ThisPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTuplePrimType(TypeScriptParser.TuplePrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTuplePrimType(TypeScriptParser.TuplePrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterKeyOfType(TypeScriptParser.KeyOfTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitKeyOfType(TypeScriptParser.KeyOfTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterObjectPrimType(TypeScriptParser.ObjectPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitObjectPrimType(TypeScriptParser.ObjectPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterReferencePrimType(TypeScriptParser.ReferencePrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitReferencePrimType(TypeScriptParser.ReferencePrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterQueryPrimType(TypeScriptParser.QueryPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitQueryPrimType(TypeScriptParser.QueryPrimTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPredefinedType(TypeScriptParser.PredefinedTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPredefinedType(TypeScriptParser.PredefinedTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeReference(TypeScriptParser.TypeReferenceContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeReference(TypeScriptParser.TypeReferenceContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeGeneric(TypeScriptParser.TypeGenericContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeGeneric(TypeScriptParser.TypeGenericContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeName(TypeScriptParser.TypeNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeName(TypeScriptParser.TypeNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterObjectType(TypeScriptParser.ObjectTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitObjectType(TypeScriptParser.ObjectTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeBody(TypeScriptParser.TypeBodyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeBody(TypeScriptParser.TypeBodyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeMemberList(TypeScriptParser.TypeMemberListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeMemberList(TypeScriptParser.TypeMemberListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeMember(TypeScriptParser.TypeMemberContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeMember(TypeScriptParser.TypeMemberContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArrayType(TypeScriptParser.ArrayTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArrayType(TypeScriptParser.ArrayTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTupleType(TypeScriptParser.TupleTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTupleType(TypeScriptParser.TupleTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTupleElementTypes(TypeScriptParser.TupleElementTypesContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTupleElementTypes(TypeScriptParser.TupleElementTypesContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterFunctionType(TypeScriptParser.FunctionTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitFunctionType(TypeScriptParser.FunctionTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterConstructorType(TypeScriptParser.ConstructorTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitConstructorType(TypeScriptParser.ConstructorTypeContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeQuery(TypeScriptParser.TypeQueryContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeQuery(TypeScriptParser.TypeQueryContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeQueryExpression(TypeScriptParser.TypeQueryExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeQueryExpression(TypeScriptParser.TypeQueryExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPropertySignatur(TypeScriptParser.PropertySignaturContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPropertySignatur(TypeScriptParser.PropertySignaturContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterCallSignature(TypeScriptParser.CallSignatureContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitCallSignature(TypeScriptParser.CallSignatureContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterParameterList(TypeScriptParser.ParameterListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitParameterList(TypeScriptParser.ParameterListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterRequiredParameterList(TypeScriptParser.RequiredParameterListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitRequiredParameterList(TypeScriptParser.RequiredParameterListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterParameter(TypeScriptParser.ParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitParameter(TypeScriptParser.ParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterOptionalParameter(TypeScriptParser.OptionalParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitOptionalParameter(TypeScriptParser.OptionalParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterRestParameter(TypeScriptParser.RestParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitRestParameter(TypeScriptParser.RestParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterRequiredParameter(TypeScriptParser.RequiredParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitRequiredParameter(TypeScriptParser.RequiredParameterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAccessibilityModifier(TypeScriptParser.AccessibilityModifierContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAccessibilityModifier(TypeScriptParser.AccessibilityModifierContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIdentifierOrPattern(TypeScriptParser.IdentifierOrPatternContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIdentifierOrPattern(TypeScriptParser.IdentifierOrPatternContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterConstructSignature(TypeScriptParser.ConstructSignatureContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitConstructSignature(TypeScriptParser.ConstructSignatureContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIndexSignature(TypeScriptParser.IndexSignatureContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIndexSignature(TypeScriptParser.IndexSignatureContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterMethodSignature(TypeScriptParser.MethodSignatureContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitMethodSignature(TypeScriptParser.MethodSignatureContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeAliasDeclaration(TypeScriptParser.TypeAliasDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeAliasDeclaration(TypeScriptParser.TypeAliasDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterInterfaceExtendsClause(TypeScriptParser.InterfaceExtendsClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitInterfaceExtendsClause(TypeScriptParser.InterfaceExtendsClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterClassOrInterfaceTypeList(TypeScriptParser.ClassOrInterfaceTypeListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitClassOrInterfaceTypeList(TypeScriptParser.ClassOrInterfaceTypeListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterEnumDeclaration(TypeScriptParser.EnumDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitEnumDeclaration(TypeScriptParser.EnumDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterEnumBody(TypeScriptParser.EnumBodyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitEnumBody(TypeScriptParser.EnumBodyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterEnumMemberList(TypeScriptParser.EnumMemberListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitEnumMemberList(TypeScriptParser.EnumMemberListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterEnumMember(TypeScriptParser.EnumMemberContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitEnumMember(TypeScriptParser.EnumMemberContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterNamespaceDeclaration(TypeScriptParser.NamespaceDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitNamespaceDeclaration(TypeScriptParser.NamespaceDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterNamespaceName(TypeScriptParser.NamespaceNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitNamespaceName(TypeScriptParser.NamespaceNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportAliasDeclaration(TypeScriptParser.ImportAliasDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportAliasDeclaration(TypeScriptParser.ImportAliasDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDecoratorList(TypeScriptParser.DecoratorListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDecoratorList(TypeScriptParser.DecoratorListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDecorator(TypeScriptParser.DecoratorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDecorator(TypeScriptParser.DecoratorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDecoratorMemberExpression(TypeScriptParser.DecoratorMemberExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDecoratorMemberExpression(TypeScriptParser.DecoratorMemberExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDecoratorCallExpression(TypeScriptParser.DecoratorCallExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDecoratorCallExpression(TypeScriptParser.DecoratorCallExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterProgram(TypeScriptParser.ProgramContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitProgram(TypeScriptParser.ProgramContext ctx) {
        writeString(ctx);
    }

    //@Override
    //public void enterSourceElement(TypeScriptParser.SourceElementContext ctx) {
    //    writeString(ctx);
    //}

    //@Override
    //public void exitSourceElement(TypeScriptParser.SourceElementContext ctx) {
    //    writeString(ctx);
    //}

    @Override
    public void enterStatement(TypeScriptParser.StatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitStatement(TypeScriptParser.StatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBlock(TypeScriptParser.BlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBlock(TypeScriptParser.BlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterStatementList(TypeScriptParser.StatementListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitStatementList(TypeScriptParser.StatementListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAbstractDeclaration(TypeScriptParser.AbstractDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAbstractDeclaration(TypeScriptParser.AbstractDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportStatement(TypeScriptParser.ImportStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportStatement(TypeScriptParser.ImportStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportFromBlock(TypeScriptParser.ImportFromBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportFromBlock(TypeScriptParser.ImportFromBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportModuleItems(TypeScriptParser.ImportModuleItemsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportModuleItems(TypeScriptParser.ImportModuleItemsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportAliasName(TypeScriptParser.ImportAliasNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportAliasName(TypeScriptParser.ImportAliasNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterModuleExportName(TypeScriptParser.ModuleExportNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitModuleExportName(TypeScriptParser.ModuleExportNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportedBinding(TypeScriptParser.ImportedBindingContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportedBinding(TypeScriptParser.ImportedBindingContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportDefault(TypeScriptParser.ImportDefaultContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportDefault(TypeScriptParser.ImportDefaultContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportNamespace(TypeScriptParser.ImportNamespaceContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportNamespace(TypeScriptParser.ImportNamespaceContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImportFrom(TypeScriptParser.ImportFromContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImportFrom(TypeScriptParser.ImportFromContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAliasName(TypeScriptParser.AliasNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAliasName(TypeScriptParser.AliasNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterExportStatement(TypeScriptParser.ExportStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitExportStatement(TypeScriptParser.ExportStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterExportFromBlock(TypeScriptParser.ExportFromBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitExportFromBlock(TypeScriptParser.ExportFromBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterExportModuleItems(TypeScriptParser.ExportModuleItemsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitExportModuleItems(TypeScriptParser.ExportModuleItemsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterExportAliasName(TypeScriptParser.ExportAliasNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitExportAliasName(TypeScriptParser.ExportAliasNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDeclaration(TypeScriptParser.DeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDeclaration(TypeScriptParser.DeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDeclareModule(TypeScriptParser.DeclareModuleContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDeclareModule(TypeScriptParser.DeclareModuleContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterNamespaceElementList(TypeScriptParser.NamespaceElementListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitNamespaceElementList(TypeScriptParser.NamespaceElementListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterNamespaceElement(TypeScriptParser.NamespaceElementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitNamespaceElement(TypeScriptParser.NamespaceElementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitVariableStatement(TypeScriptParser.VariableStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterVariableDeclarationList(TypeScriptParser.VariableDeclarationListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitVariableDeclarationList(TypeScriptParser.VariableDeclarationListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterEmptyStatement_(TypeScriptParser.EmptyStatement_Context ctx) {
        writeString(ctx);
    }

    @Override
    public void exitEmptyStatement_(TypeScriptParser.EmptyStatement_Context ctx) {
        writeString(ctx);
    }

    @Override
    public void enterExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIfStatement(TypeScriptParser.IfStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIfStatement(TypeScriptParser.IfStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDoStatement(TypeScriptParser.DoStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDoStatement(TypeScriptParser.DoStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterWhileStatement(TypeScriptParser.WhileStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitWhileStatement(TypeScriptParser.WhileStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterForStatement(TypeScriptParser.ForStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitForStatement(TypeScriptParser.ForStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterForVarStatement(TypeScriptParser.ForVarStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitForVarStatement(TypeScriptParser.ForVarStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterForInStatement(TypeScriptParser.ForInStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitForInStatement(TypeScriptParser.ForInStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterForVarInStatement(TypeScriptParser.ForVarInStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitForVarInStatement(TypeScriptParser.ForVarInStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterForOfStatement(TypeScriptParser.ForOfStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitForOfStatement(TypeScriptParser.ForOfStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterForVarOfStatement(TypeScriptParser.ForVarOfStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitForVarOfStatement(TypeScriptParser.ForVarOfStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterVarModifier(TypeScriptParser.VarModifierContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitVarModifier(TypeScriptParser.VarModifierContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterContinueStatement(TypeScriptParser.ContinueStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitContinueStatement(TypeScriptParser.ContinueStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBreakStatement(TypeScriptParser.BreakStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBreakStatement(TypeScriptParser.BreakStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterReturnStatement(TypeScriptParser.ReturnStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitReturnStatement(TypeScriptParser.ReturnStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterYieldStatement(TypeScriptParser.YieldStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitYieldStatement(TypeScriptParser.YieldStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterWithStatement(TypeScriptParser.WithStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitWithStatement(TypeScriptParser.WithStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterSwitchStatement(TypeScriptParser.SwitchStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitSwitchStatement(TypeScriptParser.SwitchStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterCaseBlock(TypeScriptParser.CaseBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitCaseBlock(TypeScriptParser.CaseBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterCaseClauses(TypeScriptParser.CaseClausesContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitCaseClauses(TypeScriptParser.CaseClausesContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterCaseClause(TypeScriptParser.CaseClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitCaseClause(TypeScriptParser.CaseClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDefaultClause(TypeScriptParser.DefaultClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDefaultClause(TypeScriptParser.DefaultClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterLabelledStatement(TypeScriptParser.LabelledStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitLabelledStatement(TypeScriptParser.LabelledStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterThrowStatement(TypeScriptParser.ThrowStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitThrowStatement(TypeScriptParser.ThrowStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTryStatement(TypeScriptParser.TryStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTryStatement(TypeScriptParser.TryStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterCatchProduction(TypeScriptParser.CatchProductionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitCatchProduction(TypeScriptParser.CatchProductionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterFinallyProduction(TypeScriptParser.FinallyProductionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitFinallyProduction(TypeScriptParser.FinallyProductionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDebuggerStatement(TypeScriptParser.DebuggerStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDebuggerStatement(TypeScriptParser.DebuggerStatementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterClassHeritage(TypeScriptParser.ClassHeritageContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitClassHeritage(TypeScriptParser.ClassHeritageContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterClassTail(TypeScriptParser.ClassTailContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitClassTail(TypeScriptParser.ClassTailContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterClassExtendsClause(TypeScriptParser.ClassExtendsClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitClassExtendsClause(TypeScriptParser.ClassExtendsClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterImplementsClause(TypeScriptParser.ImplementsClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitImplementsClause(TypeScriptParser.ImplementsClauseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterClassElement(TypeScriptParser.ClassElementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitClassElement(TypeScriptParser.ClassElementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPropertyDeclarationExpression(TypeScriptParser.PropertyDeclarationExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPropertyDeclarationExpression(TypeScriptParser.PropertyDeclarationExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGetterSetterDeclarationExpression(TypeScriptParser.GetterSetterDeclarationExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGetterSetterDeclarationExpression(TypeScriptParser.GetterSetterDeclarationExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAbstractMemberDeclaration(TypeScriptParser.AbstractMemberDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAbstractMemberDeclaration(TypeScriptParser.AbstractMemberDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIndexMemberDeclaration(TypeScriptParser.IndexMemberDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIndexMemberDeclaration(TypeScriptParser.IndexMemberDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGeneratorMethod(TypeScriptParser.GeneratorMethodContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGeneratorMethod(TypeScriptParser.GeneratorMethodContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGeneratorFunctionDeclaration(TypeScriptParser.GeneratorFunctionDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGeneratorFunctionDeclaration(TypeScriptParser.GeneratorFunctionDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGeneratorBlock(TypeScriptParser.GeneratorBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGeneratorBlock(TypeScriptParser.GeneratorBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGeneratorDefinition(TypeScriptParser.GeneratorDefinitionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGeneratorDefinition(TypeScriptParser.GeneratorDefinitionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIteratorBlock(TypeScriptParser.IteratorBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIteratorBlock(TypeScriptParser.IteratorBlockContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIteratorDefinition(TypeScriptParser.IteratorDefinitionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIteratorDefinition(TypeScriptParser.IteratorDefinitionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterClassElementName(TypeScriptParser.ClassElementNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitClassElementName(TypeScriptParser.ClassElementNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPrivateIdentifier(TypeScriptParser.PrivateIdentifierContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPrivateIdentifier(TypeScriptParser.PrivateIdentifierContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterFormalParameterList(TypeScriptParser.FormalParameterListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitFormalParameterList(TypeScriptParser.FormalParameterListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterFormalParameterArg(TypeScriptParser.FormalParameterArgContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitFormalParameterArg(TypeScriptParser.FormalParameterArgContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterLastFormalParameterArg(TypeScriptParser.LastFormalParameterArgContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitLastFormalParameterArg(TypeScriptParser.LastFormalParameterArgContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterFunctionBody(TypeScriptParser.FunctionBodyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitFunctionBody(TypeScriptParser.FunctionBodyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterSourceElements(TypeScriptParser.SourceElementsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitSourceElements(TypeScriptParser.SourceElementsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterElementList(TypeScriptParser.ElementListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitElementList(TypeScriptParser.ElementListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArrayElement(TypeScriptParser.ArrayElementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArrayElement(TypeScriptParser.ArrayElementContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPropertyExpressionAssignment(TypeScriptParser.PropertyExpressionAssignmentContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPropertyExpressionAssignment(TypeScriptParser.PropertyExpressionAssignmentContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterComputedPropertyExpressionAssignment(TypeScriptParser.ComputedPropertyExpressionAssignmentContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitComputedPropertyExpressionAssignment(TypeScriptParser.ComputedPropertyExpressionAssignmentContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPropertyGetter(TypeScriptParser.PropertyGetterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPropertyGetter(TypeScriptParser.PropertyGetterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPropertySetter(TypeScriptParser.PropertySetterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPropertySetter(TypeScriptParser.PropertySetterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterMethodProperty(TypeScriptParser.MethodPropertyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitMethodProperty(TypeScriptParser.MethodPropertyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPropertyShorthand(TypeScriptParser.PropertyShorthandContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPropertyShorthand(TypeScriptParser.PropertyShorthandContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterSpreadOperator(TypeScriptParser.SpreadOperatorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitSpreadOperator(TypeScriptParser.SpreadOperatorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterRestParameterInObject(TypeScriptParser.RestParameterInObjectContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitRestParameterInObject(TypeScriptParser.RestParameterInObjectContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterFunctionMethodProperty(TypeScriptParser.FunctionMethodPropertyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitFunctionMethodProperty(TypeScriptParser.FunctionMethodPropertyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGetAccessor(TypeScriptParser.GetAccessorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGetAccessor(TypeScriptParser.GetAccessorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterSetAccessor(TypeScriptParser.SetAccessorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitSetAccessor(TypeScriptParser.SetAccessorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPropertyName(TypeScriptParser.PropertyNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPropertyName(TypeScriptParser.PropertyNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArguments(TypeScriptParser.ArgumentsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArguments(TypeScriptParser.ArgumentsContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArgumentList(TypeScriptParser.ArgumentListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArgumentList(TypeScriptParser.ArgumentListContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArgument(TypeScriptParser.ArgumentContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArgument(TypeScriptParser.ArgumentContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTemplateStringExpression(TypeScriptParser.TemplateStringExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTemplateStringExpression(TypeScriptParser.TemplateStringExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGeneratorsExpression(TypeScriptParser.GeneratorsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGeneratorsExpression(TypeScriptParser.GeneratorsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPowerExpression(TypeScriptParser.PowerExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPowerExpression(TypeScriptParser.PowerExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterInExpression(TypeScriptParser.InExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitInExpression(TypeScriptParser.InExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGenericTypes(TypeScriptParser.GenericTypesContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGenericTypes(TypeScriptParser.GenericTypesContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterOptionalChainExpression(TypeScriptParser.OptionalChainExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitOptionalChainExpression(TypeScriptParser.OptionalChainExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArgumentsExpression(TypeScriptParser.ArgumentsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArgumentsExpression(TypeScriptParser.ArgumentsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterThisExpression(TypeScriptParser.ThisExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitThisExpression(TypeScriptParser.ThisExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTypeofExpression(TypeScriptParser.TypeofExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTypeofExpression(TypeScriptParser.TypeofExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGeneratorsFunctionExpression(TypeScriptParser.GeneratorsFunctionExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGeneratorsFunctionExpression(TypeScriptParser.GeneratorsFunctionExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterEqualityExpression(TypeScriptParser.EqualityExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitEqualityExpression(TypeScriptParser.EqualityExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBitXOrExpression(TypeScriptParser.BitXOrExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBitXOrExpression(TypeScriptParser.BitXOrExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterCastAsExpression(TypeScriptParser.CastAsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitCastAsExpression(TypeScriptParser.CastAsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterMultiplicativeExpression(TypeScriptParser.MultiplicativeExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitMultiplicativeExpression(TypeScriptParser.MultiplicativeExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBitShiftExpression(TypeScriptParser.BitShiftExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBitShiftExpression(TypeScriptParser.BitShiftExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAdditiveExpression(TypeScriptParser.AdditiveExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAdditiveExpression(TypeScriptParser.AdditiveExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterRelationalExpression(TypeScriptParser.RelationalExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitRelationalExpression(TypeScriptParser.RelationalExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBitNotExpression(TypeScriptParser.BitNotExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBitNotExpression(TypeScriptParser.BitNotExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterNewExpression(TypeScriptParser.NewExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitNewExpression(TypeScriptParser.NewExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterLiteralExpression(TypeScriptParser.LiteralExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitLiteralExpression(TypeScriptParser.LiteralExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArrayLiteralExpression(TypeScriptParser.ArrayLiteralExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArrayLiteralExpression(TypeScriptParser.ArrayLiteralExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterMemberDotExpression(TypeScriptParser.MemberDotExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitMemberDotExpression(TypeScriptParser.MemberDotExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterMemberIndexExpression(TypeScriptParser.MemberIndexExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitMemberIndexExpression(TypeScriptParser.MemberIndexExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBitAndExpression(TypeScriptParser.BitAndExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBitAndExpression(TypeScriptParser.BitAndExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBitOrExpression(TypeScriptParser.BitOrExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBitOrExpression(TypeScriptParser.BitOrExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAssignmentOperatorExpression(TypeScriptParser.AssignmentOperatorExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAssignmentOperatorExpression(TypeScriptParser.AssignmentOperatorExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterVoidExpression(TypeScriptParser.VoidExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitVoidExpression(TypeScriptParser.VoidExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTernaryExpression(TypeScriptParser.TernaryExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTernaryExpression(TypeScriptParser.TernaryExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterLogicalAndExpression(TypeScriptParser.LogicalAndExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitLogicalAndExpression(TypeScriptParser.LogicalAndExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPreIncrementExpression(TypeScriptParser.PreIncrementExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPreIncrementExpression(TypeScriptParser.PreIncrementExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterObjectLiteralExpression(TypeScriptParser.ObjectLiteralExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitObjectLiteralExpression(TypeScriptParser.ObjectLiteralExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterLogicalOrExpression(TypeScriptParser.LogicalOrExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitLogicalOrExpression(TypeScriptParser.LogicalOrExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterNonNullAssertionExpression(TypeScriptParser.NonNullAssertionExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitNonNullAssertionExpression(TypeScriptParser.NonNullAssertionExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterNotExpression(TypeScriptParser.NotExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitNotExpression(TypeScriptParser.NotExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPreDecreaseExpression(TypeScriptParser.PreDecreaseExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPreDecreaseExpression(TypeScriptParser.PreDecreaseExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAwaitExpression(TypeScriptParser.AwaitExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAwaitExpression(TypeScriptParser.AwaitExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterFunctionExpression(TypeScriptParser.FunctionExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitFunctionExpression(TypeScriptParser.FunctionExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterUnaryMinusExpression(TypeScriptParser.UnaryMinusExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitUnaryMinusExpression(TypeScriptParser.UnaryMinusExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAssignmentExpression(TypeScriptParser.AssignmentExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAssignmentExpression(TypeScriptParser.AssignmentExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPostDecreaseExpression(TypeScriptParser.PostDecreaseExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPostDecreaseExpression(TypeScriptParser.PostDecreaseExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterInstanceofExpression(TypeScriptParser.InstanceofExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitInstanceofExpression(TypeScriptParser.InstanceofExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterUnaryPlusExpression(TypeScriptParser.UnaryPlusExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitUnaryPlusExpression(TypeScriptParser.UnaryPlusExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterDeleteExpression(TypeScriptParser.DeleteExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitDeleteExpression(TypeScriptParser.DeleteExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIteratorsExpression(TypeScriptParser.IteratorsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIteratorsExpression(TypeScriptParser.IteratorsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterSuperExpression(TypeScriptParser.SuperExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitSuperExpression(TypeScriptParser.SuperExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterParenthesizedExpression(TypeScriptParser.ParenthesizedExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitParenthesizedExpression(TypeScriptParser.ParenthesizedExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterPostIncrementExpression(TypeScriptParser.PostIncrementExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitPostIncrementExpression(TypeScriptParser.PostIncrementExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterYieldExpression(TypeScriptParser.YieldExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitYieldExpression(TypeScriptParser.YieldExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterClassExpression(TypeScriptParser.ClassExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitClassExpression(TypeScriptParser.ClassExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIdentifierExpression(TypeScriptParser.IdentifierExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIdentifierExpression(TypeScriptParser.IdentifierExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterCoalesceExpression(TypeScriptParser.CoalesceExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitCoalesceExpression(TypeScriptParser.CoalesceExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAsExpression(TypeScriptParser.AsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAsExpression(TypeScriptParser.AsExpressionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAssignable(TypeScriptParser.AssignableContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAssignable(TypeScriptParser.AssignableContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAnonymousFunction(TypeScriptParser.AnonymousFunctionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAnonymousFunction(TypeScriptParser.AnonymousFunctionContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArrowFunctionDeclaration(TypeScriptParser.ArrowFunctionDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArrowFunctionDeclaration(TypeScriptParser.ArrowFunctionDeclarationContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArrowFunctionParameters(TypeScriptParser.ArrowFunctionParametersContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArrowFunctionParameters(TypeScriptParser.ArrowFunctionParametersContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterAssignmentOperator(TypeScriptParser.AssignmentOperatorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitAssignmentOperator(TypeScriptParser.AssignmentOperatorContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterLiteral(TypeScriptParser.LiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitLiteral(TypeScriptParser.LiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTemplateStringLiteral(TypeScriptParser.TemplateStringLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTemplateStringLiteral(TypeScriptParser.TemplateStringLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterTemplateStringAtom(TypeScriptParser.TemplateStringAtomContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitTemplateStringAtom(TypeScriptParser.TemplateStringAtomContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterNumericLiteral(TypeScriptParser.NumericLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitNumericLiteral(TypeScriptParser.NumericLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterBigintLiteral(TypeScriptParser.BigintLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitBigintLiteral(TypeScriptParser.BigintLiteralContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterGetter(TypeScriptParser.GetterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitGetter(TypeScriptParser.GetterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterSetter(TypeScriptParser.SetterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitSetter(TypeScriptParser.SetterContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIdentifierName(TypeScriptParser.IdentifierNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIdentifierName(TypeScriptParser.IdentifierNameContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIdentifier(TypeScriptParser.IdentifierContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIdentifier(TypeScriptParser.IdentifierContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterIdentifierOrKeyWord(TypeScriptParser.IdentifierOrKeyWordContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitIdentifierOrKeyWord(TypeScriptParser.IdentifierOrKeyWordContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterReservedWord(TypeScriptParser.ReservedWordContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitReservedWord(TypeScriptParser.ReservedWordContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterKeyword(TypeScriptParser.KeywordContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitKeyword(TypeScriptParser.KeywordContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterEos(TypeScriptParser.EosContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitEos(TypeScriptParser.EosContext ctx) {
        writeString(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        writeString(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        writeString(ctx);
    }

    private void writeString(RuleContext ctx) {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];//maybe this number needs to be corrected
        String methodName = e.getMethodName();
        String str = "Method name: " + methodName + " rule name: " + TypeScriptParser.ruleNames[ctx.getRuleIndex()] + " text: '" +  ctx.getText()
                + " tree: " + ctx.toStringTree(Arrays.asList(TypeScriptParser.ruleNames)) + "\n";
        writeString(str);
    }

    private void writeString(String str) {
        try {
            System.out.print(str);
            out.write(str);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
