/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess5Codes;

/**
 *
 * @author Admin3
 */
@FunctionalInterface
public interface IPrintable {
    void printMsg(String msg);
    
    // Functional interface can contain
    // any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);
    
    default void displayData(){
        System.out.println("Hello!! This is a default method");
    }
}
