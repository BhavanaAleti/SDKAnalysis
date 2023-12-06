package com.cns.sdkanalysis;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.cns.grammar.JavaParser;
import com.cns.grammar.JavaParserBaseListener;

public class JavaSDKAnalysisListener extends JavaParserBaseListener {

    long totalSafeCriticalVariables = 0;
    long totalSafeCriticalFields = 0;
    long totalSafeCriticalMethods = 0;
    long totalUnSafeCriticalVariables = 0;
    long totalUnSafeCriticalFields = 0;
    long totalUnSafeCriticalMethods = 0;

    private static final String regexForCriticalVariable = "(?:pass|key|crypt|imei|username|identifier|secret|token|auth)" ;

    private static final String regexForIsSafeType = "(?:char|StringBuilder)";

    private static final String STRING = "String";

    /**
     * Analyzes method declarations in the Java source code for critical and safe variables in return types.
     */
    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        String returnType = ctx.typeTypeOrVoid().getText();
        if (returnType.equals(STRING)) {
            if (isCriticalVariable(ctx.identifier().getText())) {
                System.out.println("<Method> " + returnType + " " + ctx.identifier().getText());
                totalUnSafeCriticalMethods++;
            }
        }

        if (isSafeType(returnType)) {
            if (isCriticalVariable(ctx.identifier().getText())) {
                System.out.println("<Safe Method> " + returnType + " " + ctx.identifier().getText());
                totalSafeCriticalMethods++;
            }
        }
    }

    /**
     * Analyzes field declarations in the Java source code for critical and safe variables.
     */
    @Override
    public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        String fieldType = ctx.typeType().getText();
        if (fieldType.equals(STRING)) {

            List<String> list = ctx.variableDeclarators().variableDeclarator()
                    .stream()
                    .filter(x -> isCriticalVariable(x.variableDeclaratorId().getText()))
                    .map(x -> x.getText()).collect(Collectors.toList());

            if (list.size() > 0) {
                System.out.println("<Field> " + fieldType + " " + list);
                totalUnSafeCriticalFields += list.size();
            }
        }

        if (isSafeType(fieldType)) {
            List<String> list = ctx.variableDeclarators().variableDeclarator()
                    .stream()
                    .filter(x -> isCriticalVariable(x.variableDeclaratorId().getText()))
                    .map(x -> x.getText()).collect(Collectors.toList());

            if (list.size() > 0) {
                System.out.println("<Safe Field >  " + fieldType + " " + list);
                totalSafeCriticalFields += list.size();
            }
        }
    }

    /**
     * Analyzes local variable declarations in the Java source code for critical and safe variables.
     */
    @Override
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        String fieldType = ctx.typeType().getText();
        if (fieldType.equals(STRING)) {

            List<String> list = ctx.variableDeclarators().variableDeclarator()
                    .stream()
                    .filter(x -> isCriticalVariable(x.variableDeclaratorId().getText()))
                    .map(x -> x.getText()).collect(Collectors.toList());

            if (list.size() > 0) {
                System.out.println("<Local Var> " + fieldType + " " + list);
                totalUnSafeCriticalVariables += list.size();
            }
        }

        if (isSafeType(fieldType)) {
            List<String> list = ctx.variableDeclarators().variableDeclarator()
                    .stream()
                    .filter(x -> isCriticalVariable(x.variableDeclaratorId().getText()))
                    .map(x -> x.getText()).collect(Collectors.toList());

            if (list.size() > 0) {
                System.out.println("<Safe Local Var>  " + fieldType + " " + list);
                totalSafeCriticalVariables += list.size();
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
        Pattern pattern = Pattern.compile(regexForCriticalVariable,
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
