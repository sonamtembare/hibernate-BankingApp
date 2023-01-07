package com.controller;

import com.dao.CustomerDao;

public class GetAll_BankAccount {
	public static void main(String[] args) {
	 CustomerDao customerDao=new CustomerDao();
	 customerDao.getAllBankAccount();
	}

}
