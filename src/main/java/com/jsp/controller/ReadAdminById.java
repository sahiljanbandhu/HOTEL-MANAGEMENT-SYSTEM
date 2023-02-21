package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class ReadAdminById {
	public static void main(String[] args) {

		int admin_id = 1;
		AdminService adminService = new AdminService();

		Admin admin = adminService.readById(admin_id);

		System.out.println(admin.getAdmin_id());
		System.out.println(admin.getAdmin_name());
		System.out.println(admin.getEmail_id());
	}
}
