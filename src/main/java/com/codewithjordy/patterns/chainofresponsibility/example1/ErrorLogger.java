package com.codewithjordy.patterns.chainofresponsibility.example1;

public class ErrorLogger extends Logger {

    // Can pass the parameter to the constructor or just use it
    public ErrorLogger() {
        this(Logger.ERROR);
    }

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.err.println("ERROR: " + message);
    }
}
