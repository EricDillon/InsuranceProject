package com.spring.model;

import javax.persistence.Id;

/*================================================================================================
 * User
 * 
 * Parent class of all the different users that can use this system. 
 * Used only for getters/setters of common data.
 *================================================================================================ 
 */

public class User 
{
	@Id
	private int id;
	private int phoneNum;
	private String firstName,lastName,email,password;
	
	
	
	public User(int id, int phoneNum, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.phoneNum = phoneNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
