package com.tns.enums;

public class example2 {
	public enum Season{
		  winter,spring,AUTUMN,SUMMER;
	  }
	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s);
		}  
	}
}
