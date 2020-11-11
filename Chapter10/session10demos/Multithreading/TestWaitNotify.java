/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos.Multithreading;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhrutis
 */
public class TestWaitNotify {

    public static void main(String[] args) {
        List<Integer> queue = new ArrayList<Integer>();
        int SIZE = 5;
        Thread tProducer = new Thread(new Producer(queue, SIZE), "Producer");
        Thread tConsumer1 = new Thread(new Consumer(queue), "Consumer 1");
        Thread tConsumer2 = new Thread(new Consumer(queue), "Consumer 2");
        tProducer.start();
        tConsumer1.start();
        tConsumer2.start();
    }
}
