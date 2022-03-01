package com.tns.lambdaexpression;

interface lambda{
	public void demo();
}
public class Single_Statement {

	public static void main(String[] args) {
		lambda obj = () -> 
		{ 
			System.out.println("Nothing to say");
			};
        obj.demo();
	}

}
