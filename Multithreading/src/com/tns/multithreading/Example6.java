package com.tns.multithreading;

class Chrome1 extends Thread{
	public void run() {

		System.out.println("Eclipse Thread ID is " + Thread.currentThread().getId());
		System.out.println("Eclipse Thread Priority is " + Thread.currentThread().getPriority());
                      }
}
class gmail1 extends Thread{
	public void run() {
		System.out.println("PPT Thread ID is " + Thread.currentThread().getId());
		System.out.println("PPT Thread Priority is " + Thread.currentThread().getPriority());
                     }
}

public class Example6 {
	public static void main(String[] args) {
		Chrome1 obj =new Chrome1();
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		gmail1 obj1 =new gmail1();
		obj1.start();
		obj1.setPriority(Thread.MIN_PRIORITY);

	}

}

