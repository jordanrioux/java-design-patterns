package com.codewithjordy.patterns.singleton.examples;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("doSomething from EnumSingleton");
    }
}
