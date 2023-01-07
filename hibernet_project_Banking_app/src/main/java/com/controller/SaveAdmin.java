package com.controller;

import com.dto.Admin;
import com.service.AdminService;
import com.dao.AdminDao;

public class SaveAdmin {
	
	public static void main(String[] args) {
		
	  AdminService adminService =new AdminService();
	  
	  Admin admin=new Admin();
	  admin.setName("sonam");
	  admin.setEmail("sonam@gmail.com");
	  admin.setPassword("S1234");
	  
	   Admin adminDto2= adminService.saveData(admin);
	   if(adminDto2!=null) {
		   System.out.println("Inserted");
	   }else {
		   System.out.println("not inserted");
	   }
	}
	

}
