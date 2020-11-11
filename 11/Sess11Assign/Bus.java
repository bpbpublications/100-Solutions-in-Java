/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess11Assign;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author dhrutis
 */
public class Bus implements IVehicle {

    @Override
    public void move(int speed, Locale l) {
        ResourceBundle messages = ResourceBundle.getBundle("mybundles/MessageBundles", l);
        Object[] messageArguments = {"Bus", speed};
        MessageFormat formatter = new MessageFormat("");
        formatter.setLocale(l);
        formatter.applyPattern(messages.getString("template"));
        String output = formatter.format(messageArguments);
        System.out.println(output);
    }

}
