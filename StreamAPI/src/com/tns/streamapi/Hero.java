package com.tns.streamapi;

public class Hero implements Actor{
 public void act() {
	 System.out.println("I can act");
 }
 public void speak() {
	 System.out.println("I can speak");
 }
 
	public static void main(String[] args) {
		Hero h = new Hero();
		h.act();
		h.speak();
		h.comedy();
	
		

	}

}
