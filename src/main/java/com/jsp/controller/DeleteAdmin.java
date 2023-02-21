package com.jsp.controller;

import com.jsp.service.AdminService;

public class DeleteAdmin {
	public static void main(String[] args) {
		int admin_id = 1;

		AdminService adminService = new AdminService();
		adminService.delete(admin_id);
	}
}
