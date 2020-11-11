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
import java.util.Scanner;

public class AssertionDemo {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();
        assert age >= 18 : "Not valid age";

        System.out.println("Age is " + age);
//AssertionDemo obj = new AssertionDemo();
//obj.setInterval(9);
//    }
//
//    private void setInterval(int interval) {
//        int MAX_RATE = 100;
//// Verify the adherence to precondition in the non-public method
//        assert interval > 0 && interval <= 1000 / MAX_RATE : interval;
//// Set the refresh interval
//        System.out.println("Interval is set to:" + interval);
    }
}
