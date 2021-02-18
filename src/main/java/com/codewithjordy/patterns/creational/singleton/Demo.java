package com.codewithjordy.patterns.creational.singleton;

import com.codewithjordy.patterns.creational.singleton.examples.EagerSingleton;
import com.codewithjordy.patterns.creational.singleton.examples.EnumSingleton;
import com.codewithjordy.patterns.creational.singleton.examples.LazySingleton;
import com.codewithjordy.patterns.creational.singleton.examples.ThreadSafeSingleton;

/**
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance,
 * while providing a global access point to this instance.
 */
public class Demo {
    public void run() {
        System.out.println("--- Singleton pattern ---");

        // How to use each type of Singleton (same except for Enum one)
        EagerSingleton.getInstance().doSomething();
        LazySingleton.getInstance().doSomething();
        ThreadSafeSingleton.getInstance().doSomething();

        EnumSingleton.INSTANCE.doSomething();

        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }
}
