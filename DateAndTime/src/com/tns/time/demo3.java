package com.tns.time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class demo3 {
	public static void main(String[] args) {
    	        LocalDateTime myDateObj = LocalDateTime.now();
    	        System.out.println("Before formatting: " + myDateObj);
               DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");
    	        String formattedDate = myDateObj.format(myFormatObj);
    	        System.out.println("After formatting: " + formattedDate);
	}
}
