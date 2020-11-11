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
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashMapExample {
     public static void main(String args[]) {
      // Create a hash map
      LinkedHashMap<String,Double> lhm1 = new LinkedHashMap<>();
      
      // Put elements to the map
      lhm1.put("Barbie Doll", 43.34);
      lhm1.put("Teddy Bear", 23.2);
      lhm1.put("Aeroplane", 58.00);
  
      // Get a set of the entries
      Set set1 = lhm1.entrySet();
      
      // Get an iterator
      Iterator i = set1.iterator();
      
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": "+ me.getValue() +"\n");
      }
           
      // Change price of Aeroplane
      double price = lhm1.get("Aeroplane");
      lhm1.put("Aeroplane", (price + 5.6));
         
      System.out.println("New price of Aeroplane: " + lhm1.get("Aeroplane"));
      
      System.out.println("Modified Map: "+lhm1);
   }
}
