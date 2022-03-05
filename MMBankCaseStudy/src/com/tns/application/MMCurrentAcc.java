package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}

	public void withdraw(float accBal,float creditLimit) {
		System.out.println("Dear Customer: Your account Balance is " + accBal + " and the credit Limit is "+ creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	
	
}
