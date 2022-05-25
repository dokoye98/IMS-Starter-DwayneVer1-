package com.qa.ims.persistance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.qa.ims.DBConfig;
import com.qa.ims.persistance.models.Customer;
import com.qa.ims.persistance.models.Order;
import com.qa.ims.persistance.models.OrderItem;

public class OrderItemDAO {
	DBConfig db = new DBConfig();
	Statement Stmt = null;
	Connection conn = db.connect();
	
	
public OrderItem addOrder(OrderItem orderi) {
		try {
			String query = "insert into OrderItem(cost,name,item_ID) values (?,?,?);";
			PreparedStatement preStmt = conn.prepareStatement(query);
			System.out.println("orderitem has been connected");
			preStmt.setFloat(1, orderi.getCost());
			preStmt.setString(2, orderi.getName());
			preStmt.setInt(3, orderi.getOrderItem_id());
			preStmt.executeUpdate();
			return readLatest();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
			

}

public OrderItem readLatest() {
	try {
		String query = "SELECT * FROM Orderitem ORDER BY orderitem_id DESC LIMIT 1;";
		PreparedStatement preStmt = conn.prepareStatement(query);
		ResultSet results = preStmt.executeQuery();
		return modelOrderitem(results);
	} catch (Exception e) {
		e.printStackTrace();
		return null;

	}
}

public OrderItem modelOrderitem(ResultSet result) {
	try {
		result.next();
		//int id = result.getInt("orderitem_ID");
		float cost = result.getFloat("Cost");
			String Name =result.getString("name");
			int Item = result.getInt("item_ID");
	OrderItem orderi =new OrderItem(cost ,Name,Item);
	return orderi;
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}



}


public OrderItem getOrderitem(int id) {
	try {
		String query = "SELECT * FROM Orderitem where orderitem_id =?";
		PreparedStatement prestmt =conn.prepareStatement(query);
		prestmt.setInt(1, id);
		ResultSet results =prestmt.executeQuery();
		return modelOrderitem(results);
	}catch(Exception e) {
		e.printStackTrace();
	return null;
	}
	
}


public boolean deleteorderitem(int id) {
	try {
		String query = "DELETE FROM orderitem WHERE orderitem_id =?;";
		PreparedStatement prestmt =conn.prepareStatement(query);
		prestmt.setInt(1, id);
		prestmt.executeUpdate();
		return true;
	}catch(Exception e) {
		return false;
	



}
}
}