package com.spring.service;

import java.util.List;

import com.spring.model.Policy;

public interface PolicyService {
		public int addPolicy(Policy p);
		public List<Policy> getPolicies();
		public Policy getPolicy(int id);
		public Policy getPolicy(String policyNum);
	
}
