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
public class DeadlockDemo implements Runnable {

    public static void main(String args[]) {
        DeadlockDemo objDead1 = new DeadlockDemo();
        DeadlockDemo objDead2 = new DeadlockDemo();
        Thread objTh1 = new Thread(objDead1);
        Thread objTh2 = new Thread(objDead2);
        objDead1.grabIt = objDead2;
        objDead2.grabIt = objDead1;
        objTh1.start();
        objTh2.start();
        System.out.println("Started");
        try {
            objTh1.join();
            objTh2.join();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.exit(0);
    }
    DeadlockDemo grabIt;

    @Override
    public synchronized void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        grabIt.syncIt();
    }

    public synchronized void syncIt() {
        try {
            Thread.sleep(500);
            System.out.println("Sync");
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("In the syncIt() method");
    }

}
