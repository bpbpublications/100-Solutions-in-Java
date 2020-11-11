/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11demos;

/**
 *
 * @author dhrutis
 */
public class TestSingleton {

    public static void main(String[] args) {
        SingletonDemo obj = SingletonDemo.getInstance();
        obj.message();
        SingletonDemo obj1 = new SingletonDemo(); // shows error
        
    }
}

class SingletonDemo {

    private static SingletonDemo objSingle = null;

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (objSingle == null) {
            objSingle = new SingletonDemo();
        }
        return objSingle;
    }

    public void message() {
        System.out.println("This is singleton pattern demo");
    }
}
