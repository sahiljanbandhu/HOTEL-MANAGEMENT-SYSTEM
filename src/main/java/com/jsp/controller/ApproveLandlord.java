package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class ApproveLandlord {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_id(1);
		
		int Landlord_id = 4;

		AdminService adminService = new AdminService();
		adminService.approveLandlordById(Landlord_id, admin);
	}

}
