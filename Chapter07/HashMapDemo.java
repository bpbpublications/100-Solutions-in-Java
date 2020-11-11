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
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Toy> toys = new HashMap<>();
        toys.put("1", new Toy(1001, "Barbie Doll", "Pink", 50.5f));
        toys.put("2", new Toy(1002, "Teddy Bear", "White", 40.3f));
        toys.put("3", new Toy(1003, "Aeroplane", "Blue", 50.6f));
        System.out.println(toys);
        toys.remove("3");
        System.out.println("");
        toys.put("4", new Toy(1004, "Rattles", "Multi-color", 10.5f));
        System.out.println("Toy at key 4: "+toys.get("4"));
        System.out.println("Modified HashMap");
        System.out.println(toys);
    }
}
