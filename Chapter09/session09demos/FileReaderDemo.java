/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.FileReader;

/**
 *
 * @author dhrutis
 */
public class FileReaderDemo {

    public static void main(String args[]) throws Exception {
        try {
            FileReader fr = new FileReader("D:\\Demos\\File1.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("");
            fr.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
