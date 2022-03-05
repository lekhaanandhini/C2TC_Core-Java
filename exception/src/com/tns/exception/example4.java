package com.tns.exception;

import java.io.FileInputStream;
public class example4 {
public static void main(String[] args) {
    FileInputStream fis = null;
    fis = new FileInputStream("D:/myfile.txt"); 
    int k; 
    while(( k = fis.read() ) != -1) 
        { 
	System.out.print((char)k); 
		} 
    fis.close();
	}
}
