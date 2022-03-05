package com.tns.util;

import java.util.Date;

public class example2 {

	public static void main(String[] args) {
		Date date1 = new Date(2016, 11, 18); 
		Date date2 = new Date(1997, 10, 27); 
		System.out.println(date1);
		
		boolean a = date2.after(date1); 
		System.out.println("Is date2 is after date1 : " + a); 
		
		boolean b = date1.after(date2); 
		System.out.println("Is date1 is after date2 : " + b); 
		System.out.println(""); 
		
		Object date3 = date2.clone(); 
		System.out.println("Cloned date3 :" + date3.toString()); 
		System.out.println("");  
		
		boolean c = date2.before(date1); 
		System.out.println("Is date2 is before date1 : " + c); 


	}

}
