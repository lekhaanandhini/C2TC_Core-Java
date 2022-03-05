package com.tns.multithreading;

class Meet extends Thread{
	public void run() {

		for(int i=0;i<5;i++) {
			System.out.println("Eclipse Thread ID is " + Thread.currentThread().getId());
			System.out.println("Eclipse Priority :" + Thread.currentThread().getPriority());
	                     	}		
                      }
}

public class Example4 {

	public static void main(String[] args) {
	    Meet obj1 =new Meet();
		Thread t2 =new Thread(obj1);
		t2.start();

	}

}
