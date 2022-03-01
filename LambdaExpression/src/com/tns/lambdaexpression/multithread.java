package com.tns.lambdaexpression;

public class multithread {
	public static void main(String[] args) {
		new Thread(() -> {System.out.println("I am run method"); }).start();
        
		new Thread( () -> { System.out.println("Hello world");}).start();
	}

}

