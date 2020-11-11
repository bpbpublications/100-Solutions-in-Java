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
import java.util.Map;
import java.util.HashMap;

public class Demo {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("One");
        List<? extends String> list2 = new ArrayList<>();
        list1.addAll(list2);

//        list1.addAll(new ArrayList<>());
        Map<String, List<String>> map1 = new HashMap();
        
    }
}
