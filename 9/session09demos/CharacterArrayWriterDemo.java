/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.CharArrayWriter;
import java.io.FileWriter;

/**
 *
 * @author dhrutis
 */
public class CharacterArrayWriterDemo {

    public static void main(String args[]) {

        try {
            // Initialize the CharacterArrayWriter object
            CharArrayWriter cout = new CharArrayWriter();
            cout.write("Welcome to the World of Java");

            // Initialize the FileWriter object 
            FileWriter fw1 = new FileWriter("D:\\Demos\\Out1.txt");
            
            // Write to the file from character array writer
            cout.writeTo(fw1);
            fw1.close();
            System.out.println("Task Completed");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
