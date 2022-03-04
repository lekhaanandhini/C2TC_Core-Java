package com.tns.streamapi;
import java.util.Arrays;
import java.util.List;

public class findfirst {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(12,20,35,46,68);
		int result =0;
		for(int i:list) {
			if(i%5==0) {
				result = i*2;
				break;
			}
		}
        System.out.println("The result is " + result);
        System.out.println(list.stream().filter(i -> i%5 == 0).map(i -> i*2).findFirst());  // 20 35  //40 70 //40
        System.out.println(list.stream().filter(i -> i%5 == 0).map(i -> i*2).findFirst().orElse(999));
	}

}
