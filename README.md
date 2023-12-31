# SDKAnalysis

Project Name: Assessing the secure handling of sensitive data in Open Source SDKs

## Overview

This code is in an implementation of static analysis on opensource SDKs written in Java and Golang
language. This project harnesses the strength of ANTLR4 for parsing and interpreting structured text
data to provide a comprehensive static analysis solution. The tool performs in-depth static
analysis on source data, identifying potential issues such as security vulnerabilities.

### Requirements
- Java JDK 8 or higher

### Execution Instructions

1. To build the project, use the following steps: 
    - Navigate to the `SDKAnalysis` directory and use below commands to build
        
        mvn clean
        mkdir -p  target/generated-sources/antlr4/com/cns/grammar/
        cp src/main/antlr4/com/cns/grammar/GoParserBase.java target/generated-sources/antlr4/com/cns/grammar/GoParserBase.java
        mvn package

2. To run the code, use the below command
        java -jar target/sdkanalysis-1.0-SNAPSHOT.jar <Path To SDK> <Language of SDK>

## Results
Below are the CSV results for one of the SDK we analyzed

### Result for Snowflake SDK- Java :

| Type| Count |
|----------|----------|
UnSafeCriticalVariables| 34 |
UnSafeCriticalFields| 44 |
UnSafeCriticalMethods| 25 |
SafeCriticalVariables| 0 |
SafeCriticalFields| 0 |
SafeCriticalMethods| 0 |

### Result for Snowflake SDK -Go

| Type| Count |
|----------|----------|
UnSafeCriticalVariables| 9 |
UnSafeCriticalFields| 0 |
UnSafeCriticalMethods| 0 |
SafeCriticalVariables| 9 |
SafeCriticalFields| 4 |
SafeCriticalMethods| 4 |

