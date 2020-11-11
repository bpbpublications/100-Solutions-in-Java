/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess6Codes;

/**
 *
 * @author Admin3
 */
public class SystemClassDemo {

    static String str1[] = {"Mon", "Tue", "Wed", "Thu"};
    static String str2[] = {"East", "West", "North", "South"};

    public static void main(String[] args) {

        System.out.println("Current time in milliseconds is: " + System.currentTimeMillis());
        System.out.println("Value of Path variable is: " + System.getenv("PATH"));
        System.arraycopy(str1, 0, str2, 0, 3);
        System.out.println("Copied array is: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(str2[i]);
        }
    }
}
