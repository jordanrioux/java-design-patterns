package com.codewithjordy.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator is a behavioral design pattern that lets you traverse elements of
 * a collection without exposing its underlying representation (list, stack, tree, etc.).
 */
public class Demo {
    public void run() {
        System.out.println("--- Iterator pattern ---");

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // The Iterator pattern provides a standard way of iterating over elements a collection
        // See java.util.Iterable
        // The java.util.Iterator defines hasNext(), next() et remove() methods
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String e = itr.next();
            System.out.println("Iterator: " + e);
        }

        // Unless absolutely required, we should always preferred the "for-each" loop syntax instead of the Iterator
        // "for-each" loop usually use the Iterator pattern behind the scene and hides its verbose syntax
        for (String e : list) {
            System.out.println("for: " + e);
        }

        // Functional approach for the forEach loop
        list.forEach(e -> System.out.println("list.forEach: " + e));

        // If we wanted to only print the element without additional text,
        // We could omit the parameter and simply pass the method reference as the type can be inferred.
        //list.forEach(System.out::println);

        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

}
