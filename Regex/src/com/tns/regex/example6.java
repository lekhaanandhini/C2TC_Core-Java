package com.tns.regex;

import java.util.regex.Pattern;

public class example6 {

	public static void main(String[] args) {
		System.out.println("metacharacters d....");
        System.out.println(Pattern.matches("\\d", "abc")); //F
        System.out.println(Pattern.matches("\\d", "1")); //T 
        System.out.println(Pattern.matches("\\d", "4443")); //F
        System.out.println(Pattern.matches("\\d", "323abc")); //F


	}

}
