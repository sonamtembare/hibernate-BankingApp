package com.controller;

import com.service.AdminService;

public class DeleteAdminBy_id {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		int id=8;
		adminService.deleteAdminById(id);
	}

}
