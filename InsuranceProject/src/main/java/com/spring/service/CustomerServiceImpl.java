package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Customer;
import com.spring.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	CustomerDao dao;
	
	public int addCustomer(Customer c) 
	{
		return dao.addNewCustomer(c);
	}


	public List<Customer> viewCustomer(String policyNum) 
	{
		return dao.getCustomers(policyNum); //(List<Customer>) dao.getCustomer(policyNum);
	}

	public Customer getCustomer(String username, String password) 
	{
		return dao.getCustomer(username,password);
	
	
	}


	public List<Customer> viewCustomer() {
		// TODO Auto-generated method stub
		return dao.viewAllCustomers();
	}

}
