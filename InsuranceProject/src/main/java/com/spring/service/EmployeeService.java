package com.spring.service;

<<<<<<< HEAD
public interface EmployeeService {

=======
import java.util.List;

import com.spring.model.Employee;
public interface EmployeeService {

	public int addEmployee(Employee c);
		
		
		public List<Employee> viewEmployee();
		public List<Employee> viewEmployee(String policyNum);
		public Employee getEmployee(int id);
	    public Employee getEmployee(String username, String password);
		
	
	
>>>>>>> refs/remotes/origin/master
}
