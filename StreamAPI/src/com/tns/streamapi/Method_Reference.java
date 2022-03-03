package com.tns.streamapi;
import java.util.Arrays;
import java.util.List;

public class Method_Reference {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,5,6,4,3);
		
		list.forEach(System.out::println);
		 
		 
	}

}
