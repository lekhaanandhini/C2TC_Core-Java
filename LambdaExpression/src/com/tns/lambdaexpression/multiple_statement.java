package com.tns.lambdaexpression;
interface statement{
	public void demo();
}
public class multiple_statement {

	public static void main(String[] args) {
		statement obj = () -> 
		{ 
			System.out.println("Nothing to say");
			System.out.println("Nothing to say");
			System.out.println("Nothing to say");
			System.out.println("Nothing to say");
			};
        obj.demo();
	}

}
