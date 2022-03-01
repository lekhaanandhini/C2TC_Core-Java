package com.tns.enums;

public class example1 {
  public enum Season{
	  WINTER,SPRING,AUTUMN,SUMMER;
  }
	public static void main(String[] args) {
		Season s = Season.AUTUMN;
		Season s2 = Season.SUMMER;
		Season s1 = Season.SPRING;
        System.out.println(s2);
        System.out.println(Season.WINTER);
	}

}
