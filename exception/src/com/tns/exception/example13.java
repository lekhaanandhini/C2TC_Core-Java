package com.tns.exception;

public class example13 {

	public static void main(String[] args)
    {
		float pi = new Float(3.14f);
		try {
		if (pi > 3) {
		System.out.print("pi is bigger than 3");
		}
		 else {
		 System.out.print("pi is not bigger than 3.");
		 }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		 System.out.println("Have a nice day.");
		}

    }

}
