package com.spring.service;

import java.util.List;

import com.spring.model.Claim;

public interface ClaimService 
{
	public int addClaim(Claim c);
	public int updateClaim(Claim c);
	public List<Claim> viewClaims();
	public List<Claim> viewClaims(String policyNum);
	public Claim getClaim(int id);
	public List<Claim>getActiveClaims();
	
}
