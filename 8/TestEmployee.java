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
public class TestEmployee<T, V> extends Employee<T> {

    V valObj;

    TestEmployee(T obj, V obj2) {
        super(obj);
        valObj = obj2;
    }

    V getob2() {
        return valObj;
    }

    public static void main(String args[]) {
        TestEmployee<String, Float> emp1;
        emp1 = new TestEmployee<>("Part Time", 2000f);
        System.out.println("Employee Type: " + emp1.getObj());
        System.out.println("Salary: $" + emp1.getob2());
    }
}
