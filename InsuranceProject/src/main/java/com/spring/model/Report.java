package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*================================================================================================
 * REPORT
 * -----------------------------------------------------------------------------------------------
 * 
 * POJO class for Report
 *================================================================================================ 
 */

@Entity
@Table(name="assinsurance_rprt_tbl")
public class Report {
	@Id
	@GeneratedValue
	@Column(precision = 5)
	private int rid;
	
	private String descr;
	@Column(precision = 5, scale = 2)
	private double repairCost;

	public Report()
	{
		
	}
	public Report(int rid, String descr, double repairCost) {
		super();
		this.rid = rid;
		this.descr = descr;
		this.repairCost = repairCost;
	}



	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public double getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}

}
