package com.tns.multithreading;
class Eclipse1 extends Thread{
	public void run() {

		for(int i=0;i<5;i++) {
			System.out.println("Eclipse Thread ID is " + Thread.currentThread().getId());
	                     	}		
                      }
}
class PPT1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("PPT Thread ID is " + Thread.currentThread().getId());
		}
                     }
}

public class Example2 {

	public static void main(String[] args) {
		Eclipse1 obj =new Eclipse1();
		obj.start();
		PPT1 obj1 =new PPT1();
		obj1.start();

	}

}
