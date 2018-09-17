package com.spring.service;

import java.util.List;

import com.spring.model.Employee;
public interface EmployeeService {

	public int addEmployee(Employee c);
		
		
		public List<Employee> viewEmployee();
		public List<Employee> viewEmployee(String policyNum);
		public List<Employee> viewEmployee(int role);
		public Employee getEmployee(int id);
	    public Employee getEmployee(String username, String password);
}
