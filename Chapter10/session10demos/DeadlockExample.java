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
public class DeadlockExample {

    public static Object resource1 = new Object();
    public static Object resource2 = new Object();

    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }

    private static class Thread1 extends Thread {

        public void run() {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding Resource 1");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1: Waiting for Resource 2");

                synchronized (resource2) {
                    System.out.println("Thread 1: Holding Resource 1 & 2");
                }
            }
        }
    }

    private static class Thread2 extends Thread {

        public void run() {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding Resource 2");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 2: Waiting for Resource 1");

                synchronized (resource1) {
                    System.out.println("Thread 2: Holding Resource1 & 2");
                }
            }
        }
    }
}
