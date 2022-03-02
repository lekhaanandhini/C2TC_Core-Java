package com.tns.streamapi;
import java.util.Arrays;
import java.util.List;

public class findfirst {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(12,46,68);
		
		System.out.println(list.stream().filter(i->i%5==0).map(i -> i*2).findFirst());
		System.out.println(list.stream().filter(i->i%5==0).map(i -> i*2).findFirst().orElse(0));

	}

}
