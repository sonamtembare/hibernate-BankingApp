package com.controller;

import com.service.CustomerService;

public class DeleteCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CustomerService customerService=new CustomerService();
       customerService.deleteCustomer(1);
	}

}
