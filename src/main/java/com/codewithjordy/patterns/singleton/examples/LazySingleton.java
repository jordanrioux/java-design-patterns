package com.codewithjordy.patterns.singleton.examples;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // hide constructor
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething from LazySingleton");
    }
}
