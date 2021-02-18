package com.codewithjordy.patterns.creational.factorymethod.example1;

/**
 * Defines which operations should be available for a database connection.
 */
public interface DatabaseConnection {
    void open();
    // execute, query, ...
    void close();
}
