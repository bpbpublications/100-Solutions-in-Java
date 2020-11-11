/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess6Codes;

/**
 *
 * @author Admin3
 */
public class MathDemo {

    static int num1 = 2, num2 = 16;

    public static void main(String[] args) {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Max value is " + Math.max(num1, num2));
        System.out.println("Min value is " + Math.min(num1, num2));
        System.out.println("Square root of num2 is " + Math.sqrt(num2));
        System.out.println("Result of num2 to the power of num1 is " + Math.pow(num2, num1));
        System.out.println("Random value generated is " + Math.random());
    }
}
