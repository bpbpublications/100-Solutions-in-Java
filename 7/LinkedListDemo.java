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
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedL1 = new LinkedList<>();

        linkedL1.add("Mary Wilson");
        linkedL1.add("Martin Luther");
        linkedL1.add("Elvis Fetcher");
        linkedL1.add("Jack Dawson");
        linkedL1.add("John Smith");
        System.out.println("Linked list contents: " + linkedL1);
        linkedL1.removeLast();
        System.out.println("Modified Linked list contents: " + linkedL1);
    }
}
