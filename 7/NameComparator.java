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
import java.util.Comparator;

public class NameComparator implements Comparator<Students> {

    @Override
    public int compare(Students obj1, Students obj2) {
        Students s1 = (Students) obj1;
        Students s2 = (Students) obj2;

        return s1.name.compareTo(s2.name);
    }
}
