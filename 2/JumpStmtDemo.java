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
public class JumpStmtDemo {
    public static void main(String[] args) {
        int stopVal;
        for (int cnt = 1; cnt <= 10; cnt++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number or zero to stop:");
            stopVal = input.nextInt();
            if (stopVal == 0) {
                System.out.println("Got zero. Loop terminated.");
                break;
            }
        }
        System.out.println("");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Value of i is " + i);
        }
    }
}
