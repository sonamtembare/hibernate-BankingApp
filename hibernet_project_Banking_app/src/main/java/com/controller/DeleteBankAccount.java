package com.controller;

import com.service.CustomerService;

public class DeleteBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CustomerService customerService=new CustomerService();
          customerService.deleteBankAccount(2);
	}

}
