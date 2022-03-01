package com.tns.regex;

import java.util.regex.Pattern;

public class example3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]", "abcd")); //F
        System.out.println(Pattern.matches("[amn]", "a")); //T
        System.out.println(Pattern.matches("[amn]", "amn")); //F

	}

}
