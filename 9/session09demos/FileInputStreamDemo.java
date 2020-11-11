/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author dhrutis
 */
public class FileInputStreamDemo {

    public static void main(String argv[]) {
        try {
            FileInputStream fis = new FileInputStream("D:/Demos/File1.txt");
            int ch;
            while ((ch = fis.read()) > -1) {
                StringBuilder buf = new StringBuilder();
                buf.append((char) ch);
                System.out.print(buf.toString());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
