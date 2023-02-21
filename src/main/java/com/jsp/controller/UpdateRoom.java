package com.jsp.controller;

import com.jsp.dto.Room;
import com.jsp.service.RoomService;

public class UpdateRoom {
	public static void main(String[] args) {
		Room room= new Room();
		room.setRoom_id(1);
		room.setRoom_price(5000.00);
		
		RoomService roomService= new RoomService();
		roomService.update(room);
	}
}
