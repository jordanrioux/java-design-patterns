package com.codewithjordy.patterns.singleton;

import com.codewithjordy.patterns.singleton.examples.EagerSingleton;
import com.codewithjordy.patterns.singleton.examples.EnumSingleton;
import com.codewithjordy.patterns.singleton.examples.LazySingleton;
import com.codewithjordy.patterns.singleton.examples.ThreadSafeSingleton;

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
