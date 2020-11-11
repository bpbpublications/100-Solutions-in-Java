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
public class AgeComparator implements Comparator<Students> {

    @Override
    public int compare(Students obj1, Students obj2) {
        Students s1 = (Students) obj1;
        Students s2 = (Students) obj2;

        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
