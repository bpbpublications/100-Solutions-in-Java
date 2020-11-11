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
public class TestCalculator implements Calculator<ArrayIndexOutOfBoundsException> {

    @Override
    public void calc(Integer args) throws ArrayIndexOutOfBoundsException {
        int arr[] = new int[5];

        for (int i = 0; i < args; i++) {

            arr[i] = i;
        }
    }

    public static void main(String[] args) {
        TestCalculator obj = new TestCalculator();
        obj.calc(6);
    }
}
