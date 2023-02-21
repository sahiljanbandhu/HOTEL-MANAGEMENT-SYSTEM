package com.jsp.controller;

import com.jsp.service.LandlordService;

public class DeleteLandlord {
	public static void main(String[] args) {
		int landlord_id = 1;
		LandlordService landlordService = new LandlordService();
		landlordService.delete(landlord_id);
	}
}
