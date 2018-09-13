package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.service.*;

import com.spring.model.*;

@Controller

public class CustomerController {

	@Autowired
	ClaimService claimService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ReportService reportService;
	
	@RequestMapping("/")
	public String index(Model model) {
		Customer c = new Customer();
		model.addAttribute(c);
		return "index";
	}

	@RequestMapping("/regSuccess")
	public String register(@ModelAttribute("customer") Customer customer, Model model) {
		customer.setStatus(true);
		customerService.addCustomer(customer);
		
		return "index";
	}
	
	  @RequestMapping("/clientLogin")
	  public String clientLogin(@ModelAttribute("customer") Customer customer, 
			  Model model) {
		  
		  model.addAttribute(customerService.getCustomer(customer.getEmail(), customer.getPassword()));
		  return "customer/overview";
	   
	       
	    
	}

	@RequestMapping("/overview")
	public String overview(String username, String password) {
		customerService.getCustomer(username, password);
		return "customer/overview";
	}


	@RequestMapping(value="/makeclaim")
	public String makeClaim( Model model) {

		model.addAttribute(new Claim());
		return "customer/makeClaim";
	}

	@RequestMapping("/checkClaim")
	public String checkClaim(@RequestParam int msg, Model model) {
		
		//THIS NEEDS TO BE CHANGED
		int id = 0;
		System.out.println(msg);
		Claim c2 = claimService.getClaim(msg);
		model.addAttribute(c2);
		//THIS NEEDS TO BE CHANGED
		
		return "customer/checkClaim";
	}

	@RequestMapping("/myClaims")
	public String myClaim(Model model) {
		List<Claim> claims = claimService.viewClaims();
		model.addAttribute("claims", claims);
		return "customer/viewClaims";
	}

	@RequestMapping("/submitClaim")
	public String submitClaim(@ModelAttribute("claim") Claim cl, Model mod) {
		
		Report report = new Report();
		reportService.addReport(report);
		cl.setReportId(report.getId());
		claimService.addClaim(cl);
		
		Customer c = new Customer();
		mod.addAttribute(c);

		return "index";
	}
	
	@RequestMapping("/register")
	public String register(Model mod) {
		mod.addAttribute(new Customer());
		return "customer/register";
	}

}
