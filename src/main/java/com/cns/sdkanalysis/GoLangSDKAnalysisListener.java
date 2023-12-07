package com.cns.sdkanalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.cns.grammar.GoParser;
import com.cns.grammar.GoParserBaseListener;

public class GoLangSDKAnalysisListener extends GoParserBaseListener {
    long totalUnSafeCriticalVariables = 0;
    long totalUnSafeCriticalFields = 0;
    long totalUnSafeCriticalMethods = 0;

    long totalSafeCriticalVariables = 0;
    long totalSafeCriticalFields = 0;
    long totalSafeCriticalMethods = 0;

    private static final String regexForCriticalVariable = "(?:pass|key|crypt|imei|username|identifier|secret|token|auth)" ;

    private static final String regexForIsSafeType = "(?:char|StringBuilder)";

    private static final String STRING = "String";

    /**
     * Analyzes function declarations in the Go source code for critical and safe variables in return parameters and types.
     */
    @Override
    public void enterFunctionDecl(GoParser.FunctionDeclContext functionDeclContext) {
        if (functionDeclContext.signature().result() == null) {
            return;
        }
        if (!isCriticalVariable(functionDeclContext.IDENTIFIER().getText())) {
            return;
        }

        if (functionDeclContext.signature().result().parameters() != null) {
            List<GoParser.ParameterDeclContext> paramsStrings = functionDeclContext.signature().result().parameters().parameterDecl()
                    .stream()
                    .filter(p -> p.type_().getText().equals(STRING))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Method Return Params> " + functionDeclContext.IDENTIFIER().getText());
                totalUnSafeCriticalMethods += paramsStrings.size();
            }

            paramsStrings = functionDeclContext.signature().result().parameters().parameterDecl()
                    .stream()
                    .filter(p -> isSafeType(p.type_().getText()))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Safe Method Return Params> " + functionDeclContext.IDENTIFIER().getText());
                totalSafeCriticalMethods += paramsStrings.size();
            }

        }

        if (functionDeclContext.signature().result().type_() != null) {
            if (functionDeclContext.signature().result().type_().getText().equals(STRING)) {
                System.out.println("<Method Return Type> " + functionDeclContext.IDENTIFIER().getText());
                totalUnSafeCriticalMethods++;
            }
            if (isSafeType(functionDeclContext.signature().result().type_().getText())) {
                System.out.println("<Safe Method Return Type> " + functionDeclContext.IDENTIFIER().getText());
                totalSafeCriticalMethods++;
            }
        }

    }

    /**
     * Analyzes method declarations in the Go source code for critical and safe variables in return parameters and types.
     */
    @Override
    public void enterMethodDecl(GoParser.MethodDeclContext methodDeclContext) {
        if (methodDeclContext.signature().result() == null) {
            return;
        }
        if (!isCriticalVariable(methodDeclContext.IDENTIFIER().getText())) {
            return;
        }

        if (methodDeclContext.signature().result().parameters() != null) {
            List<GoParser.ParameterDeclContext> paramsStrings = methodDeclContext.signature().result().parameters().parameterDecl()
                    .stream()
                    .filter(p -> p.type_().getText().equals(STRING))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Method Return Params> " + methodDeclContext.IDENTIFIER().getText());
                totalUnSafeCriticalMethods += paramsStrings.size();
            }

            paramsStrings = methodDeclContext.signature().result().parameters().parameterDecl()
                    .stream()
                    .filter(p -> isSafeType(p.type_().getText()))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Safe Method Return Params> " + methodDeclContext.IDENTIFIER().getText());
                totalSafeCriticalMethods += paramsStrings.size();
            }

        }

        if (methodDeclContext.signature().result().type_() != null) {
            if (methodDeclContext.signature().result().type_().getText().equals(STRING)) {
                System.out.println("<Method Return Type> " + methodDeclContext.IDENTIFIER().getText());
                totalUnSafeCriticalMethods++;
            }
            if (isSafeType(methodDeclContext.signature().result().type_().getText())) {
                System.out.println("<Safe Method Return Type> " + methodDeclContext.IDENTIFIER().getText());
                totalSafeCriticalMethods++;
            }
        }
    }

    /**
     * Analyzes struct type declarations in the Go source code for critical and safe fields.
     */
    @Override
    public void enterStructType(GoParser.StructTypeContext structTypeContext) {
        List<List<TerminalNode>> identifiers = structTypeContext.fieldDecl()
                .stream()
                .filter(var -> var.type_() != null)
                .filter(f -> f.type_().getText().equals(STRING))
                .map(f -> f.identifierList().IDENTIFIER())
                .collect(Collectors.toList());

        List<String> criticalVars = new ArrayList<>();

        for (List<TerminalNode> varNames : identifiers) {
            criticalVars.addAll(
                    varNames.stream()
                            .filter(var -> isCriticalVariable(var.getText()))
                            .map(var -> var.getText())
                            .collect(Collectors.toList()));
        }

        if (criticalVars.size() > 0) {
            System.out.println("<Struct feild> " + criticalVars);
            totalUnSafeCriticalFields += criticalVars.size();
        }

        identifiers = structTypeContext.fieldDecl()
                .stream()
                .filter(var -> var.type_() != null)
                .filter(f -> isSafeType(f.type_().getText()))
                .map(f -> f.identifierList().IDENTIFIER())
                .collect(Collectors.toList());

        criticalVars = new ArrayList<>();

        for (List<TerminalNode> varNames : identifiers) {
            criticalVars.addAll(
                    varNames.stream()
                            .filter(var -> isCriticalVariable(var.getText()))
                            .map(var -> var.getText())
                            .collect(Collectors.toList()));
        }

        if (criticalVars.size() > 0) {
            System.out.println("<Safe Struct feild> " + criticalVars);
            totalSafeCriticalFields += criticalVars.size();
        }

    }

    /**
     * Analyzes variable specifications in the Go source code for critical and safe variables.
     */
    @Override
    public void enterVarSpec(GoParser.VarSpecContext varSpecContext) {
        if (varSpecContext.type_() == null || varSpecContext.type_().getText().equals(STRING)) {
            List<String> criticalVars = varSpecContext.identifierList().IDENTIFIER().stream()
                    .filter(i -> isCriticalVariable(i.getText()))
                    .map(i -> i.getText())
                    .collect(Collectors.toList());

            if (criticalVars.size() > 0) {
                System.out.println("<Var> " + criticalVars);
                totalUnSafeCriticalVariables += criticalVars.size();
            }
        }

        if (varSpecContext.type_() == null || isSafeType(varSpecContext.type_().getText())) {
            List<String> criticalVars = varSpecContext.identifierList().IDENTIFIER().stream()
                    .filter(i -> isCriticalVariable(i.getText()))
                    .map(i -> i.getText())
                    .collect(Collectors.toList());

            if (criticalVars.size() > 0) {
                System.out.println("<Safe Var> " + criticalVars);
                totalSafeCriticalVariables += criticalVars.size();
            }
        }

    }

    /**
     * Checks if a variable is critical based on a predefined pattern.
     *
     * @param variable The variable to check.
     * @return True if the variable is critical, otherwise false.
     */
    private boolean isCriticalVariable(String variable) {
        // Strip non alpha chars
        Pattern pattern = Pattern
                .compile(
                        regexForCriticalVariable,
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(variable);
        return matcher.find();
    }

    /**
     * Checks if a variable type is considered safe based on a predefined pattern.
     *
     * @param type The variable type to check.
     * @return True if the variable type is safe, otherwise false.
     */
    private boolean isSafeType(String type) {
        Pattern pattern = Pattern
                .compile(
                        regexForIsSafeType,
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(type);
        return matcher.find();
    }

}