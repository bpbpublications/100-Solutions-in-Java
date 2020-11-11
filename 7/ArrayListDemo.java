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
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        System.out.println("List size is : " + list1.size());
        for (int i = 1; i <= 5; i++) {
            list1.add(""+i);
        }
        System.out.println("List of numbers added: "+list1);
        list1.set(4, "20");
        
        System.out.println("Modified list of numbers: "+list1);
        System.out.println("Value at position 4 is: " + (String) list1.get(3));
        
        //using the factory method to create an ArrayList
        
        List<String> list2 = List.of("Java","Java EE","Spring","Hibernate","Struts");  
        System.out.println("Java Topics");
        for (String l : list2) {
            System.out.println(l);  
        }
    }
}
