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
public class Employee {
    
    private String id, name;
    private float salary;    
    
    public Employee(String id, String name, float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public void displayDetails(){
        System.out.println("Employee id: "+ id);
        System.out.println("Employee name: "+ name);
        System.out.println("Salary : $"+salary);
    }
}
