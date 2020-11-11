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
public class RunnableInterfaceDemo {

    public static void main(String[] args) {
        
        // instantiate the class
        Thread1 objT1 = new Thread1();
        // pass its object to Thread class constructor
        Thread t = new Thread(objT1);
        //invoke the start method
        t.start();
    }

}
// Declare a class and implement Runnable interface
class Thread1 implements Runnable {

    String tName; // stores thread name

    // implement the run() method
    @Override
    public void run() {
        int tCount = 1; // stores thread count
        while (tCount < 5) {
            tName = Thread.currentThread().getName();
            System.out.println("Thread name = "+tName);
            tCount++;
        }
    }
}
