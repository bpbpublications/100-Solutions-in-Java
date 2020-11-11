/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Localization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author dhrutis
 */
public class I18NExample {

    public static void main(String[] args) {
        String language;
        String country;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter lanugage code: ");
        String lCode = s.next();
        System.out.print("Enter country code: ");
        String cCode = s.next();
        
        // set the default value for language and country
        if (lCode.equals("") || cCode.equals("")) {
            language = "en";
            country = "US";
        } else {
            language = lCode;
            country = cCode;
        }
        
        Locale currentLocale;
        ResourceBundle messages;
        
        // set the Locale object
        currentLocale = new Locale(language, country);
        
        // create the ResourceBundle object 
        messages = ResourceBundle.getBundle("mybundles/MessagesBundle", currentLocale);

        // extract and display the translated text from 
        // the resource bundle
        System.out.println("Greeting: "+messages.getString("greetings"));
        System.out.println("Inquiry: "+messages.getString("inquiry"));
        System.out.println("Farewell: "+messages.getString("farewell"));
    }
}
