/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess3Codes;

import java.util.Scanner;

/**
 *
 * @author Admin3
 */
public class Calculator {

//    private int sum;
//    private String name;

//    public int add(int a, int b) {
//        sum = a + b;
//        return sum;
//    }
//
//    public Calculator() {
//        name = "Undefined";
//    }
//
//    public Calculator(String username) {
//        name = username;
//    }
//    {
//        name = "Unknown";
//
//    }
    // overloaded method 1
    public void add(int a, int b){
        System.out.println("Sum is "+ (a+b));
    }
    
    // overloaded method 2
    public void add(int a, float b){
        System.out.println("Sum is "+ (a+b));
    }
    
    // overloaded method 3
    public void add(int a, int b, float c){
        System.out.println("Sum is "+ (a+b+c));
    }
    
    // overloaded method 4
    public void add(float a, int b){
        System.out.println("Sum is "+ (a+b));
                
    }
            
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.add(2.5f, 3);
        c1.add(3, 4, 5.6f);
        c1.add(4, 5);
        c1.add(3, 6, 2.4f);
//        Calculator objCalc = new Calculator();
//        System.out.println("Your name is " + objCalc.name);
//
//        objCalc.name = "John";
//        System.out.println("Your name is " + objCalc.name);
        
//        Calculator objCalc1 = new Calculator();
//        System.out.println("Your name is " + objCalc1.name);

//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your name");
//        objCalc.name = s.next();
//        System.out.println("Enter first number: ");
//        int num1 = s.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = s.nextInt();
//        System.out.println("Dear, "+objCalc.name);
//        System.out.println("Sum of "+num1+" and "+num2 +" is " + objCalc.add(num1, num2));
    }
}
