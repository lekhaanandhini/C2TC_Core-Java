package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	public MMSavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}

	private static final float MINBAL=500F;
	
	public void withdraw(float accBal) {
		System.out.println("Dear Customer: Your account Balance is " + accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
