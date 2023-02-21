package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.RoomService;

public class ReadCustomerByRoomId {
	public static void main(String[] args) {

		int room_id = 1;
		RoomService roomService = new RoomService();
		Customer customer = roomService.readCustomerByRoomId(room_id);

		System.out.println(customer.getCustomer_id());
		System.out.println(customer.getCustomer_name());
		System.out.println("Phone number - " + customer.getCustomer_phnone_num());
		System.out.println("Aadhar Number - " + customer.getCustomer_aadhar_num());
	}
}
