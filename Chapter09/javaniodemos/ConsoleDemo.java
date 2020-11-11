/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaniodemos;

import java.io.Console;
import java.io.IOError;

/**
 *
 * @author dhrutis
 */
public class ConsoleDemo {

    public static void main(String[] args) {
        Console cons = System.console();
        if (cons == null) {
            System.err.println("Console not available!");
            return;
        }
        try {
            String loginid = cons.readLine("Login id: ");
            char[] pass = cons.readPassword("Password: ");
            
            if(loginid.equals("admin") && String.valueOf(pass).equals("admin"))
                System.out.println("Welcome!! Admin");
            else
                System.out.println("Invalid credentials");
        } catch (IOError ioe) {
            cons.printf("I/O Error: %s\n", ioe.getMessage());
        }
    }
}
