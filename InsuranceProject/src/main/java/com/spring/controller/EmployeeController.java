package com.spring.controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class EmployeeController {

	@RequestMapping("/employeeLogin")
	public String empLogin() {
		return "employeeLogin";
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
