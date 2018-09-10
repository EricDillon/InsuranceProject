package com.spring.controller;
import com.spring.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.EmployeeService;
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	Employee e;

	@RequestMapping("/employeeLogin")
	public String empLogin(Model m) {
		return "employee/employeeLogin";
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
