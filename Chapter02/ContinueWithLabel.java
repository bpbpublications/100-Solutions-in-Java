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
public class ContinueWithLabel {

    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                } 
                System.out.print(j);
            } 
            System.out.println("\nEnd of outer loop.");
        } 
    }
}
