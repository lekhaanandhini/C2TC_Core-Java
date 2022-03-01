package com.tns.enums;
public class example3 {
	public enum Season{
		  WINTER(10),SPRING(5),AUTUMN(15),SUMMER(20);
		int value;
		Season(int value){
			this.value=value;
		}
	  }
	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s.value);
		}
		  

	}

}
