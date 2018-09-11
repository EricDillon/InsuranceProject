package com.spring.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PolicyDao;
import com.spring.model.Policy;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	public int addPolicy(Policy p) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Policy> getPolicies() {
		// TODO Auto-generated method stub
		return null;
	}

	public Policy getPolicy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Policy getPolicy(String policyNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
