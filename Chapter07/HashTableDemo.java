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
import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String, String> toys = new Hashtable<>();
        toys.put("T001", "Barbie Doll");
        toys.put("T002", "Teddy Bear");
        toys.put("T003", "Aeroplane");
        String toy = (String) toys.get("T002");
        System.out.println("Selectd toy: " + toy);
        System.out.println("Is hash table empty? " + (toys.isEmpty()?"Yes":"No"));
        System.out.println("Does the hash table contain key T003? " + 
                (toys.containsKey("T003")?"Yes":"No"));
        Enumeration toyIds = toys.keys();
        while (toyIds.hasMoreElements()) {
            String code = (String) toyIds.nextElement();
            System.out.println(code + ": " + (String) toys.get(code));
        }
    }
}
