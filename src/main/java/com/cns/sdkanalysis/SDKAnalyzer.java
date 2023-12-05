package com.cns.sdkanalysis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class SDKAnalyzer {

    ArrayList<File> files;
    ArrayList<AnalyseSDKSourceCode> sdkSourceCodes;
    String fileExtension;
    String pathToSDKSourceCode;


    long safeCriticalFields = 0;
    long safeCriticalVars = 0;
    long safeCriticalMethods = 0;


    long unsafeCriticalVariables = 0;
    long unsafeCriticalFields = 0;
    long unsafeCriticalMethods = 0;


    public SDKAnalyzer(String pathToSDKSourceCode, String fileExtension) {
        this.pathToSDKSourceCode = pathToSDKSourceCode;
        this.fileExtension = fileExtension;
        files = new ArrayList<>();
        sdkSourceCodes = new ArrayList<>();

        listFilesForFolder(new File(pathToSDKSourceCode));
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void Analyse() {
        switch (fileExtension) {
            case ".java":
                for (File file : files) {
                    AnalyseJavaSDKSourceCode analyseFile = new AnalyseJavaSDKSourceCode(file.getPath());
                    analyseFile.Analyse();
                    sdkSourceCodes.add(analyseFile);
                }
                break;
            case ".go":
                for (File file : files) {
                    AnalyseGolangSDKSourceCode analyseFile = new AnalyseGolangSDKSourceCode(file.getPath());
                    analyseFile.Analyse();
                    sdkSourceCodes.add(analyseFile);
                }
                break;
            default:
                System.out.println("Language not supported");

        }

    }

    public void GetResult() {
        for (AnalyseSDKSourceCode file : sdkSourceCodes) {
            this.unsafeCriticalFields += file.totalCriticalFields;
            this.unsafeCriticalMethods += file.totalCriticalMethods;
            this.unsafeCriticalVariables += file.totalCriticalVars;

            this.safeCriticalFields += file.totalSafeCriticalFields;
            this.safeCriticalMethods += file.totalSafeCriticalMethods;
            this.safeCriticalVars += file.totalSafeCriticalVars;
        }

    }

    private void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else if (isSourceFile(fileEntry)) {
                files.add(fileEntry);
                // System.out.println(fileEntry.getPath());
            }
        }
    }

    private boolean isSourceFile(File file) {
        return file.getName().endsWith(fileExtension);
    }

    public void Output() {
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
                            fileExtension.substring(1) + "_output/"
                                    + pathToSDKSourceCode.substring(pathToSDKSourceCode.lastIndexOf("/") + 1) + ".csv"));
            writer.write(output);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
