package com.cns.sdkanalysis;

public class App {
    public static void main(String[] args) {

        if (args.length != 2 || args[0].equals("") || args[1].equals("")) {
            System.out
                    .println("Usage: java -jar target/sdkanalysis-1.0-SNAPSHOT.jar <Path To SDK> <Language of SDK>");
            return;
        }

        TargetSDK sdk = new TargetSDK(args[0], "." + args[1]);
        sdk.Analyse();
        sdk.GetResult();
        sdk.Output();
    }
}
