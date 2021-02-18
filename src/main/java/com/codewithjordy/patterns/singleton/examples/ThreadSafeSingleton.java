package com.codewithjordy.patterns.singleton.examples;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // hide constructor
    }

    // Use "Double Checked Locking" for better performance
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething from ThreadSafeSingleton");
    }

    // Bad performance example with synchronized at method level
    /*
        public static synchronized ThreadSafeSingleton getInstance() {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    */
}
