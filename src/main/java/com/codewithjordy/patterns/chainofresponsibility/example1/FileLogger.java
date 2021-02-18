package com.codewithjordy.patterns.chainofresponsibility.example1;

public class FileLogger extends Logger {
    public FileLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        // Open file, write to file, close file, etc.
        System.out.println("FILE: " + message);
    }
}
