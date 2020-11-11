/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess7Codes;

/**
 *
 * @author Admin3
 */
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSort {

    public static void main(String[] args) {

        ArrayList<Students> st = new ArrayList<>();
        st.add(new Students(1, "John", 23));
        st.add(new Students(8, "Roger", 27));
        st.add(new Students(3, "Mary", 21));

        System.out.println("Sorted by age");

        Collections.sort(st, new AgeComparator());
        for (Students s : st) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }

        System.out.println("Sorted by name");

        Collections.sort(st, new NameComparator());
        for (Students s : st) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}
