/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author dhrutis
 */
public class FilterOutputStreamDemo {

    public static void main(String[] args) throws Exception {

        OutputStream os = null;
        FilterOutputStream fos = null;
        FileInputStream fis = null;
        FileInputStream filis = null;
        String s="Java Program";      
        byte buf[]=s.getBytes();
        int i = 0;
        char c;
        
        try {
            // creates output stream objects
            os = new FileOutputStream("D://Demos//Write.txt");
            fos = new FilterOutputStream(os);
            // writee to the output stream from a byte array
            fos.write(buf);
            // flust all contents of the output stream
            fos.flush();
            // create an input stream to read from the file
            filis = new FileInputStream("D:/Demos/Write.txt");
            while ((i = filis.read()) != -1) { 
                // convert integer to character
                c = (char) i;
                System.out.println("Character read: " + c);
            }
        } catch (IOException e) {
            System.out.print("Error: "+e.getMessage());
        } finally {
            // releases system resources 
            if (os != null) {
                os.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
