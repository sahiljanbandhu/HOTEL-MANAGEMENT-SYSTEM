package com.jsp.controller;

import com.jsp.service.CustomerService;

public class DeleteCustomer {
	public static void main(String[] args) {
		int customer_id = 4;
		CustomerService customerService = new CustomerService();
		customerService.delete(customer_id);

	}
}
