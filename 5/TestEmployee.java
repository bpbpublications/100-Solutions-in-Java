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
public class TestEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Emp1", "John Smith", 4000f);
        emp1.displayDetails();
        System.out.println("--------------");

        Employee emp2 = new ContractEmployee("Emp2", "Mark Stevens", 2000f, 6);
        emp2.displayDetails();
//ContractEmployee emp2 = new ContractEmployee("Emp2","Mark Stevens", 2000f, 6);
//        emp2.displayDetails();
    }
}
