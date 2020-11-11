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
public class IsAliveDemo extends Thread {

    public void run() {
        System.out.println("Hello");
        try {
            Thread.sleep(300);
        } catch (InterruptedException ie) {
        }
        System.out.println("World");
    }

    public static void main(String[] args) {
        IsAliveDemo t1 = new IsAliveDemo();
        IsAliveDemo t2 = new IsAliveDemo();
        System.out.println("T1 is alive? "+t1.isAlive());
        System.out.println("T2 is alive? "+t2.isAlive());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
