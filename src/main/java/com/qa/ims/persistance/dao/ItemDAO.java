package com.qa.ims.persistance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.qa.ims.DBConfig;
import com.qa.ims.persistance.models.Item;
import com.qa.ims.persistance.models.OrderItem;

public class ItemDAO {

	public class OrderItemDAO {
		DBConfig db = new DBConfig();
		Statement Stmt = null;
		Connection conn = db.connect();
		
		
	public Item addItem(Item item) {
			try {
				String query = "insert into Item(id,cost,name) values (?,?,?);";
				PreparedStatement preStmt = conn.prepareStatement(query);
				System.out.println("orderitem has been connected");
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
			String query = "SELECT * FROM Orderitem ORDER BY id DESC LIMIT 1;";
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
		}}}

	
		
	}