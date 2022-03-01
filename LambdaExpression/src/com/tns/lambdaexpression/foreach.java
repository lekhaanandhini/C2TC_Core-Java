package com.tns.lambdaexpression;


import java.util.ArrayList;
interface demo{
	public void demo();
}
public class foreach {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Lekha");
		obj.add("Leema");
		obj.add("Pooja");
		obj.add("Hema");
	    obj.forEach(temp -> System.out.println(temp));
	   
	   
	}
}
