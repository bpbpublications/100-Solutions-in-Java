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
public class Producer implements Runnable {

    private final List<Integer> queue;
    private final int SIZE;

    public Producer(List<Integer> queue, int size) {
        this.queue = queue;
        SIZE = size;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            try {
                produce(counter++);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void produce(int i) throws InterruptedException {
        synchronized (queue) {
            while (queue.size() == SIZE) {
                System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + queue.size());
                queue.wait();
            }

            Thread.sleep(3000);
            queue.add(i);
            System.out.println("Produced: " + i);
            queue.notifyAll();
        }
    }
}
