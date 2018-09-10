package com.spring.service;

import com.spring.model.Customer;
public interface CustomerService {

	public int addCustomer(Customer c);

	public void getCustomer(String username, String password);
}
