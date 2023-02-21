package com.jsp.service;

import java.util.List;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;
import com.jsp.dto.Room;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();
	RoomService roomService = new RoomService();

	public void create(Customer customer) {
		customerDao.create(customer);
	}

	public void update(Customer customer) {
		customerDao.update(customer);
	}

	public void delete(int id) {
		List<Room> rooms = customerDao.readById(id).getRooms();
		for (Room room : rooms) {
			roomService.deleteById(room.getRoom_id());
		}
		customerDao.delete(id);
	}

	public Customer readById(int id) {
		return customerDao.readById(id);
	}

	public List<Customer> readAllCustomer() {
		return customerDao.readAllCustomers();
	}

	public String checkIn(int customer_id, List<Room> rooms) {
		for (Room room : rooms) {
			Room room2 = roomService.readById(room.getRoom_id());
			if (room2.getRoom_status().equalsIgnoreCase("BOOKED") && room2.getCustomer() != null) {
				return "Selected Room Is Already Booked......Please Select Another Room";
			}
		}
		Customer customer = customerDao.readById(customer_id);
		customer.setRooms(rooms);
		customerDao.update(customer);

		for (Room room : rooms) {
			room.setCustomer(customer);
			room.setRoom_status("BOOKED");
			roomService.update(room);
		}
		return "CheckIn Done";
	}

	public void checkOut(int customer_id, List<Room> rooms) {
		Customer customer = customerDao.readById(customer_id);
		customer.setRooms(null);
		customerDao.update(customer);

		for (Room room : rooms) {
			room.setCustomer(null);
			room.setRoom_status("AVAILABLE");
			roomService.update(room);
		}
	}
	
}
