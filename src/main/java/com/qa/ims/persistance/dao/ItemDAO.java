package com.qa.ims.persistance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.qa.ims.DBConfig;
import com.qa.ims.persistance.models.Customer;
import com.qa.ims.persistance.models.Item;
import com.qa.ims.persistance.models.OrderItem;

public class ItemDAO {

	public class OrderItemDAO {
		DBConfig db = new DBConfig();
		Statement Stmt = null;
		Connection conn = db.connect();
		Item item = new Item(1, 12.4f, "new");
		
		
	public Item additem(Item item) {
			try {
				String query = "insert into item(id,cost,name) values (?,?,?);";
				PreparedStatement preStmt = conn.prepareStatement(query);
				System.out.println("item has been connected");
				preStmt.setFloat(1, item.getId());
				preStmt.setFloat(2, item.getCost());
				preStmt.setString(3, item.getName());
				preStmt.executeUpdate();
				return readLatest();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
}
	public Item readLatest() {
		try {
			String query = "SELECT * FROM item ORDER BY id DESC LIMIT 1;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			ResultSet results = preStmt.executeQuery();
			return modelitem(results);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		}
	

	public Item modelitem(ResultSet result) {
		try {
			result.next();
			int id = result.getInt("item_ID");
			float cost = result.getFloat("Cost");
				String Name =result.getString("name");
			
		Item item =new Item(id,cost ,Name);
		return item;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}}
	
	
	public Item getitembyid(int id) {
		try {
			String query = "SELECT * FROM item where id =?";
			PreparedStatement prestmt =conn.prepareStatement(query);
			prestmt.setInt(1, id);
			ResultSet results =prestmt.executeQuery();
			return modelitem(results);
		}catch(Exception e) {
			e.printStackTrace();
		return null;
		}
		
	}


	public boolean deleteitem(int id) {
		try {
			String query = "DELETE FROM item WHERE id =?;";
			PreparedStatement prestmt =conn.prepareStatement(query);
			prestmt.setInt(1, id);
			prestmt.executeUpdate();
			return true;
		}catch(Exception e) {
			return false;
		
	
	}
			
			
	
	}}}


