package com.controller;



import java.util.Scanner;

import com.service.BankManagerService;

public class GetBMbyID {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		BankManagerService b1=new BankManagerService();
		System.out.println("Enter bankmanager Id:");
		int id=s1.nextInt();
		b1.getById(id);
	}

}
