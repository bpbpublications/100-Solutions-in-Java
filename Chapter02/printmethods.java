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
public class printmethods {

    public static void main(String[] args) {

        int num = 78 / 33;
        // Using %d for decimal integer
        System.out.printf("Result of 78/33 is %d %n", num);
        // Using %f with extra zeros
        double val = 3.0 / 2.0;
        System.out.printf("Result of 3.0/2.0 is %09.3f %n", val);
        // Using %e for scientific notation
        val = 7000.0 / 2.0;
        System.out.printf("Result of 7000/2.0 is %7.2e %n", val);
        // Using %e wiht negative infinity
        val = -20.0 / 0.0;
        System.out.printf("Result of -20.0/0.0 is %7.2e %n", val);
        // Using multiple format specifiers
        System.out.printf("Value of PI is %4.2f and E is %4.3f %n", Math.PI, Math.E);

//        int a = 5;
//        System.out.println("The value of a is " + a + ".");
//        System.out.print("The value of a is ");
//        System.out.print(a);
//        System.out.print(".");
//        System.out.println("Done");
    }
}
