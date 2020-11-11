/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess5Codes;

/**
 *
 * @author Admin3
 */
public interface ILog {

    String MYSQL_DB_NAME = "MySQLDb";

    // abstract method
    default void logMsg(String message) {
        System.out.println("Logging Information: " + message);
        logData(message, "Information");
    }

    // default methods
    default void logWarning(String message) {
        System.out.println("Logging Warning: " + message);
        logData(message, "Warning");
    }

    default void logFatalError(String message) {
        System.out.println("Logging Fatal Error: " + message);
        logData(message, "Fatal Error");

    }

    private void logData(String message, String type) {
        // Connect to Database
        // Log Message
        // Close Database connection  
    }

    // static method example
    static boolean checkNull(String str) {
        System.out.println("Interface Check for Null");
        return str == null;
    }
}
