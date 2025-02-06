package com.wipro.java.java8;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

/**
 * 
 */
public class Adjust {
	
	
	//Function to check date and time according to our requirement
	public static void checkingAdjusters() {
		
	//to get and print the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        
     // to get the first day of the next month
        LocalDate firstDayNextMonth = currentDate.with(TemporalAdjusters.firstDayOfNextMonth());
            System.out.println("First Day of Next Month: " + firstDayNextMonth);
            
     //to get the next Thursday
        LocalDate nextSaturday = currentDate.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
                System.out.println("Next Saturday: " + nextSaturday);
		
	}

   
    public static void main(String[] args) {
    	Adjust.checkingAdjusters();
    	
                   
            
        
       
    }
}
