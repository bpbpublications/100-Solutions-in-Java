/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos.Multithreading;

import java.util.List;

/**
 *
 * @author dhrutis
 */
public class Consumer implements Runnable {

    private final List<Integer> queue;

    public Consumer(List<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (queue) {
            while (queue.isEmpty()) {
                System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + queue.size());
                queue.wait();
            }
            Thread.sleep(1000);
            int i = (Integer) queue.remove(0);
            System.out.println(Thread.currentThread().getName() + " consumed: " + i);
            queue.notifyAll();
        }
    }
}
