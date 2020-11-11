/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess3Codes;

/**
 *
 * @author Admin3
 */
public class StaticDemo {

    static int staticVar = 0;
    int instanceVar = 0;

    static {
        System.out.println("Static block executed");
    }

    public static void staticMethod() {
        System.out.println("Static method executed");
    }

    public void display() {
        staticVar++;
        instanceVar++;
        System.out.println("Value of instance variable is:" + instanceVar);
        System.out.println("Value of static variable is:" + staticVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");

        StaticDemo.staticMethod();

        StaticDemo obj1 = new StaticDemo();
        obj1.display();

        StaticDemo obj2 = new StaticDemo();
        obj2.display();

        StaticDemo obj3 = new StaticDemo();
        obj3.display();
    }
}
