package com.tns.lambdaexpression;

interface draw {
	 public void add(int length,int width);
	}

	public class Two_Parameter {
		public static void main(String[] args) {
			draw d2= (int length,int width)->  { 
				  System.out.println("Draw a cube with length and width of " + length + " " + width + " " +"respectively"); };
	        d2.add(10,20);
	                             
		}
	}
