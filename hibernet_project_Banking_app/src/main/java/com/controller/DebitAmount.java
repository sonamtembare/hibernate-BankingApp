package com.controller;

import com.service.CustomerService;

public class DebitAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CustomerService customerService=new CustomerService();
    customerService.debitAmount(1,4 , 1000);
	}

}
