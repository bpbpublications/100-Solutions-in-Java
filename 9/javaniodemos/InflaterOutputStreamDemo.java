/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaniodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterOutputStream;

/**
 *
 * @author dhrutis
 */
public class InflaterOutputStreamDemo {

    public static void main(String args[]) {
        try {
            // set the input stream
            File f1 = new File("D:/Demos/DeflatedData.txt");
            FileInputStream fis = new FileInputStream(f1);

            // set the output stream
            File f2 = new File("D:/Demos/InflatedData1.txt");
            FileOutputStream fos = new FileOutputStream(f2);

            InflaterOutputStream ios = new InflaterOutputStream(fos);
            System.out.println("Compressed file size: " + f1.length());

            // Read compressed data and write
            // decompressed data to the outupt file
            int read = 0;
            while ((read = fis.read()) != -1) {
                ios.write(read);
            }

            ios.close();
            System.out.println("Decompressed file size: " + f2.length());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
