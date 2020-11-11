/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

/**
 *
 * @author Admin3
 */
public class ForDemo {

    public static void main(String[] args) {
        int i;
        // for loop with all declartion expressions
        for (i = 1; i <= 3; i++) {
            System.out.println("Value of i is " + i);
        }

        // Variable initialization within for statement
        for (int j = 1; j <= 2; j++) {
            System.out.println("Value of j is " + j);

        }

        //Nested for loop
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y <=x; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // multiple declarations in for loop
        int p, q, n = 3;
        for (p = 0, q = n; p <= n; p++, q--) {
            System.out.println(p + " + " + q + " = " + (p + q));
        }

        int num = 1;
        // Using boolean variable for condition
        boolean check = false;
        for (; !check; num++) {
            System.out.println("Value of num: " + num);
            if (num == 2) {
                check = true;
                System.out.println("Check = true. Loop terminated.");
            }
        }
    }
}
