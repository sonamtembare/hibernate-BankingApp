package com.controller;


import com.service.AdminService;

public class GetAdminBy_Id {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
	
		int id=2;
		adminService.getAdminById(id);
	}

}
