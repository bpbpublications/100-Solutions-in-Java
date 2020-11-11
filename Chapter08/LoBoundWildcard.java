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

public class LoBoundWildcard {

    public static void main(String[] args) {
        //Integer List - lower bounded
        List<Integer> intList = Arrays.asList(2, 8, 5, 6);

        displayList(intList);

        //Number list 
        List<Number> numList = Arrays.asList(2.5, 8.2, 5.6, 6.4);

        displayList(numList);
    }

    public static void displayList(List<? super Integer> list) {
        System.out.println(list);
    }
}
