package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDriver {

		// Connects to the Database
		protected Connection con;
		//Execute the Query for SQL statements
		protected Statement st;
		//Holds are the results we achieve by Queries
		protected ResultSet rs;
		
		//Create a constructor for our class
		public ConnectionDriver() {
			try {
				//Load the Driver Class
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Driver Manager Connection 
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingsystem","root", "admin");
				//To Check if the connection is successful or not
				//System.out.println("connected");
								
				//Create Statement
				st = con.createStatement();

			
			}catch(Exception ex) {
				System.out.println("Error: "+ex);
			}	
	}
	
		/*
		public void getName() {
				try {
					String query = " select * from customers";
					rs = st.executeQuery(query);
					
					while(rs.next()) {
						String fname = rs.getString("Firstname");
						String lname = rs.getString("LastName");
						System.out.println("Full Name: "+ fname +" "+lname);
					}
					
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}

		*/
		
}
