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
import java.util.zip.InflaterInputStream;

/**
 *
 * @author dhrutis
 */
public class InflaterInputStreamDemo {

    public static void main(String args[]) {
        try {
            // set the output file
            File f1 = new File("D:/Demos/InflatedData.txt");
            
            // set the output stream 
            FileOutputStream fout = new FileOutputStream(f1);
            
            
            // set the input stream to read the compressed data
            File f2 = new File("D:/Demos/DeflatedData.txt");
            FileInputStream fis = new FileInputStream(f2);
            InflaterInputStream iis = new InflaterInputStream(fis);
            System.out.println("Compressed file length: " + f2.length());
            
            // Decompress the file to original size
            // and write the decompressed data to the output file
            int read = 0;
            while ((read = iis.read()) != -1) {
                fout.write(read);
            }
            fout.close();
            System.out.println("Decompressed file size: " + f1.length());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
