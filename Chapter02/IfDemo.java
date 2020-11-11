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
public class IfDemo {

    public static void main(String[] args) {

        int age = 43;
        char gender = 'F';

        
        if (age >= 60) {
            System.out.println("Elibible for membership.");
            System.out.println("Discount 50%");
        } else if (age >= 18) {
            System.out.println("Elibible for membership.");
            if (gender == 'F') {
                System.out.println("Discount 10%");
            } else {
                System.out.println("Discount 5%");
            }
        } else {
            System.out.println("Not eligible for membership.");
        }

    }

}
