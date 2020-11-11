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
public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 10, b=20;
        String result;
        result = (a>b) ? "a is greater" : "b is greater";
        System.out.println(result);

//        int x = 12;  // 00001100
//        int y = 20;  // 00010100
//
//        System.out.println("x & y: " + (x & y)); // 00000100 = 4
//        System.out.println("x | y: " + (x | y)); // 00011100 = 28
//        System.out.println("x ^ y: " + (x ^ y)); // 00011000 = 24
//        System.out.println("Logical complement of x is : " + (~x)); // 00001101 = -13
//
//        System.out.println("Right shift of x by 2 is  " + (x >> 2)); // 00000011 = 3
//        System.out.println("Left shift of x by 2 is: " + (x << 2));  // 00110000 = 48
//        int num1 = 30, num2 = 23;
//        // Using conditional operators
//        System.out.println("num1 == num2? "+ (num1==num2));
//        System.out.println("num1 != num2? "+ (num1!=num2));
//        System.out.println("num1 > num2? "+ (num1>num2));
//        System.out.println("num1 < num2? "+ (num1<num2));
//        System.out.println("num1 >= num2? "+ (num1>=num2));
//        System.out.println("num1 <= num2? "+ (num1<=num2));
//        
//        // Using logical operators
//        System.out.println("Result of logical AND is "+((num1>num2) && (num1==num2)));
//        System.out.println("Result of logical OR is "+((num1>num2) || (num1==num2)));
//        int x = 3;
//        int y = x++; // i=6, j=5
//        int z = ++x; //i=6,k=6
//        x = -x; //now i is -6
//        boolean answer = false; //result is false
//        answer = !answer; //now result is true
//        
//        System.out.println("Value of y after postfix increment of x is "+ y );
//        System.out.println("Value of z after prefix increment of x is "+ z );
//        System.out.println("Value of x after negation is "+ x );
//        System.out.println("Logical complement of answer is "+ answer);
//        int add, sub, mul, div, mod;
//
//        add = 3 + 5; 
//        sub = 6 - 4; 
//        mul = 2 * 2; 
//        div = 6 / 3; 
//        mod = 4 % 2; 
//        System.out.println("Addition is " + add);
//        System.out.println("Subtraction is " + sub);
//        System.out.println("Multiplication is " + mul);
//        System.out.println("Division is " + div);
//        System.out.println("Modulo is " + mod);
    }
}
