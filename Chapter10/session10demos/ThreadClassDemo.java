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
public class ThreadClassDemo extends Thread {

    String threadName;

    public void run() {
        
        int num = 0;
        while (num <= 3) {
            //Display the number of threads
            System.out.println("Active thread count:"+Thread.activeCount());
            //Displays the currently running thread
            threadName = Thread.currentThread().getName();
            num++;
            System.out.println("Current thread is "+threadName);
            if (threadName.equals("T1")) {
                System.out.println("This is Thread 1");
            } else {
                System.out.println("Unknown thread");
            }
        }
    }

    public static void main(String args[]) {
        ThreadClassDemo obj = new ThreadClassDemo();
        obj.setName("T1");
        //Checks if thread is alive
        System.out.println("Current thread is alive? "+Thread.currentThread().isAlive());
        System.out.println("Thread T1 is alive? "+obj.isAlive());
        // invoke the start method on the thread
        obj.start();
        System.out.println("Current thread is alive? "+Thread.currentThread().isAlive());
        System.out.println("Thread T1 is alive? "+obj.isAlive());
    }
}
