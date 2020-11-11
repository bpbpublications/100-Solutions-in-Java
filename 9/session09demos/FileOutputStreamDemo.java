/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author dhrutis
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) {
        try {
            String temp = "This statement will be written to File2";
            byte[] buff = temp.getBytes();
            OutputStream os = new FileOutputStream("D:/Demos/File2.txt");
            os.write(buff);
            System.out.println("Data Written to File");
            os.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
