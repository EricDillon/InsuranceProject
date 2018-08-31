package com.spring.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


public class Login {
	

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/clientLogin")
	public String clientLogin() {
		return "clientLogin";
	}
	
	@RequestMapping("/overview")
	public String overview() {
		return "overview";
	}

	@RequestMapping("/makeclaim")
	public String makeClaim() {
		return "makeClaim";
	}
	
	@RequestMapping("/checkClaim")
	public String checkClaim() {
		return "checkClaim";
	}
	
	@RequestMapping("/myClaims")
	public String myClaim() {
		return "myClaims";
	}


}