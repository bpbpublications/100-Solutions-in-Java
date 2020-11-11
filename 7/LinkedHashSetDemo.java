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
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Toy> hs = new LinkedHashSet<>();
        //Creating Toys  
        Toy toy1 = new Toy(1001, "Barbie", "Pink", 40.0f);
        Toy toy2 = new Toy(1002, "Teddy Bear", "White", 20.5f);
        Toy toy3 = new Toy(1003, "Aeroplane", "Blue", 50.5f);
        //Adding Toys to hash set  
        hs.add(toy1);
        hs.add(toy2);
        hs.add(toy3);
        //Traversing hash set 
        for (Toy t : hs) {
            System.out.println(t.id + " " + t.name + " " + t.color + " " + t.price);
        }
    }
}
