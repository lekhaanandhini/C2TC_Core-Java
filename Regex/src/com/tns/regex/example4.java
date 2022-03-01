package com.tns.regex;

import java.util.regex.Pattern;

public class example4 {

	public static void main(String[] args) {
		System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a")); //T
        System.out.println(Pattern.matches("[amn]?", "aaaa")); //F
        System.out.println(Pattern.matches("[amn]?", "ammmnn")); //F 
        System.out.println(Pattern.matches("[amn]?", "aazzta")); //F
        System.out.println(Pattern.matches("[amn]?", "am")); //F
        System.out.println(Pattern.matches("[amn]?","")); //T //ADDITIONAL
	}

}
