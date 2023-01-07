package com.controller;

import com.dto.Admin;
import com.service.AdminService;

public class UpdateAdmin {
   public static void main(String[] args) {
	
	   AdminService adminService=new AdminService();
	   int id=2;
	   //to update admin name
     adminService.updateAdminName(id, "ashwini");
       
       //to update admin email
	   adminService.updateAdminEmail(id, "ashwini@gmail.com");
     //to update admin paassword
	   adminService.updatePassword(id, "ashwini@123");
   }
	
}
