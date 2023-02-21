package com.jsp.controller;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;

public class UpdateLandlord {
public static void main(String[] args) {
	LandLord landLord= new LandLord();
	landLord.setId(2);
	landLord.setName("NISHANT");
	
	LandlordService landlordService= new LandlordService();
	landlordService.update(landLord);
}
}
