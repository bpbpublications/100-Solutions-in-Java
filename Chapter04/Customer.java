/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess4Codes;

/**
 *
 * @author Admin3
 */
public class Customer {

    private String custId, custName;

    public Customer(String custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }
    
    public void displayCustomerDetails(){
        System.out.println("Customer Id: "+custId);
        System.out.println("Customer Name: "+custName);
    }
    public static void main(String[] args) {
        String id = args[0];
        String name = args[1];
        Customer c1 = new Customer(id,name);
        c1.displayCustomerDetails();
        
    }
}
