package com.qa.ims.persistance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.qa.ims.DBConfig;
import com.qa.ims.persistance.models.Customer;
import com.qa.ims.persistance.models.Order;

public class OrdersDAO {
	DBConfig db = new DBConfig();
	Statement Stmt = null;
	Connection conn = db.connect();
	
	
//	public Orders addOrder(Orders order) {
		//try {
			

}
