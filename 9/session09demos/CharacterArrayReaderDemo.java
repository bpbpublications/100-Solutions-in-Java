/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.CharArrayReader;

/**
 *
 * @author dhrutis
 */
public class CharacterArrayReaderDemo {

    public static void main(String[] args) {

        try {
            // Initailize the character array 
            char[] buff = {'W', 'H', 'I', 'T', 'E'};

            // Initailize the character array reader
            CharArrayReader car = new CharArrayReader(buff);

            // check for readiness 
            boolean check = car.ready();
            if (check == true) {
                System.out.println("Ready to read");
            } else {
                System.out.println("Not ready");
            }

            int i = 0;
            System.out.println("Reading the array:");
            // invoke the read() method 
            while ((i = car.read()) != -1) {
                char c = (char) i;
                System.out.println(c);

                // invoke the skip() method 
                long c1 = car.skip(1);
                System.out.println("Characters Skipped: " + c1);
            }

            CharArrayReader car1 = new CharArrayReader(buff);
            
            // Read part of the array 
            char buff1[] = new char[6];
            // read data into a buffer from offset and number of chars specified
            car1.read(buff1, 1, 3);
            
            int b = 0;
            System.out.println("Display the remaining array");

            while ((b = car1.read()) != -1) {
                char c2 = (char) b;
                System.out.print(c2);
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
