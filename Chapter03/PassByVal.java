/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess3Codes;

/**
 *
 * @author Admin3
 */
public class PassByVal {
   
    public void modifyVal(int val) {
        val = val + 10;
    }

    public static void main(String[] args) {
        int val = 10;
        PassByVal obj1 = new PassByVal();

        obj1.modifyVal(val);

        System.out.println("Value of val after method invocation is " + val);
    }
}
