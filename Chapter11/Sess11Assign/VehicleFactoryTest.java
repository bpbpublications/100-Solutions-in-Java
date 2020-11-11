/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess11Assign;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dhrutis
 */
public class VehicleFactoryTest {

    public static void main(String[] args) {

        String language;
        String country;
        String vehicle="";
        Scanner s = new Scanner(System.in);
        System.out.println("Select vehicle\n1.Car\n2.Bus");
        System.out.println("Enter your choice: ");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                vehicle = "Car";
                break;
            case 2:
                vehicle = "Bus";
                break;
        }
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

        VehicleFactory vehicleFactory = new VehicleFactory();
        //get an object of Car and call its move method.
        IVehicle obj = vehicleFactory.getVehicle(vehicle);
        //call move method of the specified vehicle object
        obj.move(50, currentLocale);

    }
}
