package com.tns.exception;

import java.io.FileInputStream;

public class HandledExample4 {

	public void checkFileNotFound()
    {
        try
        {
            FileInputStream in = new FileInputStream("C:/reset.txt");
            System.out.println("This is not printed");
        } 
        catch (Exception fileNotFoundException)
        {
           System.out.println(fileNotFoundException+"file not found exception");
        }
    } 
      public static void main(String[] args)
          {
	         HandledExample4 example = new HandledExample4();
             example.checkFileNotFound();
    } 
}
