/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Localization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dhrutis
 */
public class FormatNumber {

    static public void displayNumber(Locale currentLocale) {
        Integer num1 = 123374;
        Double num2 = 343847.474;
        NumberFormat numObj;
        String value1;
        String value2;

        numObj = NumberFormat.getNumberInstance(currentLocale);
        value1 = numObj.format(num1);
        value2 = numObj.format(num2);
        System.out.println("Number Format as per " + currentLocale + " is " + value1);
        System.out.println("Number format as per " + currentLocale + " is " + value2);
    }

    public static void main(String[] args) {
        String language;
        String country;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter lanugage code: ");
        String lCode = s.next();
        System.out.print("Enter country code: ");
        String cCode = s.next();
        if (lCode.equals("") || cCode.equals("")) {
            language = "en";
            country = "US";
        } else {
            language = lCode;
            country = cCode;
        }
        Locale l;
        l = new Locale(language, country);
        displayNumber(l);
    }
}
