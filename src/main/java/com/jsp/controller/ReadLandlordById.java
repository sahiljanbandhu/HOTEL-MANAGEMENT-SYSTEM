package com.jsp.controller;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;

public class ReadLandlordById {
	public static void main(String[] args) {
		int landlord_id = 2;

		LandlordService landlordService = new LandlordService();
		LandLord landLord = landlordService.readById(landlord_id);
		System.out.println(landLord.getId());
		System.out.println(landLord.getName());
		System.out.println(landLord.getAddress());
		System.out.println(landLord.getStatus());
	}
}
