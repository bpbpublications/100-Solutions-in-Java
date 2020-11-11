/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author dhrutis
 */
public class AtomicExample {
    public static void main(String[] args) throws InterruptedException {

        Threads t = new Threads();
        Thread t1 = new Thread(t, "Thread 1");
        t1.start();
        Thread t2 = new Thread(t, "Thread 2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Thread counter = " + t.getCounter());
    }
}

class Threads implements Runnable {
    private AtomicInteger counter = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            doSomething(i);
            counter.incrementAndGet();
        }
    }

    public int getCounter() {
        return this.counter.get();
    }

    private void doSomething(int i) {
        System.out.println("Processing...");
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
