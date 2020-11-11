/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.ByteArrayOutputStream;

/**
 *
 * @author dhrutis
 */
public class ByteArrayOSDemo {

    public static void main(String[] args) {
        try {
            String str = "Good Morning";
            byte[] buff = str.getBytes();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(buff);
            System.out.println("The string written to buffer is: " + baos.toString());

        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
