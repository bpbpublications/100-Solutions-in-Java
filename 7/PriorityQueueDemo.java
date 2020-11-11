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
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("Red");
        pq.offer("Green");
        pq.offer("Blue");
        pq.offer("Yellow");
        System.out.println("Priority queue contents: "+pq);
        System.out.println("1. Removed: " + pq.poll()); // removes
        System.out.println("2. Removed: " + pq.poll()); // removes
        System.out.println("3. Viewed: " + pq.peek());
        System.out.println("4. Viewed: " + pq.peek());
        System.out.println("5. Removed: " + pq.remove()); // removes
        System.out.println("6. Removed: " + pq.remove()); // removes
        System.out.println("7. Viewed: " + pq.peek());
        System.out.println("Priority queue contents: "+pq);
        System.out.println("8. Viewed: " + pq.element());// Throws Exception
    }
}
