package com.spring.controller;
import com.spring.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.EmployeeService;
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;


	@RequestMapping("/employeeLogin")
	public String empLogin(@ModelAttribute("employee") Model model, 
			Employee employee) {
		model.addAttribute(employee.getUsername());
		  model.addAttribute(employee.getPassword());
		  
		return "employee/employeeLogin";
	}
	
	@RequestMapping("/employeeOverview")
	public String employeeOverview() {
		return "employee/employeeOverview";
		
	}
	
	@RequestMapping("/viewClaims")
	public String viewClaims() {
		return "viewClaims";
	}

	@RequestMapping("/updateClaim") 
	public String updateClaim() {
		return "updateClaim";
	}

	@RequestMapping("/viewReports")
	public String viewReports() {
		return "viewReports";
	}

	@RequestMapping("/updateReport")
		public String updateReport() {
			return "updateReport";
	}
	
}
