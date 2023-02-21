package com.jsp.controller;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;

public class AddHotelByLandlord {
	public static void main(String[] args) {
		LandLord landLord = new LandLord();
		landLord.setId(3);

		int hotel_id = 3;
		LandlordService landlordService = new LandlordService();
		landlordService.addHotelById(hotel_id, landLord);

	}
}
