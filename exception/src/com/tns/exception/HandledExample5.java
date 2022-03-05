package com.tns.exception;

import java.io.*;
public class HandledExample5 { 
    public static void main(String[] args){
    try 
       {
        int[] arr = new int[]{7, 11, 30, 63};
        System.out.println(arr[5]);
       }
    catch(Exception e)
       {
         System.out.println(e);
       }
    } 
}
