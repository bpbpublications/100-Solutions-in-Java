/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess7Codes;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 *
 * @author Admin3
 */
public class CSLMdemo {
    public static void main(String args[]) {
        ConcurrentSkipListMap colors = new ConcurrentSkipListMap();
        colors.put(1,"Red");
        colors.put(2,"Green");
        colors.put(5,"White");
        colors.put(4,"Yellow");

        System.out.println("Descending CSLM: " + colors.descendingMap());
        System.out.println("First entry: " + colors.firstEntry());
        System.out.println("Last entry: " + colors.lastEntry());
    }
}
