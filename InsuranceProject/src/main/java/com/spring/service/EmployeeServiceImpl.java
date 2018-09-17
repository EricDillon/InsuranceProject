package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.EmployeeDao;
import com.spring.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao dao;

	public int addEmployee(Employee c) {
		// TODO Auto-generated method stub
		return dao.addEmployee(c);
	}

	public List<Employee> viewEmployee() {
		// TODO Auto-generated method stub
		return dao.getEmployees();
	}

	public List<Employee> viewEmployee(String policyNum) {
		// TODO Auto-generated method stub
		return dao.getEmployees();
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	public Employee getEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return dao.login(username, password);
	}

	public List<Employee> viewEmployee(int role) {
		// TODO Auto-generated method stub
		return dao.getEmployees(role);
	}


}
