package com.spring.service;

import java.util.List;

import com.spring.model.Customer;

public interface CustomerService {

	public int addCustomer(Customer c);

	
	public List<Customer> viewCustomer();
	public List<Customer> viewCustomer(String policyNum);
	public Customer getCustomer(String username, String password);


}


