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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericCollection {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>(3);
        items.add("I001");
        items.add("I002");
        items.add("I003");
        System.out.println("Item Numbers");
        Iterator<String> value = items.iterator();
        while (value.hasNext()) {
            String itemObj = value.next();
            System.out.println("" + itemObj);
        }
    }
}
