package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory extends BankFactory {
	
	public SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean isSalaried) {
		return null;
		
	}
	public CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal, float creditLimit) {
		return null;
		
	}
	

}
