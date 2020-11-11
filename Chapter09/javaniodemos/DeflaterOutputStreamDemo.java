/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaniodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;

/**
 *
 * @author dhrutis
 */
public class DeflaterOutputStreamDemo {

    public static void main(String args[]) {
        try {
            
            // set the input stream
            File f1 = new File("D:/Demos/Read.txt");
            FileInputStream fin = new FileInputStream(f1);
            System.out.println("Original file size: " + f1.length());
             
            // set the output stream
            File fout = new File("D:/Demos/DeflatedData.txt");
            FileOutputStream fos = new FileOutputStream(fout);
            DeflaterOutputStream defOs = new DeflaterOutputStream(fos);
           
            // Read the data and write the 
            // compressed data to output file
            int data = 0;
            while ((data = fin.read()) != -1) {
                defOs.write(data);
            }
            
            defOs.close();
            fin.close();
            System.out.println("Compressed data length: " + fout.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
