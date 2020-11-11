/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author dhrutis
 */
public class PrintWriterDemo {

    public static void main(String[] args) {

        try {
            // Write to Console by using PrintWriter  
            PrintWriter pw = new PrintWriter(System.out);
            pw.write("Welcome to the World of Java");
            pw.flush();
            pw.close();
            
            // Write to a File by using PrintWriter       
            PrintWriter pw1 = new PrintWriter(new File("D:\\Demos\\PwOut.txt"));
            pw1.write("Welcome to the World of Java");
            pw1.flush();
            pw1.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
