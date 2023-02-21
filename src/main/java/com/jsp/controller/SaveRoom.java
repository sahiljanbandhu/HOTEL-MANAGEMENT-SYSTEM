package com.jsp.controller;

import com.jsp.dto.Room;
import com.jsp.service.RoomService;

public class SaveRoom {
	public static void main(String[] args) {
		Room room1 = new Room();
		room1.setRoom_price(2000.00);
		room1.setRoom_status("AVAILABLE");

		Room room2 = new Room();
		room2.setRoom_price(1000.00);
		room2.setRoom_status("AVAILABLE");

		Room room3 = new Room();
		room3.setRoom_price(3000.00);
		room3.setRoom_status("AVAILABLE");

		Room room4 = new Room();
		room4.setRoom_price(2000.00);
		room4.setRoom_status("AVAILABLE");

		Room room5 = new Room();
		room5.setRoom_price(1000.00);
		room5.setRoom_status("AVAILABLE");

		Room room6 = new Room();
		room6.setRoom_price(3000.00);
		room6.setRoom_status("AVAILABLE");

		Room room7 = new Room();
		room7.setRoom_price(2000.00);
		room7.setRoom_status("AVAILABLE");

		Room room8 = new Room();
		room8.setRoom_price(1000.00);
		room8.setRoom_status("AVAILABLE");

		Room room9 = new Room();
		room9.setRoom_price(3000.00);
		room9.setRoom_status("AVAILABLE");

		RoomService roomService = new RoomService();

		roomService.create(room1);
		roomService.create(room2);
		roomService.create(room3);
		roomService.create(room4);
		roomService.create(room5);
		roomService.create(room6);
		roomService.create(room7);
		roomService.create(room8);
		roomService.create(room9);

	}
}
