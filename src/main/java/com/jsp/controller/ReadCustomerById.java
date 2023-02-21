package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class ReadCustomerById {
	public static void main(String[] args) {
		int customer_id = 1;
		CustomerService customerService = new CustomerService();
		Customer customer = customerService.readById(customer_id);
		System.out.println(customer.getCustomer_id());
		System.out.println(customer.getCustomer_name());
		System.out.println(customer.getCustomer_phnone_num());
		System.out.println(customer.getCustomer_aadhar_num());
	}
}
