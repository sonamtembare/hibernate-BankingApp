package com.controller;

import com.dto.BankAccount;
import com.service.CustomerService;

public class SaveBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bankAccount=new BankAccount();
		
		//enter account number
	//	bankAccount.setAccount_no(9001028);
		
		//enter ifsc-code
		bankAccount.setIfsc_code("BOI10010");
		
		//Enter Amount
		bankAccount.setBalance(2500);
      CustomerService customerService=new CustomerService();
      customerService.saveBankAccount(bankAccount, 1);
	}

}
