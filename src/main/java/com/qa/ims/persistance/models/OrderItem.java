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


	@Override
	public String toString() {
		return "OrderItem [OrderItem_id=" + OrderItem_id + ", cost=" + cost + ", name=" + name + ", Customer_id="
				+ Customer_id + "]";
	}

//hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Customer_id;
		result = prime * result + OrderItem_id;
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (Customer_id != other.Customer_id)
			return false;
		if (OrderItem_id != other.OrderItem_id)
			return false;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	
	
	

}
