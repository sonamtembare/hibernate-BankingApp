package com.controller;

import com.service.CustomerService;

public class TransferAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CustomerService customerService=new CustomerService();
       customerService.transferAmount(1,4 , 3, 50);
	}

}
