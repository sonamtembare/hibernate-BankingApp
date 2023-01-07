package com.controller;

import com.dao.CustomerDao;

public class Get_BankAccount {
  public static void main(String[] args) {
	CustomerDao customerDao=new CustomerDao();
	customerDao.getBankAccountById(3);
}
}
