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
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class TimeDemo {

    public static void main(String[] args) {

        TimeDemo obj = new TimeDemo();
        obj.displayLocalDateTime();
    }

    public void displayLocalDateTime() {
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentTime);

        LocalDate dt1 = currentTime.toLocalDate();
        System.out.println("Current Date: " + dt1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);

        LocalDateTime dt2 = currentTime.withDayOfMonth(10).withYear(2017);
        System.out.println("Time with Month and Year: " + dt2);

        //31 May 2017
        LocalDate dt3 = LocalDate.of(2017, Month.MAY, 31);
        System.out.println("Date: " + dt3);

        //20 hour 10 minutes
        LocalTime time1 = LocalTime.of(20, 10);
        System.out.println("Time: " + time1);

        //parsing a string
        LocalTime time2 = LocalTime.parse("20:15:30");
        System.out.println("Time from String: " + time2);
    }
}
