package com.qa.ims;

import com.qa.ims.persistance.dao.CustomerDAO;
import com.qa.ims.persistance.dao.ItemDAO;
import com.qa.ims.persistance.dao.OrderItemDAO;
import com.qa.ims.persistance.models.Customer;
import com.qa.ims.persistance.models.OrderItem;

public class Runner {
	public static void main(String[] arg) {
		
	DBConfig db = new DBConfig();
	 
CustomerDAO cdao = new CustomerDAO();
OrderItemDAO odao= new OrderItemDAO();
ItemDAO itas = new ItemDAO();


cdao.addCustomer(new Customer("mamasass","lam","lambo","3445"));
odao.addOrder(new OrderItem(12.5f, "percy jackson", 123));
		
		
		
	}

}
