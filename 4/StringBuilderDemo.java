/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess4Codes;

/**
 *
 * @author Admin3
 */
public class StringBuilderDemo {

    StringBuilder msg = new StringBuilder("JPMS was introduced in Java ");

    public void display() {
        System.out.println("String length:" + msg.length());
        System.out.println("String after appending: " + msg.append("9"));
        System.out.println("String after insertion: " + msg.insert(28, "SE "));
        System.out.println("String after deletion: " + msg.delete(28, 31));
        System.out.println("Reversed string: " + msg.reverse());
    }

    public static void main(String[] args) {

        StringBuilderDemo obj = new StringBuilderDemo();

        obj.display();
    }
}
