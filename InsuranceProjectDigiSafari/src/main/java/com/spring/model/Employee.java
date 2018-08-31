package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;


/*================================================================================================
 * EMPLOYEE
 * -----------------------------------------------------------------------------------------------
 * 
 * Can register account, submit claims (even without an account), view claims
 *================================================================================================ 
 */

@Entity
@Table(name="assinsurance_empl_tbl")
public class Employee extends User 
{
	private String title;
	

	public Employee(int id, int phoneNum, String firstName, String lastName, String email, String password) {
		super(id, phoneNum, firstName, lastName, email, password);
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
