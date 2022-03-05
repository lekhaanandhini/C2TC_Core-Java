package com.tns.exception;

public class example7
{
 public static void main(String args[])
    {
	 example7 ob = new example7();
        try
        {
	        ob.meth1(); 
        }
        catch(ArithmeticException e)
        {
         System.out.println("ArithmaticException thrown by meth1() method is caught in main()method");
        }
   } 
     public void meth1()
	     {
           try
              {
                System.out.println(100/0); 
              }
           catch(Exception Exp) 
              {
                System.out.println("We have an Exception - "+Exp);
              }
          System.out.println("Outside try-catch block");
	}
}

