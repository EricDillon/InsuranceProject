package com.spring.controller;

public class EmployeeController {

	@RequestMapping
	public String empLogin("/employeeLogin") {
		return "employeeLogin";
	}

	@RequestMapping
	public String viewClaims("/viewClaims") {
		return "viewClaims";
	}

	@RequestMapping
	public String updateClaim("/updateClaim") {
		return "updateClaim";
	}

	@RequestMapping
	public String viewReports("/viewReports") {
		return "viewReports";
	}

	@RequestMapping
		public String updateReport("/updateReport") {
			return "updateReport";
	}
	
}
