package com.bank.beans;

import java.util.Date;

public class Employees {
	
	private int emplid;
	private String firstname;
	private String lastname;
	private Date dob;
	private String emplstatus;
	
	//Employee's ID
	public int getEmplid() {
		return emplid;
	}
	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}
	
	//Employee's First Name
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	//Employee's Last Name
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	//Employee's Date Of Birth
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	//Employee's Status
	public String getEmplstatus() {
		return emplstatus;
	}
	public void setEmplstatus(String emplstatus) {
		this.emplstatus = emplstatus;
	}
	
	

}
