package com.tns.regex;

import java.util.regex.Pattern;

public class example5 {

	public static void main(String[] args) {
		System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a")); //T
        System.out.println(Pattern.matches("[amn]+", "aaa")); //T
        System.out.println(Pattern.matches("[amn]+", "aammmnn")); //T
        System.out.println(Pattern.matches("[amn]+", "aazzta")); //F
        
        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna")); //T

	}

}
