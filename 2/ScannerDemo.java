/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.util.Scanner;

/**
 *
 * @author Admin3
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer value:");
        int intNum = scan.nextInt();
        System.out.println("Enter a decimal value:");
        float floatNum = scan.nextFloat();
        System.out.println("Enter a String value");
        String str = scan.next();
        System.out.println("Values you entered are: ");
        System.out.println(intNum + " " + floatNum + " " + str);

    }

}
