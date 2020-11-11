/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess7Codes;

/**
 *
 * @author Admin3
 */
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.Iterator;

public class CSLSdemo {

    public static void main(String args[]) {
        ConcurrentSkipListSet colors = new ConcurrentSkipListSet();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        Iterator iterator = colors.iterator();
        System.out.print("Ascending CSLS: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nDescending CSLS: " + colors.descendingSet());
        System.out.println("Lower element: " + colors.lower("Green"));
        System.out.println("Higher element: " + colors.higher("Yellow"));
    }
}
