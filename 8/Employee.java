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
public class Employee<T> {

    T empObj;

    Employee(T obj) {
        empObj = obj;
    }
// Return empObj

    T getObj() {
        return empObj;
    }
}
