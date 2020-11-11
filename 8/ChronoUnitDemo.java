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
import java.time.temporal.ChronoUnit;


public class ChronoUnitDemo {
    public static void main(String args[]) {
      ChronoUnitDemo obj = new ChronoUnitDemo();
      obj.displayChromoUnits();
   }
	
   public void displayChromoUnits() {
      //Get the current date
      LocalDate today = LocalDate.now();
      System.out.println("Current date: " + today);
		
      //add 2 weeks to the current date
      LocalDate next2Week = today.plus(2, ChronoUnit.WEEKS);
      System.out.println("Week after next week: " + next2Week);
		
      //add 1 month to the current date
      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
      System.out.println("Next month: " + nextMonth);
		
      //add 1 year to the current date
      LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
      System.out.println("Next year: " + nextYear);
		
      //add 10 years to the current date
      LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
      System.out.println("Date after ten years: " + nextDecade);
   }
}
