package br.com.kanada.osmdconverter;

import br.com.kanada.osmdconverter.ts.generated.TypeScriptParser;
import br.com.kanada.osmdconverter.ts.generated.TypeScriptParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Arrays;

public class TSQuerier {
    final OsmdConverter converter;

    public TSQuerier(OsmdConverter converter) {
        this.converter = converter;
    }

    public TSMethodInfo queryMethod(String className, String methodName) {
        //System.out.println("Querying method: " + className + "." + methodName);
        TypeScriptParser.ClassDeclarationContext classCtx = converter.classMap.get(className);
        if (classCtx != null) {
            TSMethodInfo info = new TSMethodInfo();
            info.className = className;
            info.name = methodName;
            TSMethodInfoListener listener = new TSMethodInfoListener(info);
            ParseTreeWalker.DEFAULT.walk(listener, classCtx);
            return info;
        }

        return null;
    }

    public String queryVarTypeInMethod(String className, String methodName, String variableName) {
        //System.out.println("Querying variable type in method: " + className + "." + methodName + " for variable: " + variableName);
        TypeScriptParser.ClassDeclarationContext classCtx = converter.classMap.get(className);
        if (classCtx != null) {
            VariableTypeByUseListener listener = new VariableTypeByUseListener();
            listener.className = className;
            listener.methodName = methodName;
            listener.variableName = variableName;

            ParseTreeWalker.DEFAULT.walk(listener, classCtx);

            //System.out.println("Variable type: " + listener.variableType);
            return listener.variableType;
        }

        return null;
    }

    private class TSMethodInfoListener extends TypeScriptParserBaseListener {
        private final TSMethodInfo info;

        TSMethodInfoListener(TSMethodInfo info) {
            this.info = info;
        }

        @Override
        public void enterMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
            if (ctx.propertyName().identifierName().getText().equals(info.name)) {
                info.found = true;
                info.returnType = ctx.callSignature().typeAnnotation().type_().getText();
            }
        }

        @Override
        public void exitMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
            if (info.found) {
                info.found = false;
            }
        }

        @Override
        public void enterPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx) {
            if (info.found) {
                if (ctx.Static() != null) info.staticModifier = "static";
            }
        }

        @Override
        public void enterAccessibilityModifier(TypeScriptParser.AccessibilityModifierContext ctx) {
            if (info.found) {
                if (ctx.Public() != null) info.visibility = "public";
                else if (ctx.Protected() != null) info.visibility = "protected";
                else if (ctx.Private() != null) info.visibility = "private";
            }
        }

        @Override
        public void enterRequiredParameter(TypeScriptParser.RequiredParameterContext ctx) {
            if (info.found) {
                //System.out.println("Required parameter: " + ctx.getText());
                TSMethodInfo.Parameter param = new TSMethodInfo.Parameter();
                param.optional = false;
                param.name = ctx.identifierOrPattern().getText();
                //System.out.println("Parameter name: " + param.name);
                if (ctx.typeAnnotation() != null && ctx.typeAnnotation().type_() != null) {
                    param.type = ctx.typeAnnotation().type_().getText();
                } //else {
                    //System.out.println("No type annotation for required parameter: " + param.name);
                //}

                info.parameters.add(param);
            }
        }

        @Override
        public void enterOptionalParameter(TypeScriptParser.OptionalParameterContext ctx) {
            if (info.found) {
                //System.out.println("Optional parameter: " + ctx.getText());
                TSMethodInfo.Parameter param = new TSMethodInfo.Parameter();
                param.optional = true;
                param.name = ctx.identifierOrPattern().getText();
                //System.out.println("Parameter name: " + param.name);
                if (ctx.typeAnnotation() != null && ctx.typeAnnotation().type_() != null) {
                    param.type = ctx.typeAnnotation().type_().getText();
                } //else {
                    //System.out.println("No type annotation for optional parameter: " + param.name);
                //}
                info.parameters.add(param);
            }
        }
    }

    public class VariableTypeByUseListener extends TypeScriptParserBaseListener {
        String className = null;
        String methodName = null;
        String variableType = null;
        String variableName = null;
        String functionReturnType = null;
        boolean inFunctionBody = false;
        boolean inRequiredMethod = false;

        @Override
        public void enterMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
            String currentMethodName = ctx.propertyName().identifierName().getText();
            if (currentMethodName.equals(methodName)) {
                inRequiredMethod = true;
                functionReturnType = ctx.callSignature().typeAnnotation().type_().getText();
            }
        }

        @Override
        public void exitMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) {
            inRequiredMethod = false;
        }

        @Override
        public void enterFunctionBody(TypeScriptParser.FunctionBodyContext ctx) {
            if (inRequiredMethod) {
                inFunctionBody = true;
            }
        }

        @Override
        public void exitFunctionBody(TypeScriptParser.FunctionBodyContext ctx) {
            inFunctionBody = false;
        }

        @Override
        public void enterIdentifier(TypeScriptParser.IdentifierContext ctx) {
            if (inFunctionBody && variableName.equals(ctx.getText())) {
                //System.out.println("Found variable: " + variableName + " in function body");
                ParserRuleContext currentCtx = ctx;
                while(currentCtx != null) {
                    //System.out.println("currentCtx: " + currentCtx.getClass().getName() + " " + currentCtx.getText());
                    if (currentCtx instanceof TypeScriptParser.SingleExpressionContext) {
                        String singleExpression = currentCtx.getText();
                        if ((singleExpression.endsWith("++")
                                || singleExpression.endsWith("--")
                                || singleExpression.startsWith("++")
                                || singleExpression.startsWith("--")) && variableName.length() == (singleExpression.length() - 2)) {
                            variableType = "number";
                            break;
                        } else if (("return" + variableName).equals(singleExpression)) {
                            variableType = functionReturnType;
                            break;
                        }
                    } else if (currentCtx instanceof TypeScriptParser.ArgumentListContext) {
                         String[] arguments = currentCtx.getText().split(",");
                         int variableInParameterIndex = Arrays.asList(arguments).indexOf(variableName);
                         if (variableInParameterIndex != -1) {
                             if (currentCtx.getParent() != null && currentCtx.getParent().getParent() != null && currentCtx.getParent().getParent() instanceof TypeScriptParser.ArgumentsExpressionContext) {
                                 TypeScriptParser.ArgumentsExpressionContext argumentsExpressionContext = (TypeScriptParser.ArgumentsExpressionContext) currentCtx.getParent().getParent();
                                 String text = argumentsExpressionContext.getText();

                                 if (text.startsWith("this.")) {
                                     String thisMethodName = text.substring(5, text.indexOf("("));
                                     if (!thisMethodName.equals(methodName)) {
                                         TSMethodInfo methodInfo = queryMethod(className, thisMethodName);
                                         if (methodInfo != null) {
                                             TSMethodInfo.Parameter parameter = methodInfo.parameters.get(variableInParameterIndex);
                                             variableType = parameter.type;
                                             break;
                                         }
                                     }
                                 }
                             }
                         }
                    }

                    currentCtx = currentCtx.getParent();
                }
            }
        }
    }
}
