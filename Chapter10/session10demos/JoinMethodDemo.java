/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos;

/**
 *
 * @author dhrutis
 */
public class JoinMethodDemo extends Thread {

    public void run() {
        System.out.println("Hello");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ie) {
        }
        System.out.println("World");
    }

    public static void main(String[] args) {
        JoinMethodDemo t1 = new JoinMethodDemo();
        JoinMethodDemo t2 = new JoinMethodDemo();
        t1.start();

        try {
            t1.join(); // Waiting for t1 to finish 
        } catch (InterruptedException ie) {
        }
        t2.start();
    }
}
