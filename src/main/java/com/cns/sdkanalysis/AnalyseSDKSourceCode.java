package com.cns.sdkanalysis;

public abstract class AnalyseSDKSourceCode {

    // Total counts for safe critical code elements
    long safeCriticalVariables = 0;
    long safeCriticalFields = 0;
    long safeCriticalMethods = 0;

    long unsafeCriticalVariables = 0;
    long unsafeCriticalFields = 0;
    long unsafeCriticalMethods = 0;

    public abstract void analyseSDKSourceCode();
}
