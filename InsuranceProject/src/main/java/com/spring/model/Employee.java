package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*================================================================================================
 * EMPLOYEE
 * -----------------------------------------------------------------------------------------------
 * 
 * POJO class for Employee
 *================================================================================================ 
 */

@Entity
@Table(name="assinsurance_empl_tbl")
public class Employee
{
	@Id
	@GeneratedValue
	@Column(precision = 5)
	private int id;
	@Column(precision = 1)
	private int role;
	private boolean status;
	@Column(length = 25)
	private String username, password, email, firstname,lastName;
	public Employee(int id, int role, boolean status, String username, String password, String email) {
		super();
		this.id = id;
		this.role = role;
		this.status = status;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public Employee()
	{
		
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
