package com.qa.ims.persistance.models;

public class OrderItem {
	
	private int OrderItem_id;
	private float cost;
	private String name;
	private int Customer_id;
	//without OrderItem_ID
	public OrderItem(float cost, String name, int customer_id) {
		super();
		this.cost = cost;
		this.name = name;
		Customer_id = customer_id;
	}
	
	
	//with OrderItem_ID
	public OrderItem(int orderItem_id, float cost, String name, int customer_id) {
		super();
		OrderItem_id = orderItem_id;
		this.cost = cost;
		this.name = name;
		Customer_id = customer_id;
	}
	

	
	

}
