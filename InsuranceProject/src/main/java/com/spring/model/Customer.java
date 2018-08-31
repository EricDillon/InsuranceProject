package com.spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

/*================================================================================================
 * CUSTOMER
 * -----------------------------------------------------------------------------------------------
 * 
 * Can register account, submit claims (even without an account), view claims
 *================================================================================================ 
 */

@Entity
@Table(name="assinsurance_cust_tbl")

public class Customer extends User 
{
	List<Claim> claims;
	List<Vehicle> vehicles;
	private int policyNum;
	private boolean active;



	public Customer(int id, int phoneNum, String firstName, String lastName, String email, String password) {
		super(id, phoneNum, firstName, lastName, email, password);
		// TODO Auto-generated constructor stub
	}


	public List<Claim> getClaims() {
		return claims;
	}


	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}


	public List<Vehicle> getVehicles() {
		return vehicles;
	}


	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}


	public int getPolicyNum() {
		return policyNum;
	}


	public void setPolicyNum(int policyNum) {
		this.policyNum = policyNum;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
