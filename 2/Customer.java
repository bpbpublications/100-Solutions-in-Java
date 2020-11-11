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
public class Customer {

    public static void main(String[] args) {
        // Declaring variables
        int custId;  // variable of type Integer

        float payableAmt; // variable of type Float

        // Declaring and initializing the variables 
        double creditScore = 456790.897;  // variable of type Double

        char premiumCust = 'Y';  // variable of type Character

        boolean paymentStatus = false;  // varaibale of type Boolean


        String address = "10, NorthDriven Park"; // variable of type String
        
        // Initializing the declared variables
        custId = 1007;
        payableAmt = 10487.50f;
        
        // Displaying the values of variables on the console
        System.out.println("Customer Id: " + custId);
        System.out.println("Address: " + address);
        System.out.println("Order Amount: " + payableAmt);
        System.out.println("Premium Customer?: " + premiumCust);
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Payment Status: " + paymentStatus);
        }
}
