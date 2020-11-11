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
public class MultithreadingDemo extends Thread {

    String name;

    @Override
    public void run() {
        while (true) {
            name = Thread.currentThread().getName();
            System.out.println(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        MultithreadingDemo t1 = new MultithreadingDemo();
        MultithreadingDemo t2 = new MultithreadingDemo();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
        System.out.println("Total threads in execution: " + Thread.activeCount());
    }
}
