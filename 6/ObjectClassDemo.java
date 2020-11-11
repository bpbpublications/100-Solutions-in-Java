/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess6Codes;

/**
 *
 * @author Admin3
 */
public class ObjectClassDemo {

    Integer val;

//    public ObjectClassDemo() {
//    }

    public ObjectClassDemo(Integer val) {
        this.val = val;
    }

    public static void main(String[] args) {
        // creating objects of ObjectClass class
        ObjectClassDemo obj1 = new ObjectClassDemo(4577);
        ObjectClassDemo obj2 = new ObjectClassDemo(4577);
      
        System.out.println("String form of obj1 is "+obj1.val.toString());
        // check for equality of objects
        if (obj1.equals(obj2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
        obj2 = obj1; // assigning reference of obj1 to obj2
        // again check for equality of objects
        if (obj1.equals(obj2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    }
}


