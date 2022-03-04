package com.tns.streamapi;
import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		  //Normal approach 
		int result =0; 
		for(int i : list)
		{ 
			result+=i*2;
			}
		  System.out.println(result); 
		 		
		//Stream concept approach 
        System.out.println(list.stream().map(i -> i*2).reduce(0,(i,j) -> (i+j))); 
        
	}

}

