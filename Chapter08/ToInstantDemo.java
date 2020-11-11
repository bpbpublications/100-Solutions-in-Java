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

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.time.Instant;
import java.time.ZoneId;

public class ToInstantDemo {
    public static void main(String args[]) {
      ToInstantDemo obj = new ToInstantDemo();
      
      // test Backward Compatibility
      obj.testBC();
   }
	
   public void testBC() {
   
      Date today = new Date();
      System.out.println("Current date is " + today);
		
      //Get the instant of current date in milliseconds
      Instant now = today.toInstant();
      ZoneId thisZone = ZoneId.systemDefault();
		
      LocalDateTime lDT = LocalDateTime.ofInstant(now, thisZone);
      System.out.println("Local date and time is " + lDT);
		
      ZonedDateTime zDT = ZonedDateTime.ofInstant(now, thisZone);
      System.out.println("Zoned date and time is " + zDT);
   }
}
