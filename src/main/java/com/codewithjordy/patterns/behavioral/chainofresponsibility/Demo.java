package com.codewithjordy.patterns.behavioral.chainofresponsibility;

import com.codewithjordy.patterns.behavioral.chainofresponsibility.example1.ConsoleLogger;
import com.codewithjordy.patterns.behavioral.chainofresponsibility.example1.ErrorLogger;
import com.codewithjordy.patterns.behavioral.chainofresponsibility.example1.FileLogger;
import com.codewithjordy.patterns.behavioral.chainofresponsibility.example1.Logger;
import com.codewithjordy.patterns.behavioral.chainofresponsibility.example2.AtmCatalog;
import com.codewithjordy.patterns.behavioral.chainofresponsibility.example2.AtmRequestContext;
import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
 * Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
 */
public class Demo {
    public void run() {
        System.out.println("--- Chain of Responsibility pattern ---");

        showExample1();
        showExample2();

        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    private void showExample1() {
        // Create the chain of loggers
        Logger logger = new ErrorLogger(); // or new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        logger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        // Use the first logger
        logger.logMessage(Logger.INFO, "This is an information and only need to be printed in the console.");
        logger.logMessage(Logger.DEBUG, "This is a debug and most be printed in the console and saved in a file.");
        logger.logMessage(Logger.ERROR, "This is an error and needs to be logged everywhere!!!");

        System.out.println();
    }

    private void showExample2() {
        // Apache Commons Chain is a library that use the CoR pattern: https://commons.apache.org/proper/commons-chain/
        // It provides base classes in order to code a chain of responsibility

        // The detailed example comes from here: https://www.baeldung.com/apache-commons-chain
        Context context = new AtmRequestContext();
        context.put("totalAmountToBeWithdrawn", 460);
        context.put("amountLeftToBeWithdrawn", 460);

        Catalog catalog = new AtmCatalog();
        Command atmWithdrawalChain = catalog.getCommand("atmWithdrawalChain");

        try {
            atmWithdrawalChain.execute(context);

            System.out.println("Total amount: " + context.get("totalAmountToBeWithdrawn"));     // returns 460
            System.out.println("Amount left: " + context.get("amountLeftToBeWithdrawn"));       // returns 0
            System.out.println("100's dispensed: " + context.get("noOfHundredsDispensed"));     // returns 4
            System.out.println("50's dispensed: " + context.get("noOfFiftiesDispensed"));       // returns 1
            System.out.println("10's dispensed: " + context.get("noOfTensDispensed"));          // returns 1
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
