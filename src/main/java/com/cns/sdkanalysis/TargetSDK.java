package com.cns.sdkanalysis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class TargetSDK {

    ArrayList<File> files;
    ArrayList<AnalyseFile> analysedFiles;
    String fileExtension;
    String pathToSDK;

    long totalCriticalVars = 0;
    long totalCriticalFields = 0;
    long totalCriticalMethods = 0;

    long totalSafeCriticalVars = 0;
    long totalSafeCriticalFields = 0;
    long totalSafeCriticalMethods = 0;

    public TargetSDK(String pathToSDK, String fileExtension) {
        this.pathToSDK = pathToSDK;
        this.fileExtension = fileExtension;
        files = new ArrayList<>();
        analysedFiles = new ArrayList<>();

        listFilesForFolder(new File(pathToSDK));
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void Analyse() {
        switch (fileExtension) {
            case ".java":
                for (File file : files) {
                    AnalyseJavaFile analyseFile = new AnalyseJavaFile(file.getPath());
                    analyseFile.Analyse();
                    analysedFiles.add(analyseFile);
                }
                break;
            case ".go":
                for (File file : files) {
//                    AnalyseGolangFile analyseFile = new AnalyseGolangFile(file.getPath());
//                    analyseFile.Analyse();
//                    analysedFiles.add(analyseFile);
                }
                break;
            default:
                System.out.println("Language not supported");

        }

    }

    public void GetResult() {
        for (AnalyseFile file : analysedFiles) {
            this.totalCriticalFields += file.totalCriticalFields;
            this.totalCriticalMethods += file.totalCriticalMethods;
            this.totalCriticalVars += file.totalCriticalVars;

            this.totalSafeCriticalFields += file.totalSafeCriticalFields;
            this.totalSafeCriticalMethods += file.totalSafeCriticalMethods;
            this.totalSafeCriticalVars += file.totalSafeCriticalVars;
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

        output += "UnSafeCriticalFields, " + this.totalCriticalFields + "\n";
        output += "UnSafeCriticalMethods, " + this.totalCriticalMethods + "\n";
        output += "UnSafeCriticalVars, " + this.totalCriticalVars + "\n";
        output += "SafeCriticalFields, " + this.totalSafeCriticalFields + "\n";
        output += "SafeCriticalMethods, " + this.totalSafeCriticalMethods + "\n";
        output += "SafeCriticalVars, " + this.totalSafeCriticalVars + "\n";

        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(
                            fileExtension.substring(1) + "_output/"
                                    + pathToSDK.substring(pathToSDK.lastIndexOf("/") + 1) + ".csv"));
            writer.write(output);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
