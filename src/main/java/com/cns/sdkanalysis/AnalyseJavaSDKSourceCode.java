package com.cns.sdkanalysis;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;

import com.cns.grammar.JavaLexer;
import com.cns.grammar.JavaParser;

import java.io.IOException;

/**
 * Class for analyzing Java SDK source code by utilizing ANTLR for parsing.
 */
public class AnalyseJavaSDKSourceCode extends AnalyseSDKSourceCode {
    // The parse tree representing the abstract syntax tree (AST) of the Java source code.
    ParseTree parseTree;

    /**
     * Constructor that initializes the Golang SDK source code analysis by creating a parse tree.
     *
     * @param sourceCodeFilesPath The path to the Golang source code file.
     */
    public AnalyseJavaSDKSourceCode(String sourceCodeFilesPath) {
        try {
            CharStream inputStream = CharStreams.fromFileName(sourceCodeFilesPath);
            JavaLexer javaLexer = new JavaLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(javaLexer);
            JavaParser javaParser = new JavaParser(commonTokenStream);

            // Prepare parse tree or AST (Abstract Syntax Tree)
            parseTree = javaParser.compilationUnit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Analyzes the Java SDK source code by walking the parse tree and performing checks using a listener.
     */
    public void analyseSDKSourceCode() {
        // Register the listener class, which will perform checks during the tree traversal.
        JavaSDKAnalysisListener listener = new JavaSDKAnalysisListener();
        ParseTreeWalker walker = new ParseTreeWalker();

        /** The walk method traverses all tokens and calls appropriate listener methods
        * where we will perform checks on the Java source code.
        */
        walker.walk(listener, parseTree);

        this.unsafeCriticalFields += listener.totalUnSafeCriticalFields;
        this.unsafeCriticalMethods += listener.totalUnSafeCriticalMethods;
        this.unsafeCriticalVariables += listener.totalUnSafeCriticalVariables;

        this.safeCriticalFields += listener.totalSafeCriticalFields;
        this.safeCriticalMethods += listener.totalSafeCriticalMethods;
        this.safeCriticalVariables += listener.totalSafeCriticalVariables;
    }

}
