package com.tns.multithreading;

class Chrome extends Thread{
	public void run() {

		System.out.println("Eclipse Thread ID is " + Thread.currentThread().getId());
		System.out.println("Eclipse Thread Priority is " + Thread.currentThread().getPriority());
                      }
}
class gmail extends Thread{
	public void run() {
		System.out.println("PPT Thread ID is " + Thread.currentThread().getId());
		System.out.println("PPT Thread Priority is " + Thread.currentThread().getPriority());
                     }
}

public class Example5 {

	public static void main(String[] args) {
		Chrome obj =new Chrome();
		obj.start();
		obj.setPriority(3);
		gmail obj1 =new gmail();
		obj1.start();
		obj1.setPriority(3);

	}

}
