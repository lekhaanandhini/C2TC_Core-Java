package com.tns.lambdaexpression;

interface drawable {
	 public void add(int radius);
	}

	public class Single_Parameter {
		public static void main(String[] args) {
			drawable d2= (int radius)->  { System.out.println("Draw a circle with radius of :" + radius ); };
	        d2.add(10);
	                             
		}
	}
