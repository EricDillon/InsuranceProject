package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.*;

import com.spring.model.*;

@Controller
public class CustomerController {

	@Autowired
	ClaimService claimService;
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/")
	public String index(Model model) {
		Customer c = new Customer();
		model.addAttribute(c);
		return "index";
	}

	@RequestMapping("/RegSuccess")
	public String register(@ModelAttribute("customer") Customer customer, ModelMap model) {
		model.addAttribute("firstName", customer.getFirstName());
		model.addAttribute("email", customer.getEmail());
		model.addAttribute("password", customer.getPassword());
		
		return "index";
	}
	
	  @RequestMapping("/clientLogin")
	  public String clientLogin(@ModelAttribute("customer") Model model, 
			  Customer customer) {
		  model.addAttribute(customer.getUsername());
		  model.addAttribute(customer.getPassword());
		  overview(customer.getUsername(), customer.getPassword());
		return "overview";
	   
	       
	    
	}

	@RequestMapping("/overview")
<<<<<<< HEAD
	public String overview(String username, String password) {
		customerService.getCustomer(username, password);
		return "overview";
=======
	public String overview() {
		return "customer/overview";
>>>>>>> refs/remotes/origin/master
	}

	@RequestMapping(value="/makeclaim", method=RequestMethod.POST)
	public String makeClaim(@ModelAttribute("claim") Model model) {
		claimService.addClaim(new Claim());
		return "customer/makeClaim";
	}

	@RequestMapping("/checkClaim")
	public String checkClaim(@ModelAttribute("claim") Model model) {
		
		//THIS NEEDS TO BE CHANGED
		int id = 0;
		claimService.getClaim(id);
		//THIS NEEDS TO BE CHANGED
		
		return "checkClaim";
	}

	@RequestMapping("/myClaims")
	public String myClaim(Model model) {
		List<Claim> claims = claimService.viewClaims();
		model.addAttribute("claims", claims);
		return "myClaims";
	}

	@RequestMapping("/submitClaim")
	public String submitClaim(@ModelAttribute("claim") Claim cl, Model mod) {
		claimService.addClaim(cl);

		Customer c = new Customer();
		mod.addAttribute(c);

		return "index";
	}

}
