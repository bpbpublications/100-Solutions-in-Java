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
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<Object> vector1 = new Vector<>();
        vector1.addElement(3);
        vector1.addElement(8);
        vector1.addElement(4);
        vector1.addElement(5.95);
        vector1.addElement(9.055);
        System.out.println("Vector elements: " + vector1);
        System.out.println("Value at position 3: " + (Object) vector1.elementAt(2));
        vector1.removeElementAt(0);
        System.out.println("Revised Vector: " + vector1);
    }
}
