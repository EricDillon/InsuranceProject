package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*================================================================================================
 * POLICY CLASS
 * -----------------------------------------------------------------------------------------------
 * This is a POJO class which handles all the information regarding a single policy. 
 * 
 *================================================================================================ 
 */

@Entity
@Table(name="assinsurance_policy_tbl")
public class Policy 
{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String policyNum, firstName, lastName;
	private boolean status;
	public Policy(int id, String policyNum, String firstName, String lastName, boolean status) {
		super();
		this.id = id;
		this.policyNum = policyNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyNum() {
		return policyNum;
	}
	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
