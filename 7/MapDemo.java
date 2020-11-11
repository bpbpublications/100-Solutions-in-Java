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
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map1 = Map.of(101, "Java", 102, "Struts", 103, "Hibernate");
        for (Map.Entry<Integer, String> m : map1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        
        System.out.println("Map created by using entries");
         // Creating Map Entry  
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");  
        Map.Entry<Integer, String> e2 = Map.entry(102, "Struts");  
        // Creating Map using map entries  
        Map<Integer, String> map2 = Map.ofEntries(e1,e2);  
        // Iterating Map   
        for(Map.Entry<Integer, String> m : map2.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }
}
