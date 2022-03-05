package com.tns.multithreading;

class Eclipse3 implements Runnable{
	public void run() {

		System.out.println("Eclipse Thread ID is " + Thread.currentThread().getId());
                      }
}
class Notes implements Runnable{
	public void run() {
		System.out.println("PPT Thread ID is " + Thread.currentThread().getId());
                     }
}
public class Example3 {

	public static void main(String[] args) {
		Eclipse3 obj =new Eclipse3();
		Thread t1 =new Thread(obj);
		t1.start();
	    Notes obj1 =new Notes();
		Thread t2 =new Thread(obj1);
		t2.start();

	}

}
