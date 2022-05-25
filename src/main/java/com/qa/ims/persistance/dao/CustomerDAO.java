package com.qa.ims.persistance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.qa.ims.DBConfig;
import com.qa.ims.persistance.models.Customer;

public class CustomerDAO {
	
	
	// this will be code written by me
		DBConfig db = new DBConfig();
		Statement Stmt = null;
		Connection conn = db.connect();

		// this is to add a customer to the IMS databases
		public Customer addCustomer(Customer customer) {
			try {
				String query = "INSERT INTO Customer(First_name,Last_name,Username,password) values(?,?,?,?);";
				PreparedStatement preStmt = conn.prepareStatement(query);
				System.out.println("connected");
				preStmt.setString(1, customer.getFirt_name());
				preStmt.setString(2, customer.getLast_name());
				preStmt.setString(3, customer.getUsername());
				preStmt.setString(4, customer.getPassword());
				preStmt.executeUpdate();
				return readLatest();
				
			} catch (Exception e) {

			}
			return null;
		}

		public Customer readLatest() {
			try {
				String query = "SELECT * FROM Customer ORDER BY id DESC LIMIT 1;";
				PreparedStatement preStmt = conn.prepareStatement(query);
				ResultSet results = preStmt.executeQuery();
				return modelCustomer(results);
			} catch (Exception e) {
				e.printStackTrace();
				return null;

			}
		}

		public Customer modelCustomer(ResultSet result) {
			try {
				result.next();
				int id = result.getInt("id");
				String Firstname = result.getString("First_name");
					String Lastname =result.getString("Last_name");
					String Username = result.getString("Username");
					String Password = result.getString("Password");
			Customer customer =new Customer(Firstname, Lastname, Username, Password);
			return customer;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
			
		}

		
			
		}



