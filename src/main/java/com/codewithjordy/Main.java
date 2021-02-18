package com.codewithjordy;

public class Main  {
    public static void main(String[] args) {
        // Singleton Demo
        new com.codewithjordy.patterns.singleton.Demo().run();

        // Builder Demo
        new com.codewithjordy.patterns.builder.Demo().run();

        // Chain of Responsibility Demo
        new com.codewithjordy.patterns.chainofresponsibility.Demo().run();
    }
}
