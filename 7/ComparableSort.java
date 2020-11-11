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
import java.util.Collections;
import java.util.ArrayList;

public class ComparableSort {

    public static void main(String args[]) {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(1, "John", 23));
        st.add(new Student(8, "Mary", 27));
        st.add(new Student(3, "Roger", 21));

        Collections.sort(st);
        for (Student s : st) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}
