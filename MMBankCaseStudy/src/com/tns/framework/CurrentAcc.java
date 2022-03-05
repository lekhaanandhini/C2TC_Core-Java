package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}
	
	public void withdraw(float accBal,float creditLimit) {
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
    
}
