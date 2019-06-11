package com.bank.beans;

import java.util.Date;

public class Customers {
	

	private long id;
	private String firstname;
	private String lastname;
	private Date dob;
	private int phoneno;
	private int ssn;
	private String email;
	
	
	
	//Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	//First Name
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	//Last Name
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	//Date of Birth
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	//Phone No
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
	//Social Security Number
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	
	/*
	private Customers (long id, String fname, String lname, int dob, String email, int phone, String address) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.address = address;

	}
*/
}