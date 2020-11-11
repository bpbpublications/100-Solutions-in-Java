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
public class ThreadPriorityDemo {

    public static void main(String[] args) {
        System.out.println("Main thread started");
        One t1 = new One();
        Two t2 = new Two();
        Three t3 = new Three();
        t3.setPriority(Thread.MAX_PRIORITY);  // priority = 10 
        t2.setPriority(t1.getPriority() + 1); // default priority + 1 = 6 
        t1.setPriority(Thread.MIN_PRIORITY); // priority =l 
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Main Thread Exited");
    }
}

class One extends Thread {

    @Override
    public void run() {
        System.out.println("Thread One Started with priority: "+ this.getPriority());
        for (int num = 0; num < 5; num++) {
            System.out.println("\t value of num in Thread One: " + num);
        }
        System.out.println("Thread One Exited");
    }
}

class Two extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Two started with priority: "+ this.getPriority());
        for (int num = 0; num < 5; num++) {
            System.out.println("\tValue of num in Thread Two: " + num);
        }
        System.out.println("Thread Two Exited");
    }
}

class Three extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Three started with priority: "+ this.getPriority());
        for (int num = 0; num < 5; num++) {
            System.out.println("\tValue of num in Thread Three: " + num);
        }
        System.out.println("Thread Three Exited");
    }
}
