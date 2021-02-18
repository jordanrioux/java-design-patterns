package com.codewithjordy.patterns.creational.abstractfactory;

import com.codewithjordy.patterns.creational.abstractfactory.example1.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Abstract Factory is a creational design pattern that lets you produce families of related objects
 * without specifying their concrete classes.
 */
public class Demo {
    public void run() {
        System.out.println("--- Abstract Factory pattern ---");

        // Instead of creating the "factory method" that we need, we use the abstract factory "FactoryMaker"
        // to create a factory of the type of entities that we want to use.

        KingdomFactory factory = FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF);
        //KingdomFactory factory = new ElfKingdomFactory();
        Castle castle = factory.createCastle();
        King king = factory.createKing();
        Army army = factory.createArmy();

        System.out.println("Castle: " + castle.getDescription());
        System.out.println("King: " + king.getDescription());
        System.out.println("Army: " + army.getDescription());

        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    private void explainJavaExample() {
        /**
         * The JDBC implementation uses Factory Method and Abstract Factory as explained by below code.
         */
        // Factory method. Loads the driver by given classname. It actually returns a concrete Class<Driver>.
        // However, we don't need it here, so we just ignore it. It can be any driver class name. The MySQL
        // one here is just an example. Under the covers, it will do DriverManager.registerDriver(new Driver()).
        //Class.forName("com.mysql.jdbc.Driver");

        // Abstract factory. This lets the driver return a concrete connection for the given URL. You can just
        // declare it against java.sql.Connection interface. Under the covers, the DriverManager will find the
        // MySQL driver by URL and call driver.connect() which in turn will return new ConnectionImpl().
        //Connection connection = DriverManager.getConnection("jdbc://url");

        // Abstract factory. This lets the driver return a concrete statement from the connection. You can
        // just declare it against java.sql.Statement interface. Under the covers, the MySQL ConnectionImpl
        // will return new StatementImpl().
        //Statement statement = connection.createStatement();

        // Abstract factory. This lets the driver return a concrete result set from the statement. You can
        // just declare it against java.sql.ResultSet interface. Under the covers, the MySQL StatementImpl
        // will return new ResultSetImpl().
        //ResultSet resultSet = statement.executeQuery("sql query...");
    }
}
