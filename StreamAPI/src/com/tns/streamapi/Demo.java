package com.tns.streamapi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6);
        //External Iterations
		//for loop
		/*for(int i=0;i<6;i++) {
        	System.out.println(list.get(i));
        }
		//foreach
		for(int i : list) {
			System.out.println(i);
		}
		//iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		//Internal Iteration
		list.forEach(i -> System.out.println(i));
	}

}
