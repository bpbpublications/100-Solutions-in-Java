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
public class FormatPercentage {

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
        displayPercentage(l);
    }

    public static void displayPercentage(Locale l) {
        NumberFormat percentFormatter;
        String strPercent;

        // Create an object of a wrapper class Double
        Double percent = 48.74;
        // Retrieve the NumberFormat instance
        percentFormatter = NumberFormat.getPercentInstance(l);
        // Format the percent figure
        strPercent = percentFormatter.format(percent);
        System.out.println("Percent format as per " + l + " is " + strPercent);
    }
}
