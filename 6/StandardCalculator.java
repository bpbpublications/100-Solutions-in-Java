/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess6Codes;

import java.util.Scanner;

/**
 *
 * @author Admin3
 */
public class StandardCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        
        try {
            StandardCalculator obj = new StandardCalculator();
            obj.calculate(num1, num2);
        } catch (StandardException e) {
            Throwable t = e.getCause(); 
            // print the message and the cause
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + t); 
        } finally {
            System.out.println("----------------------");
            System.out.println("All resources closed in finally block");
        }
    }

    public void calculate(int a, int b) throws StandardException{
        try {
            int c = a / b;
            System.out.println("Division of " + a + " and " + b + " is " + c);

            int arr[] = new int[c];
            for (int i = 0; i <= arr.length; i++) {
                arr[i] = i + 1;
            }
        } catch (ArithmeticException e) {
            throw new StandardException("Divide by zero", e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new StandardException("Array Index out of bounds", e);
        } 
    }
}
