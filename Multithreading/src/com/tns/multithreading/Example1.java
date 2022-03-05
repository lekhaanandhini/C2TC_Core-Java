package com.tns.multithreading;
class Eclipse extends Thread{
	public void run() {

		System.out.println("Eclipse Thread ID is " + Thread.currentThread().getId());
		System.out.println("Eclipse Thread ID is " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
                      }
}
class PPT extends Thread{
	public void run() {
		System.out.println("PPT Thread ID is " + Thread.currentThread().getId());
		System.out.println("PPT Thread ID is " + Thread.currentThread().getName());
                     }
}

public class Example1 {

	public static void main(String[] args) {
		Eclipse obj =new Eclipse();
		obj.start();
		PPT obj1 =new PPT();
		obj1.start();
	}

}
