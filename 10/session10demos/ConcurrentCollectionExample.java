/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 *
 * @author dhrutis
 */
public class ConcurrentCollectionExample {
   static BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);
   public static void main(String[] args) throws
         InterruptedException {
      int noOfProducers = 7;
      int noOfConsumers = 9;
      for (int i = 0; i < noOfProducers; i++) {
         new Thread(new Producer(), "PRODUCER "+i).start();
      }
      for (int i = 0; i < noOfConsumers; i++) {
         new Thread(new Consumer(), "CONSUMER "+i).start();
      }
      System.exit(0);
   }
   static class Producer implements Runnable {
      Random random = new Random();
      @Override
      public void run() {
         try {
            int num = random.nextInt(100);
            queue.put(num);
            System.out.println(Thread.currentThread().getName()+ " produced: " + num
               + " Queue size : "+ queue.size());
            Thread.sleep(100);
         } catch (InterruptedException ex) {
            System.out.println("Producer "+ Thread.currentThread().getName() +" is interrupted.");
         }
      }
   }
   static class Consumer implements Runnable {
      @Override
      public void run() {
         try {
            System.out.println(Thread.currentThread().getName()+ " consumed: " + queue.take()
               + " Queue size : "+ queue.size());
            Thread.sleep(100);
         } catch (InterruptedException ex) {
            System.out.println("Consumer "+Thread.currentThread().getName()+" is interrupted.");
         }
      }
   }
}

    
