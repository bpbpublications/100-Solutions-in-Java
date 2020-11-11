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
public class JumpWithLabel {

    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                if (j == 2) {
                    System.out.println("Found 2. Jumping out.");
                    // Break out of inner loop
                    break outer;
                }
            }
        }
        System.out.println("Out of outer loop");
        
        
    }
}
