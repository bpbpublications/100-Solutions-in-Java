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
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class TemporalAdjustersDemo {

    public static void main(String args[]) {
        TemporalAdjustersDemo obj = new TemporalAdjustersDemo();
        obj.testAdjusters();
    }

    public void testAdjusters() {
//      //Get the current date
//      LocalDate today = LocalDate.now();
//      System.out.println("Current date: " + today);
//		
//      //get the next wednesday
//      LocalDate nextWednesday = today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
//      System.out.println("Next Wednesday is on " + nextWednesday);
//		
//      //get the monday of next month
////      LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 2);
//      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
//       System.out.println("Next month "+nextMonth);
//      LocalDate secondMonday = today.with(TemporalAdjusters.nextOrSame(
//         DayOfWeek.MONDAY)).with(TemporalAdjusters.next(DayOfWeek.MONDAY));
//      System.out.println("Second Monday of next month is on " + secondMonday);
    
        //Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date is " + today);

        //get the next wednesday
        LocalDate nextWed = today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("Next Wednesday is on " + nextWed);

        //get the second saturday of the month
        LocalDate firstDay = LocalDate.of(today.getYear(), today.getMonth(), 1);
        System.out.println("First date of the current month: " + firstDay);
        LocalDate secondSaturday = firstDay.with(TemporalAdjusters.nextOrSame(
                DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday is on " + secondSaturday);
    }
}
