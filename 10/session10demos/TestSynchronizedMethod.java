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
public class TestSynchronizedMethod {

    public static void main(String[] args) {
        TrackLine obj = new TrackLine();

        // creating two threads which share same Line Object. 
        Train t1 = new Train(obj);
        Train t2 = new Train(obj);

        // both threads start executing  
        t1.start();
        t2.start();
    }
}

class TrackLine {

    // if multiple threads(trains) try to access 
    // this synchronized method on the same Object 
    // only one thread will be able to execute it at a time. 
    synchronized public void getLine(Thread t) {
        System.out.println("Thread "+t.getName());
        for (int i = 0; i < 3; i++) {
            System.out.println("Accessing line "+i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Train extends Thread {

    // Line class object 
    TrackLine l1;

    Train(TrackLine line) {
        this.l1 = line;
    }

    @Override
    public void run() {
        
        l1.getLine(this);
    }
}
