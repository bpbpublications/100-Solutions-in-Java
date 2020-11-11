/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10demos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author dhrutis
 */
public class ExecutorDemo {

    private static ExecutorService exe1 = null;
    private static volatile Future task1 = null;
    private static volatile Future task2 = null;
    private static volatile Future task3 = null;

    public static void main(String[] args) {
        exe1 = Executors.newFixedThreadPool(2);

        while (true) {
            try {
                taskStatus();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }

    private static void taskStatus() throws Exception {
        if (task1 == null || task1.isDone() || task1.isCancelled()) {
            task1 = exe1.submit(new ThreadClass1());
        }

        if (task2 == null || task2.isDone() || task2.isCancelled()) {
            task2 = exe1.submit(new ThreadClass2());
        }
        
        if (task3 == null || task3.isDone() || task3.isCancelled()) {
            task3 = exe1.submit(new ThreadClass2());
        }
    }
}

class ThreadClass1 implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Executing task one");
            try {
                Thread.sleep(1000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

    }
}

class ThreadClass2 implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Executing task two");
            try {
                Thread.sleep(1000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadClass3 implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Executing task three");
            try {
                Thread.sleep(1000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}
