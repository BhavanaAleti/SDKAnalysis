package com.cns.sdkanalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.TerminalNode;

import com.cns.grammar.GoParser;
import com.cns.grammar.GoParserBaseListener;

public class GoLangListener extends GoParserBaseListener {

    long totalCriticalVars = 0;
    long totalCriticalFields = 0;
    long totalCriticalMethods = 0;

    long totalSafeCriticalVars = 0;
    long totalSafeCriticalFields = 0;
    long totalSafeCriticalMethods = 0;

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
                    .filter(p -> p.type_().getText().equals("string"))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Method Return Params> " + ctx.IDENTIFIER().getText());
                totalCriticalMethods += paramsStrings.size();
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
            if (ctx.signature().result().type_().getText().equals("string")) {
                System.out.println("<Method Return Type> " + ctx.IDENTIFIER().getText());
                totalCriticalMethods++;
            }
            if (isSafeType(ctx.signature().result().type_().getText())) {
                System.out.println("<Safe Method Return Type> " + ctx.IDENTIFIER().getText());
                totalSafeCriticalMethods++;
            }
        }

    }

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
                    .filter(p -> p.type_().getText().equals("string"))
                    .collect(Collectors.toList());

            if (paramsStrings.size() > 0) {
                System.out.println("<Method Return Params> " + ctx.IDENTIFIER().getText());
                totalCriticalMethods += paramsStrings.size();
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
            if (ctx.signature().result().type_().getText().equals("string")) {
                System.out.println("<Method Return Type> " + ctx.IDENTIFIER().getText());
                totalCriticalMethods++;
            }
            if (isSafeType(ctx.signature().result().type_().getText())) {
                System.out.println("<Safe Method Return Type> " + ctx.IDENTIFIER().getText());
                totalSafeCriticalMethods++;
            }
        }
    }

    @Override
    public void enterStructType(GoParser.StructTypeContext ctx) {
        List<List<TerminalNode>> identifiers = ctx.fieldDecl()
                .stream()
                .filter(var -> var.type_() != null)
                .filter(f -> f.type_().getText().equals("string"))
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
            totalCriticalFields += criticalVars.size();
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

    // @Override
    // public void enterTypeSpec(GoParser.TypeSpecContext ctx) {
    // if (ctx.type_().typeLit() != null
    // && ctx.type_().typeLit().structType() != null
    // && isCriticalVariable(ctx.IDENTIFIER().getText())) {
    // System.out.println("Struct " + ctx.IDENTIFIER().getText());
    // }

    // }

    @Override
    public void enterVarSpec(GoParser.VarSpecContext ctx) {
        if (ctx.type_() == null || ctx.type_().getText().equals("string")) {
            List<String> criticalVars = ctx.identifierList().IDENTIFIER().stream()
                    .filter(i -> isCriticalVariable(i.getText()))
                    .map(i -> i.getText())
                    .collect(Collectors.toList());

            if (criticalVars.size() > 0) {
                System.out.println("<Var> " + criticalVars);
                totalCriticalVars += criticalVars.size();
            }
        }

        if (ctx.type_() == null || isSafeType(ctx.type_().getText())) {
            List<String> criticalVars = ctx.identifierList().IDENTIFIER().stream()
                    .filter(i -> isCriticalVariable(i.getText()))
                    .map(i -> i.getText())
                    .collect(Collectors.toList());

            if (criticalVars.size() > 0) {
                System.out.println("<Safe Var> " + criticalVars);
                totalSafeCriticalVars += criticalVars.size();
            }
        }

    }

    private boolean isCriticalVariable(String var) {
        // Strip non alpha chars
        Pattern pattern = Pattern
                .compile(
                        "(?:pass|key|crypt|imei|username|identifier|secret|token|auth|userid)",
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(var);
        return matcher.find();
    }

    private boolean isSafeType(String type) {
        Pattern pattern = Pattern
                .compile(
                        "(?:byte|rune)",
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(type);
        return matcher.find();
    }

}
