/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.List;
/**
 *
 * @author Admin3
 */

import pkg3.TestMod3;

public class TestAllModules {

    public static void main(String a[]) {
        TestMod3 obj = new TestMod3();
        System.out.println("All messages: " + obj.getAllMessages());

        var digits = List.of(4, 3, 5, 2, 6); // inferred value 

//        ArrayList<String>; // Index of Enhanced For Loop

        for (var num : digits) {
            System.out.println(num);
        }

// Local variable declared in a loop
        for (var i = 0; i < digits.size(); i++) {
            System.out.println(digits.get(i));
        }

    }
}
