package com.cns.sdkanalysis;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;

import com.cns.grammar.GoLexer;
import com.cns.grammar.GoParser;

import java.io.IOException;

/**
 * Class for analyzing Golang SDK source code using ANTLR for parsing.
 */
public class AnalyseGolangSDKSourceCode extends AnalyseSDKSourceCode {
    // The parse tree representing the abstract syntax tree (AST) of the Golang source code.
    ParseTree parseTree;

    /**
     * Constructor that initializes the Golang SDK source code analysis by creating a parse tree.
     *
     * @param sourceCodeFilesPath The path to the Golang source code file.
     */
    public AnalyseGolangSDKSourceCode(String sourceCodeFilesPath) {
        try {
            CharStream inputStream = CharStreams.fromFileName(sourceCodeFilesPath);
            GoLexer goLexer = new GoLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(goLexer);
            GoParser goParser = new GoParser(commonTokenStream);

            // Prepare parse tree or AST (Abstract Syntax Tree)
            parseTree = goParser.sourceFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Analyzes the Golang SDK source code by walking the parse tree and performing checks using a listener.
     */
    public void analyseSDKSourceCode() {
        // Register listener class which will perform checks.
        GoLangSDKAnalysisListener listener = new GoLangSDKAnalysisListener();
        ParseTreeWalker walker = new ParseTreeWalker();

        // Walk method will walk through all tokens & call appropriate listener methods
        // where we will perform checks.
        walker.walk(listener, parseTree);

        this.unsafeCriticalFields += listener.totalUnSafeCriticalFields;
        this.unsafeCriticalMethods += listener.totalUnSafeCriticalMethods;
        this.unsafeCriticalVariables += listener.totalUnSafeCriticalVariables;

        this.safeCriticalFields += listener.totalSafeCriticalFields;
        this.safeCriticalMethods += listener.totalSafeCriticalMethods;
        this.safeCriticalVariables += listener.totalSafeCriticalVariables;
    }
}
