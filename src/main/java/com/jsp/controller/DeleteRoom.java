package com.jsp.controller;


import com.jsp.service.RoomService;

public class DeleteRoom {
	public static void main(String[] args) {
		int room_id=1;
		
		RoomService roomService= new RoomService();
		roomService.deleteById(room_id);
	}
}
