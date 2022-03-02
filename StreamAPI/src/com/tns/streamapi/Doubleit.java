package com.tns.streamapi;
import java.util.Arrays;
import java.util.List;


public class Doubleit {
public static void doubleit(int i) {
	System.out.println(i*2);
}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		//Internal iteration
		list.forEach( i -> doubleit(i));
        //Method Referencing
		list.forEach(Doubleit :: doubleit);
		list.forEach(Doubleit :: doubleit);
		list.forEach(Doubleit :: doubleit);
		list.forEach(Doubleit :: doubleit);
		
	}

}