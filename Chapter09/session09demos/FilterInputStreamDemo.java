/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author dhrutis
 */
public class FilterInputStreamDemo {

    public static void main(String[] args) throws Exception {
        InputStream is = null;
        FilterInputStream fis = null;
        try {
             // create input stream objects
            is = new FileInputStream("D:/Demos/File1.txt");
            fis = new BufferedInputStream(is);
            
           // read and print from filterinputstream
            System.out.println("Read character: "+(char) fis.read());
            System.out.println("Read character: "+(char) fis.read());

           // set a mark
            fis.mark(0);
            System.out.println("mark set");
            System.out.println("Read character: "+(char) fis.read());
            System.out.println("Read character: "+(char) fis.read());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (is != null) {
                is.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
