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
import java.util.Arrays;
import java.util.List;

public class UpBoundWildcard {

    public static void main(String[] args) {

        //Integer List - upper bounded
        List<Integer> intList = Arrays.asList(5, 2, 4, 6);

        System.out.println("Total sum is:" + sum(intList));

        //Double list 
        List<Double> doubleList = Arrays.asList(3.5, 2.8, 5.5);

        System.out.println("Total sum is:" + sum(doubleList));
    }

    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
