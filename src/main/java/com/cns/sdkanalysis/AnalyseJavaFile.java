package com.cns.sdkanalysis;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;

import com.cns.grammar.JavaLexer;
import com.cns.grammar.JavaParser;

import java.io.IOException;

public class AnalyseJavaFile extends AnalyseFile {
    ParseTree parseTree;

    public AnalyseJavaFile(String filePath) {
        try {
            CharStream inputStream = CharStreams.fromFileName(filePath);
            JavaLexer javaLexer = new JavaLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(javaLexer);
            JavaParser javaParser = new JavaParser(commonTokenStream);

            // Prepare parse tree or AST (Abstract Syntax Tree)
            parseTree = javaParser.compilationUnit();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void Analyse() {
        // Register listener class which will perform checks.
        JavaListner listener = new JavaListner();
        ParseTreeWalker walker = new ParseTreeWalker();

        // Walk method will walk through all tokens & call appropriate listener methods
        // where we will perform checks.
        walker.walk(listener, parseTree);

        this.totalCriticalFields += listener.totalCriticalFields;
        this.totalCriticalMethods += listener.totalCriticalMethods;
        this.totalCriticalVars += listener.totalCriticalVars;

        this.totalSafeCriticalFields += listener.totalSafeCriticalFields;
        this.totalSafeCriticalMethods += listener.totalSafeCriticalMethods;
        this.totalSafeCriticalVars += listener.totalSafeCriticalVars;
    }

}
