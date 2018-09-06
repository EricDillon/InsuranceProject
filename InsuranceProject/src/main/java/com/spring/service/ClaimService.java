package com.spring.service;

import java.util.List;

import com.spring.model.Claim;

public interface ClaimService 
{
	public int addClaim(Claim c);
	
	public List<Claim> viewClaims();
	
}
