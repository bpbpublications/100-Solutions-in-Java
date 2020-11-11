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
public class muiltifor {

    public static void main(String[] args) {
        int i, j;
        int max = 5;
        /*
* The initialization and increment/decrement section includes
* more than one variable
         */
        for (i = 0, j = max; i <= max; i++, j--) {
            System.out.println(i + "+" + j + "=" + (i + j));
        }
    }
}


