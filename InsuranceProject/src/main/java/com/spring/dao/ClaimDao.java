package com.spring.dao;

import java.util.List;

import com.spring.model.Claim;
import com.spring.model.Report;

public interface ClaimDao 
{
	public int addClaim(Claim c);
	public int editClaim(Claim c);
	public List<Claim> getClaims();
	public List<Claim> getClaims(String policyNum);
	public Claim getClaim(int id);
	public List<Claim> getActiveClaims();
}
