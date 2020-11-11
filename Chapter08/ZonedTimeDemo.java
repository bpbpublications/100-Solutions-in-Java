/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess8Codes;

/**
 *
 * @author Admin3
 */
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalTime;

public class ZonedTimeDemo {

    public static void main(String args[]) {
        ZonedTimeDemo obj = new ZonedTimeDemo();
        obj.displayZonedDateTime();
    }

    public void displayZonedDateTime() {
        
        ZonedDateTime dt1 = ZonedDateTime.parse("2017-12-20T10:15:30+05:30[Asia/Bangkok]");
        System.out.println("Date Time of Asia/Bangkok zone: " + dt1);

        ZoneId zid = ZoneId.of("Europe/Berlin");
        LocalTime now1 = LocalTime.now(zid);
        System.out.println("Time in Zone Id " + zid + " is " + now1);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Current Zone: " + currentZone);
    }
}
