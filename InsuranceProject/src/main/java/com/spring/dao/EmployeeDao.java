package com.spring.dao;

import java.util.List;

import com.spring.model.Employee;

public interface EmployeeDao 
{
	public int addEmployee(Employee e);
	public Employee login(String username, String password);
	public List<Employee> getEmployees();
	public List<Employee> getEmployees(int role);
	
	
	
}
