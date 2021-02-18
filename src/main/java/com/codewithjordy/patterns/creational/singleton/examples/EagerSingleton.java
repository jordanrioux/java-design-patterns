package com.codewithjordy.patterns.creational.singleton.examples;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // hides constructor
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething from EagerSingleton");
    }
}
