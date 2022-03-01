package com.tns.regex;

import java.util.regex.Pattern;

public class example7 {

	public static void main(String[] args) {
		System.out.println("metacharacters D....");
        System.out.println(Pattern.matches("\\D", "abc"));
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "4443"));
        System.out.println(Pattern.matches("\\D", "323abc"));
        System.out.println(Pattern.matches("\\D", "m"));

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));


	}

}
