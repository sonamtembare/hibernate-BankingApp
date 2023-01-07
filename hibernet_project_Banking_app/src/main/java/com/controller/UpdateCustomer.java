package com.controller;

import com.service.CustomerService;

public class UpdateCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CustomerService customerService=new CustomerService();
       customerService.updateCustomerName(1, "Sachin");
       customerService.updateCustomerGmail(1, "vkaafu@gmail.com");
       customerService.updateCustmorContact(3, 789357221);
	}

}
