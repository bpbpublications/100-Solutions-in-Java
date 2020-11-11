/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11demos;

import java.util.Scanner;

/**
 *
 * @author dhrutis
 */
public class CheckBonus {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details");
        System.out.println("Emp Id: ");
        emp.empid = sc.nextLine();

        System.out.println("Emp Name: ");
        emp.name = sc.nextLine();
        Employee ef = new FullTime();
        System.out.println("Full Time Employee");

        System.out.println("Emp Id: ");
        ef.empid = sc.nextLine();

        System.out.println("Emp Name: ");
        ef.name = sc.nextLine();

        if (emp instanceof Employee) {
            emp.bonus = 5000;
            System.out.println(emp.name + " received bonus of $" + emp.bonus);
        }
        if (emp instanceof FullTime) {
            emp.bonus = 7000;
            System.out.println(emp.name + " received bonus of $" + emp.bonus);
        }
        if (ef instanceof Employee) {
            ef.bonus = 7000;
            System.out.println(ef.name + " received bonus of $" + ef.bonus);
        }
        if (ef instanceof FullTime) {
            ef.bonus = 12000;
            System.out.println(ef.name + " received bonus of $" + ef.bonus);
        }
    }
}

class Employee {

    String empid;
    String name;
    String type;
    int bonus;
}

class FullTime extends Employee {

    String shift;
}

class PartTime extends Employee {

    String hours;
}
