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
public class VarArgsMethod {

    public void multiplyVals(int... val) {
        int result = 1;

        for (int x : val) {
            result = result * x;
        }
        System.out.println("Multiplication of numbers is " + result);
    }

    public static void main(String[] args) {

        VarArgsMethod obj = new VarArgsMethod();

        obj.multiplyVals(1, 3, 5, 7);
    }
}
