package com.codewithjordy;

public class Main  {
    public static void main(String[] args) {
        runCreationalPatternsExamples();
        runStructuralPatternsExamples();
        runBehavioralPatternsExamples();
    }

    private static void runCreationalPatternsExamples() {
        // Singleton Demo
        new com.codewithjordy.patterns.creational.singleton.Demo().run();

        // Builder Demo
        new com.codewithjordy.patterns.creational.builder.Demo().run();

        // Factory Method
        new com.codewithjordy.patterns.creational.factorymethod.Demo().run();

        // Abstract Factory
        new com.codewithjordy.patterns.creational.abstractfactory.Demo().run();

        // Prototype
        new com.codewithjordy.patterns.creational.prototype.Demo().run();
    }

    private static void runStructuralPatternsExamples() {

    }

    private static void runBehavioralPatternsExamples() {
        // Chain of Responsibility Demo
        new com.codewithjordy.patterns.behavioral.chainofresponsibility.Demo().run();

        // Iterator
        new com.codewithjordy.patterns.behavioral.iterator.Demo().run();
    }
}
