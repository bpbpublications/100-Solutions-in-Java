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
public class ContractEmployee extends Employee{
    
    int duration;
    
    public ContractEmployee(String id, String name, float salary, int duration){
        super(id,name,salary);
        this.duration=duration;
    }
    @Override
    public void displayDetails(){
        System.out.println("Employee Details");
        super.displayDetails();
        System.out.println("Contract duration: "+duration+" months");
    }
}
