/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Localization;

import java.util.Scanner;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Administrator
 */
public class MsgFormatDemo {

    public static void main(String[] args) {
// TODO code application logic here
        //  String template = "At {2,time,short} on {2,date,long}, we detected {1,number,integer} virus on the disk {0}";
        try {
            MessageFormat formatter = new MessageFormat("");
            String language;
            String country;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter language code: ");
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
            Locale currentLocale;
            currentLocale = new Locale(language, country);
            formatter.setLocale(currentLocale);

            ResourceBundle messages = ResourceBundle.getBundle("mybundles/MessageFormatBundle", currentLocale);
            // set values of variables for template at position 0, 1 and 2
            Object[] messageArguments = {new Date(), new Date(), 7};
            formatter.applyPattern(messages.getString("template"));

            String output = formatter.format(messageArguments);
            System.out.println(output);

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
