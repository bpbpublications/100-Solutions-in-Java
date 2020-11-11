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
public class FormatCurrency {

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
        displayCurrency(l);
    }

    public static void displayCurrency(Locale l) {
        NumberFormat currencyFormatter;
        String strCurrency;

        // Create an object of a wrapper class Double
        Double currency = 3847.78;
        // Retrieve the NumberFormat instance
        currencyFormatter = NumberFormat.getCurrencyInstance(l);
        // Format the currency
        strCurrency = currencyFormatter.format(currency);
        System.out.println("Currency as per " + l + " is " + strCurrency);
    }
}
