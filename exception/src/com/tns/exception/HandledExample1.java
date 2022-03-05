package com.tns.exception;

public class HandledExample1 {

	public static void main(String[] args) {
		int x=10;
	      int y=0;
	    try
	      {
	        int z=x/y;
	        
	      }
	      catch(Exception e)
	      {
	          System.out.print(e);
	          
	      }  
	}

}
