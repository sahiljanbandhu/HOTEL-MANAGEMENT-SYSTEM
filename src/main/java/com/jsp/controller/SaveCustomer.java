package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class SaveCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomer_name("SALMAN");
		customer.setCustomer_phnone_num("9887755442");
		customer.setCustomer_aadhar_num("515231112725");
		CustomerService customerService = new CustomerService();
		customerService.create(customer);
	}
}
