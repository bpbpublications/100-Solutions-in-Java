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
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Deque;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        Deque<String> deque1 = new ArrayDeque();
        deque1.addLast("Red");
        deque1.addLast("Green");
        deque1.addFirst("Blue");
        
        System.out.println("Deque Contents");
        for (Iterator iter = deque1.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        
        System.out.println("Reverse Deque");
        for (Iterator iter = deque1.descendingIterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        System.out.println("First Color: " + deque1.getFirst());
        System.out.println("Last Color: " + deque1.getLast());
        System.out.println("Deque contains \"Yellow\": " + deque1.contains("Yellow"));
    }
}
