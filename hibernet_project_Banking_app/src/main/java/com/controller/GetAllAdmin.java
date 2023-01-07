package com.controller;

import com.service.AdminService;

public class GetAllAdmin {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		adminService.getAllAdmin();
	}

}
