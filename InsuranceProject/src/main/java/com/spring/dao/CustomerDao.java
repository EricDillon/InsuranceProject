package com.spring.dao;

import java.util.List;

import com.spring.model.Customer;

public interface CustomerDao {
	
	public int addNewCustomer(Customer c);
	public List<Customer> viewAllCustomers();
	public int updateCustomer(Customer c);
	public int inactiveCustomer(int id);
	

}
