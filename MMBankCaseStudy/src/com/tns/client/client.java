package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class client {
   public static void main(String args[]) {
	   BankFactory MMBF=  new MMBankFactory();
	   SavingAcc MMSA = new MMSavingAcc(12345, "Lekha", 2000);
	   CurrentAcc MMCA = new MMCurrentAcc(78965, "Lakshmi", 5000);
	   MMSA.withdraw(1000);
	   MMSA.toString();
	   MMCA.withdraw(5000, 10000);
	   MMCA.toString();
}
}
