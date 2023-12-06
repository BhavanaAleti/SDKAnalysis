package com.cns.sdkanalysis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Objects;

public class SDKAnalyzer {

    String pathToSDKSourceCode;
    String sourceCodeLanguage;
    ArrayList<File> files;
    ArrayList<AnalyseSDKSourceCode> sdkSourceCodes;

    long safeCriticalFields = 0;
    long safeCriticalVars = 0;
    long safeCriticalMethods = 0;
    long unsafeCriticalVariables = 0;
    long unsafeCriticalFields = 0;
    long unsafeCriticalMethods = 0;


    public SDKAnalyzer(String pathToSDKSourceCode, String sourceCodeLanguage) {
        this.pathToSDKSourceCode = pathToSDKSourceCode;
        this.sourceCodeLanguage = sourceCodeLanguage;
        files = new ArrayList<>();
        sdkSourceCodes = new ArrayList<>();

        collectSourceFilesRecursively(new File(pathToSDKSourceCode));
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void validateSourceLangAndAnalyze() {
        switch (sourceCodeLanguage) {
            case ".java":
                for (File file : files) {
                    AnalyseJavaSDKSourceCode analyseJavaSDKSourceCode = new AnalyseJavaSDKSourceCode(file.getPath());
                    analyseJavaSDKSourceCode.analyseSDKSourceCode();
                    sdkSourceCodes.add(analyseJavaSDKSourceCode);
                }
                break;
            case ".go":
                for (File file : files) {
                    AnalyseGolangSDKSourceCode analyseGolangSDKSourceCode = new AnalyseGolangSDKSourceCode(file.getPath());
                    analyseGolangSDKSourceCode.analyseSDKSourceCode();
                    sdkSourceCodes.add(analyseGolangSDKSourceCode);
                }
                break;
            default:
                System.out.println("Language not supported,only Java and Go Source code files are supported.");
        }

    }

    public void aggregateAnalyzedMetrics() {
        for (AnalyseSDKSourceCode sourceCode : sdkSourceCodes) {
            this.unsafeCriticalFields += sourceCode.unsafeCriticalFields;
            this.unsafeCriticalMethods += sourceCode.unsafeCriticalMethods;
            this.unsafeCriticalVariables += sourceCode.unsafeCriticalVariables;

            this.safeCriticalFields += sourceCode.safeCriticalFields;
            this.safeCriticalMethods += sourceCode.safeCriticalMethods;
            this.safeCriticalVars += sourceCode.safeCriticalVariables;
        }

    }

    public void exportAnalysisResultsToCSV() {
        String output = "Type, Count\n";
        output += "UnSafeCriticalVariables, " + this.unsafeCriticalVariables + "\n";
        output += "UnSafeCriticalFields, " + this.unsafeCriticalFields + "\n";
        output += "UnSafeCriticalMethods, " + this.unsafeCriticalMethods + "\n";
        output += "SafeCriticalVariables, " + this.safeCriticalVars + "\n";
        output += "SafeCriticalFields, " + this.safeCriticalFields + "\n";
        output += "SafeCriticalMethods, " + this.safeCriticalMethods + "\n";


        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(
                            sourceCodeLanguage.substring(1) + "_output/"
                                    + pathToSDKSourceCode.substring(pathToSDKSourceCode.lastIndexOf("/") + 1) + ".csv"));
            writer.write(output);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void collectSourceFilesRecursively(final File folder) {
        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                collectSourceFilesRecursively(fileEntry);
            } else if (isSourceCodeFileWithExtension(fileEntry)) {
                files.add(fileEntry);
            }
        }
    }

    private boolean isSourceCodeFileWithExtension(File file) {
        return file.getName().endsWith(sourceCodeLanguage);
    }



}
