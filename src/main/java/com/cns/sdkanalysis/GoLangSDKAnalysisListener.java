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
    public void enterFunctionDecl(GoParser.FunctionDeclContext ctx) {
        if (ctx.signature().result() == null) {
            return;
        }
        if (!isCriticalVariable(ctx.IDENTIFIER().getText())) {
            return;
        }

        if (ctx.signature().result().parameters() != null) {
            List<GoParser.ParameterDeclContext> paramsStrings = ctx.signature().result().parameters().parameterDecl()
                    .stream()
                    .filter(p -> p.type_().getText().equals("String"))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Method Return Params> " + ctx.IDENTIFIER().getText());
                totalUnSafeCriticalMethods += paramsStrings.size();
            }

            paramsStrings = ctx.signature().result().parameters().parameterDecl()
                    .stream()
                    .filter(p -> isSafeType(p.type_().getText()))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Safe Method Return Params> " + ctx.IDENTIFIER().getText());
                totalSafeCriticalMethods += paramsStrings.size();
            }

        }

        if (ctx.signature().result().type_() != null) {
            if (ctx.signature().result().type_().getText().equals("String")) {
                System.out.println("<Method Return Type> " + ctx.IDENTIFIER().getText());
                totalUnSafeCriticalMethods++;
            }
            if (isSafeType(ctx.signature().result().type_().getText())) {
                System.out.println("<Safe Method Return Type> " + ctx.IDENTIFIER().getText());
                totalSafeCriticalMethods++;
            }
        }

    }

    /**
     * Analyzes method declarations in the Go source code for critical and safe variables in return parameters and types.
     */
    @Override
    public void enterMethodDecl(GoParser.MethodDeclContext ctx) {
        if (ctx.signature().result() == null) {
            return;
        }
        if (!isCriticalVariable(ctx.IDENTIFIER().getText())) {
            return;
        }

        if (ctx.signature().result().parameters() != null) {
            List<GoParser.ParameterDeclContext> paramsStrings = ctx.signature().result().parameters().parameterDecl()
                    .stream()
                    .filter(p -> p.type_().getText().equals("String"))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Method Return Params> " + ctx.IDENTIFIER().getText());
                totalUnSafeCriticalMethods += paramsStrings.size();
            }

            paramsStrings = ctx.signature().result().parameters().parameterDecl()
                    .stream()
                    .filter(p -> isSafeType(p.type_().getText()))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Safe Method Return Params> " + ctx.IDENTIFIER().getText());
                totalSafeCriticalMethods += paramsStrings.size();
            }

        }

        if (ctx.signature().result().type_() != null) {
            if (ctx.signature().result().type_().getText().equals("String")) {
                System.out.println("<Method Return Type> " + ctx.IDENTIFIER().getText());
                totalUnSafeCriticalMethods++;
            }
            if (isSafeType(ctx.signature().result().type_().getText())) {
                System.out.println("<Safe Method Return Type> " + ctx.IDENTIFIER().getText());
                totalSafeCriticalMethods++;
            }
        }
    }

    /**
     * Analyzes struct type declarations in the Go source code for critical and safe fields.
     */
    @Override
    public void enterStructType(GoParser.StructTypeContext ctx) {
        List<List<TerminalNode>> identifiers = ctx.fieldDecl()
                .stream()
                .filter(var -> var.type_() != null)
                .filter(f -> f.type_().getText().equals("String"))
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

        identifiers = ctx.fieldDecl()
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
    public void enterVarSpec(GoParser.VarSpecContext ctx) {
        if (ctx.type_() == null || ctx.type_().getText().equals("String")) {
            List<String> criticalVars = ctx.identifierList().IDENTIFIER().stream()
                    .filter(i -> isCriticalVariable(i.getText()))
                    .map(i -> i.getText())
                    .collect(Collectors.toList());

            if (criticalVars.size() > 0) {
                System.out.println("<Var> " + criticalVars);
                totalUnSafeCriticalVariables += criticalVars.size();
            }
        }

        if (ctx.type_() == null || isSafeType(ctx.type_().getText())) {
            List<String> criticalVars = ctx.identifierList().IDENTIFIER().stream()
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
     * @param var The variable to check.
     * @return True if the variable is critical, otherwise false.
     */
    private boolean isCriticalVariable(String var) {
        // Strip non alpha chars
        Pattern pattern = Pattern
                .compile(
                        "(?:pass|key|crypt|imei|username|identifier|secret|token|auth|userid)",
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(var);
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
                        "(?:byte|rune)",
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(type);
        return matcher.find();
    }

}