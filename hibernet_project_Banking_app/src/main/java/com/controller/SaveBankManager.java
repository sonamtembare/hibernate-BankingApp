package com.controller;

import com.dto.BankManager;
import com.service.BankManagerService;

public class SaveBankManager {

	public static void main(String[] args) {
		BankManagerService bankManagerService=new BankManagerService();
		BankManager bankManager=new BankManager();
		//If anyone try to approved directly then also it will saved as unapproved automatically.
		bankManager.setStatus("Approved");
		bankManager.setName("ashwini");
		bankManager.setEmail("ashwini@gmail.com");
		bankManager.setPassword("a@123");
	BankManager	b1=bankManagerService.saveAllBankManager(bankManager);
		if(b1!=null) {
			System.out.println("Inserted");
		}else {
			System.out.println("Not inserted");
		}
	}
}
