package com.codewithjordy.patterns.creational.builder;

import com.codewithjordy.patterns.creational.builder.example1.HairColor;
import com.codewithjordy.patterns.creational.builder.example1.Hero;
import com.codewithjordy.patterns.creational.builder.example1.Profession;
import com.codewithjordy.patterns.creational.builder.example1.Weapon;
import com.codewithjordy.patterns.creational.builder.example2.House;
import com.codewithjordy.patterns.creational.builder.example2.HouseBuilder;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the same construction code.
 */
public class Demo {
    public void run() {
        System.out.println("--- Builder pattern ---");

        showExample1();
        showExample2();
        showExample3();

        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    /*
     * Simple example of a builder for a Hero class using inner class for Builder
     */
    private void showExample1() {
        Hero hero = new Hero.Builder(Profession.MAGE, "Riobard")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();

        System.out.println("Hero: " + hero);
    }

    /*
     * https://refactoring.guru/design-patterns/builder
     */
    private void showExample2() {
        // Solution 1: Use a base House class and create subclasses for all parameters variation
        //             HouseWithGarage extends House
        //             HouseWithSwimmingPool extends House
        //             ...
        //             With this solution, you will end up with a lot of classes and each new parameter
        //             will be adding a lot of new classes, etc.


        // Solution 2: Put all parameters in the constructor
        //             A lot of unused parameters and code is hard to understand with this approach.
        //
        // As Joshua Bloch states in Effective Java, 2nd Edition:
        //      The builder pattern is a good choice when designing classes whose constructors or static factories would have more than a handful of parameters.
        //
        //BadHouse badHouse1 = new BadHouse(4, 3, 4, true, false, false);
        //BadHouse badHouse2 = new BadHouse(6, 2, 3, true, true, false);


        // Solution: Using a House Builder like:
        House house = new HouseBuilder()
                        .buildRooms(4)
                        .buildDoors(3)
                        .buildWindows(4)
                        .buildGarage()
                        .buildSwimPool()
                        .build();

        System.out.println("House: " + house);
    }

    private void showExample3() {
        StringBuilder builder = new StringBuilder();
        String result = builder
                            .append(5)
                            .append('c')
                            .append(true)
                            .append("hello")
                            .toString();    // = .build() method

        System.out.println("Result: " + result);
    }
}
