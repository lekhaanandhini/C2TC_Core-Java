package com.tns.framework;

public class PrimeAcc extends ShopAcc{
	//Fields
    public static boolean isPrime;
	
    //Constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	//Method
	public void bookProduct(float charges)
	{
		System.out.println("Charges are: "+charges);
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime() + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	
	
}
