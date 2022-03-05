package com.tns.multithreading;

class Meet1 extends Thread{
	public void run() {

		for(int i=0;i<5;i++) {
			System.out.println("Eclipse Thread ID is " + Thread.currentThread().getId());
	                     	}	
		try {
		   sleep(3000);
		}
		catch(Exception e){
			System.out.println("Exception Handled");
		}
                      }
}
public class Example7 {

	public static void main(String[] args) {
		Meet1 obj =new Meet1();
		Thread t1 =new Thread(obj);
		t1.start();
	    

	}

}
