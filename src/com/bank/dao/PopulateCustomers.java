package com.bank.dao;

import java.sql.Date;
import java.sql.PreparedStatement;

public class PopulateCustomers extends ConnectionDriver {

	public void setCusInfo(String fname, String lname, Date dob, int phoneno, int ssn, String email) {
		try {
			String query = "insert into customers"
					+"(FirstName, LastName, DOB, Phoneno, SSN, Email)"
					+"values(?,?,?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1,  fname);
			pst.setString(2,  lname);
			pst.setDate  (3,  dob);
			pst.setInt   (4,  phoneno);
			pst.setInt   (5,  ssn);
			pst.setString(6,  email);
			pst.executeUpdate();
			
			System.out.println("Customers Info Inserted Successfully!");
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
