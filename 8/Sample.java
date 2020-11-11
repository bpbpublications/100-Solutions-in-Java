/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess8Codes;

/**
 *
 * @author Admin3
 */
public class Sample {
    // generic constructor

    <T> Sample(T t) {
         System.out.println("The value is "+ t);
    }

    public static void main(String[] args) {
        // instantiate the class
        Sample obj = new Sample(10);
        Sample obj1 = new Sample("Hello");
    }
}
