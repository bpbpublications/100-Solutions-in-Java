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

import java.util.Set;
public class SetDemo {
 
    public static void main(String[] args) {  
        Set<String> set = Set.of("Java","JavaEE","Spring","Hibernate","Struts");  
        System.out.println("Java Topics");
        for(String l:set) {  
            System.out.println(l);  
        }  
    }  
}
