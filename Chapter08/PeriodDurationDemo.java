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

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;

public class PeriodDurationDemo {
    public static void main(String args[]) {
      PeriodDurationDemo obj = new PeriodDurationDemo();
      obj.displayPeriod();
      obj.displayDuration();
   }
	
   public void displayPeriod() {
      LocalDate dt1 = LocalDate.now();
      System.out.println("Current date: " + dt1);
		
      //add 1 month to the current date
      LocalDate dt2 = dt1.plus(1, ChronoUnit.MONTHS);
      System.out.println("Next month: " + dt2);
      
      Period period = Period.between(dt2, dt1);
      System.out.println("Period between "+ dt1 +" and "+dt2+" is " + period);
   }
	
   public void displayDuration() {
      LocalTime time1 = LocalTime.now();
      Duration oneHour = Duration.ofHours(1);
      
      // add 1 hour to current time
      LocalTime time2 = time1.plus(oneHour);
      Duration duration = Duration.between(time1, time2);
		
      System.out.println("Duration between "+time1+" and " + time2 +" is "+ duration);
   }
}
