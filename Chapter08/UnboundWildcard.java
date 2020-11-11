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

public class UnboundWildcard {

    public static void main(String[] args) {

        //Integer List 
        List<Integer> intList = Arrays.asList(3, 8, 5);

        //Double list 
        List<Double> doubleList = Arrays.asList(2.4, 1.2, 6.5);

        displayList(intList);

        displayList(doubleList);
    }

    private static void displayList(List<?> list) {

        System.out.println(list);
    }
}
