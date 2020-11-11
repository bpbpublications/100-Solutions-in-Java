/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaniodemos;

import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 *
 * @author dhrutis
 */
public class InflaterDemo {

    public static void main(String[] args) {

        try {
            
            String input = "Example of Inflater";
            // Convvert string to byte array
            byte[] inBuff = input.getBytes("UTF-8");
            
            // Compress the bytes
            byte[] outBuff = new byte[100];
            Deflater d1 = new Deflater();
            d1.setInput(inBuff);
            d1.finish();
            int len = d1.deflate(outBuff);
            System.out.println("Compressed data length: "+len);
            
            // Decompress the bytes
            Inflater i1 = new Inflater();
            i1.setInput(outBuff, 0, outBuff.length);
            byte[] inflated = new byte[100];
            int inflateLen = i1.inflate(inflated);
            i1.end();
            
            // Convert bytes to string
            String str = new String(inflated, 0, inflateLen, "UTF-8");
            System.out.println("Decompressed string is: " + str);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
