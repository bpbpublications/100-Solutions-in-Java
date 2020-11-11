/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess5Codes;

/**
 *
 * @author Admin3
 */
public class OuterClass {
    
    String outerVariable;
    
    public void outerMethod(String message) {

//        class LocalInner {
//
//            public String getMessage() {
//
//                return "Hello!! ";
//            }
//        }
//        LocalInner obj = new LocalInner();
//        System.out.println(obj.getMessage() + "Message received: " + message);
        AnonymousInner obj = new AnonymousInner() {
            @Override
            public void displayMessage(String msg) {
                System.out.println("Received message: " + msg);
            }
        };
        obj.displayMessage(message);
    }

//    class InnerClass {
//
//        public String sayHello() {
//            // invoke outer class method from inner class
//            outerMethod("Good Morning");
//            // initialize outer class variable from inner clsas
//            outerVariable = "Hello!!";
//            return outerVariable;
//        }
//    }
//    public static void outerMethod1() {
//        System.out.println("Outer class static method");
//
//    }
//    static class InnerClass {
//
//        public static void sayHello() {
//            outerMethod1();
//            System.out.println("Greetings from Inner class");
//
//        }
//    }
}

class AnonymousInner {

    public void displayMessage(String msg) {
    }
}
