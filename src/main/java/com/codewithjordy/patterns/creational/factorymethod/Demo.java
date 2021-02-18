package com.codewithjordy.patterns.creational.factorymethod;

import com.codewithjordy.patterns.creational.factorymethod.example1.DatabaseConnection;
import com.codewithjordy.patterns.creational.factorymethod.example1.DatabaseFactory;
import com.codewithjordy.patterns.creational.factorymethod.example1.DatabaseType;
import com.codewithjordy.patterns.creational.factorymethod.example2.Blacksmith;
import com.codewithjordy.patterns.creational.factorymethod.example2.ElfBlacksmith;
import com.codewithjordy.patterns.creational.factorymethod.example2.WeaponType;

/**
 * Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created.
 */
public class Demo {
    public void run() {
        System.out.println("--- Factory Method pattern ---");

        showExample1();
        showExample2();
        System.out.println("Not much to show here, look at the code instead.");

        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    private void showExample1() {
        // The database type should come from the configuration file
        DatabaseFactory databaseFactory = new DatabaseFactory(DatabaseType.POSTGRES);
        DatabaseConnection conn = databaseFactory.createConnection();
        conn.open();

        // Do all database code that is exposed via the DatabaseConnection interface

        conn.close();
    }

    private void showExample2() {
        /**
         * This example uses subset of classes for the creation logic. This way of doing is generally used when
         * planning on using an Abstract Factory.
         */

        // Declare a factory of the type of item we need to create (e.g. ElfBlacksmith for Elves, etc.)
        Blacksmith blacksmith = new ElfBlacksmith();
        blacksmith.createWeapon(WeaponType.SPEAR);
        blacksmith.createWeapon(WeaponType.AXE);
    }
}
