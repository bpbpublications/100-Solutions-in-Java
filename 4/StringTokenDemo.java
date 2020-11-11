/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess4Codes;

import java.util.StringTokenizer;

/**
 *
 * @author Admin3
 */
public class StringTokenDemo {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("East West North South", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer("East,West,North,South");

        // printing next token  
        System.out.println("Next token is " + st1.nextToken(","));
    }
}
