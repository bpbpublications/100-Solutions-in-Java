/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author dhrutis
 */
public class BufferedOutputStreamDemo {

    public static void main(String args[]) throws Exception {
        try {
            // create an output stream
            FileOutputStream fos = new FileOutputStream("D:\\Demos\\Write1.txt");

            // Wrap the output stream with the buffered stream
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String str = "Data written to file";
            byte b[] = str.getBytes();
            bos.write(b);
            bos.flush();
            bos.close();
            fos.close();
            System.out.println("Task Completed");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
