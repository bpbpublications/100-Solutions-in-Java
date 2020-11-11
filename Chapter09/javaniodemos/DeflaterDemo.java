/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaniodemos;

import java.util.zip.Deflater;

/**
 *
 * @author dhrutis
 */
public class DeflaterDemo {

    public static void main(String[] args) {
        try {
            // Convert string to bytes
            String str = "Compressing data by using Deflater class";
            byte[] strInput = str.getBytes("UTF-8");
            
            byte[] strOutput = new byte[100];
            
            Deflater deflater = new Deflater();
            deflater.setInput(strInput);
            deflater.finish();
            // Compress the bytes
            int length = deflater.deflate(strOutput);
            System.out.println("Compressed Data Length:"+length);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
