/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaniodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

/**
 *
 * @author dhrutis
 */
public class DeflaterInputStreamDemo {

    public static byte[] expandBuffer(byte[] temp) {
        byte[] temp1 = temp;
        temp = new byte[temp.length + 1];
        // backup the data
        for (int i = 0; i < temp1.length; i++) {
            temp[i] = temp1[i];
        }
        return temp;
    }

    public static void main(String args[]) throws IOException {
        FileOutputStream fos = null;
        try {
            
            // set the input stream
            File f1 = new File("D:/Demos/Read.txt");
            FileInputStream fis = new FileInputStream(f1);
            DeflaterInputStream dis = new DeflaterInputStream(fis);

            // byte array to store deflated data
            byte inBuff[] = new byte[0];
            int index = -1;
            
            // read data from the file
            int read = 0;
            while ((read = dis.read()) != -1) {
                inBuff = expandBuffer(inBuff);
                inBuff[++index] = (byte) read;
            }
            
            // write compressed data to a file
            fos = new FileOutputStream("D:/Demos/DeflatedFile.txt");
            fos.write(inBuff, 0, inBuff.length);
            System.out.println("Compressed data written to file.");
            fos.close();
            System.out.println("Compressed data size: " + inBuff.length);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
