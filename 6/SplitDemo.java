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
import java.util.regex.Pattern;
public class SplitDemo {

    private static final String REGEX = ":";
    private static final String DIRECTION = "East:West:North:South";

    private static final String REGEX1 = "\\d";
    private static final String DIRECTIONS = "East1West2North3South";

    public static void main(String[] args) {
        Pattern objP1 = Pattern.compile(REGEX);
        String[] directions = objP1.split(DIRECTION);
        for (String s : directions) {
            System.out.println(s);
        }
        
        System.out.println("---------");
        Pattern obj1 = Pattern.compile(REGEX1);
        String[] days = obj1.split(DIRECTIONS);
        for (String s : days) {
            System.out.println(s);
        }
    }
}
