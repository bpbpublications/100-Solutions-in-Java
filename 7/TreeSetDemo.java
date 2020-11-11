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
import java.util.TreeSet;
import java.util.SortedSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Creating a TreeSet
        SortedSet<String> colors = new TreeSet<>();

        // Adding new elements to a TreeSet
        colors.add("Blue");
        colors.add("Pink");
        colors.add("White");
        colors.add("Orange");

        System.out.println("Colors: " + colors);

        // Duplicate elements are ignored
        colors.add("White");
        System.out.println("After adding duplicate element \"White\" : " + colors);

        // This will be allowed because it is in lowercase.
        colors.add("blue");
        System.out.println("After adding \"blue\" : " + colors);
        
        SortedSet<String> names = new TreeSet<>();
   names.add("Brian");
   names.add("Pearl");
   names.add("Vicky");
   names.add("Linda");

   System.out.println("Names: " + names);

    }
}
