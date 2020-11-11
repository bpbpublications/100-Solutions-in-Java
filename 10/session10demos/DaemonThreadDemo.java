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
public class DaemonThreadDemo extends Thread {

    public void run() {
        //check for daemon thread
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread at work");
        } else {
            System.out.println("User thread at work");
        }
    }

    public static void main(String[] args) {
        // create thread objects
        DaemonThreadDemo t1 = new DaemonThreadDemo();
        DaemonThreadDemo t2 = new DaemonThreadDemo();
        DaemonThreadDemo t3 = new DaemonThreadDemo();

        t1.setDaemon(true);// set t1 as daemon thread  
        
        //start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
