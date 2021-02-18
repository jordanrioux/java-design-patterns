package com.codewithjordy.patterns.chainofresponsibility.example1;

public class ConsoleLogger extends Logger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("CONSOLE: " + message);
    }
}
