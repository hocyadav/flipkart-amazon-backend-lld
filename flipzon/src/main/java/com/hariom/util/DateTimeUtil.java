package com.hariom.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
/**
 * 
 * @author Hariom Yadav | 01-Apr-2020
 *
 */

public class DateTimeUtil {
	
	/**
	 * order date = Current date and time
	 * @return Date and time
	 */
	public static String orderDateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj); 
	    
	    return formattedDate;
	}
	
	/**
	 * delivery date = next any date between 0-10
	 * @return Expected : Date 
	 */
	public static String deliveryDateTime() {
		Random randObj = new Random(); 
		int randomNumber = randObj.nextInt(10); 
		
		LocalDateTime myDateObj = LocalDateTime.now().plusDays(randomNumber);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    return "Expected : "+formattedDate;
	}
	
}
