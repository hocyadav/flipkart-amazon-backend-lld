package com.hariom.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class DateTimeUtil {
	
	public static String orderDateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj); 
	    
	    return formattedDate;
	}
	
	public static String deliveryDateTime() {
		Random randObj = new Random(); 
		int randomNumber = randObj.nextInt(10); 
		
		LocalDateTime myDateObj = LocalDateTime.now().plusDays(randomNumber);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);
	    
	    return "Expected : "+formattedDate;
	}
	
}
