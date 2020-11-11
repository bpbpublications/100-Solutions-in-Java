/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.ByteArrayInputStream;

/**
 *
 * @author dhrutis
 */
public class ByteArrayISDemo {

    public static void main(String[] args) {
        String content = "Good Morning";
        byte[] bytes = content.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        int i = 0;
        while ((i = bais.read()) != -1) {
            //Convert byte into character  
            char ch = (char) i;
            System.out.println("Read character: "+ch);
        }
    }
}
