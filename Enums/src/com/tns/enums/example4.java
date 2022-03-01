package com.tns.enums;


public class example4 {
	public enum Season{
		  SPRING,AUTUMN,WINTER,SUMMER;
	  }
	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s);
		} 
		System.out.println(Season.valueOf("WINTER").ordinal());
		

	}

}
