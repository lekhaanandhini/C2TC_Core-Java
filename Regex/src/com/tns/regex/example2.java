package com.tns.regex;

import java.util.regex.Pattern;

public class example2 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s", "as")); //T
        System.out.println(Pattern.matches(".s", "mk")); //F
        System.out.println(Pattern.matches(".s", "mst")); //F
        System.out.println(Pattern.matches(".s", "amms")); //F
        System.out.println(Pattern.matches("..s", "mas")); //T

	} 

}
