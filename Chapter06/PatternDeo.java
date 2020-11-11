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
import java.util.regex.Matcher;

public class PatternDeo {

    public static void main(String[] args) {
//        Pattern pt = Pattern.compile("b*x");
//// create the Matcher object using the Pattern object with the string to match
//        Matcher mt = pt.matcher("bbbx");
//         Matcher mt1 = pt.matcher("bxbx");
//          Matcher mt2 = pt.matcher("bxxx");
//           Matcher mt3 = pt.matcher("bbxx");
//// check for a match
//        boolean result = mt.matches();
//         boolean result1 = mt1.matches();
//          boolean result2 = mt2.matches();
//           boolean result3 = mt3.matches();
//        System.out.println("Pattern Match: "+result);
//        System.out.println("Pattern Match: "+result1);
//        System.out.println("Pattern Match: "+result2);
//        System.out.println("Pattern Match: "+result3);
//        System.out.println(Pattern.matches("\\d","4"));
        
        boolean result = Pattern.matches("[A-Z]\\d\\d\\d\\d", "E0031");
        System.out.println(result);
    }
}
