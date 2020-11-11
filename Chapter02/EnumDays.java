/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

/**
 *
 * @author Admin3
 */
public class EnumDays {
    // Defining an enumeration of days of week
    enum Days {
        Sun, Mon, Tue, Wed, Thu, Fri, Sat
    }

    public static void main(String[] args) {
       // Declaring a variable of type Days
        Days day;  
// Instantiate the enum Direction
        day = Days.Fri; // Instantiating the enum Days
// Printing the value of enum
        System.out.println("Today is: " + day);
    }
}
