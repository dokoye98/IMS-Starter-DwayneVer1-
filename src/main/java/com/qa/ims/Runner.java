package com.qa.ims;

import com.qa.ims.persistance.dao.CustomerDAO;
import com.qa.ims.persistance.dao.OrderItemDAO;
import com.qa.ims.persistance.models.Customer;
import com.qa.ims.persistance.models.OrderItem;

public class Runner {
	public static void main(String[] arg) {
		
	DBConfig db = new DBConfig();
	 
CustomerDAO cdao = new CustomerDAO();
OrderItemDAO odao= new OrderItemDAO();

odao.addOrder(new OrderItem(1, 252332.23f,"model 2324", 12));

cdao.addCustomer(new Customer("sammy","lam","lambo",""));

		
		
		
	}

}
