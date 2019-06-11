package com.bank.beans;

public class Accounts {
	
	private int accid;
	private String accnum;
	private String acctype;
	
	//Account Id
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	
	//Account Number (Foreign key)
	public String getAccnum() {
		return accnum;
	}
	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}
	
	//Account Type
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	
}
