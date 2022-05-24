package com.qa.ims.persistance.models;

public class Orders {

private int Order_ID;
private int Customer_ID;
private String name;

//constructor without Order_ID
public Orders(int customer_ID, String name) {
	super();
	Customer_ID = customer_ID;
	this.name = name;
}

//Constructor with Order_ID
public Orders(int order_ID, int customer_ID, String name) {
	super();
	Order_ID = order_ID;
	Customer_ID = customer_ID;
	this.name = name;
}


//toString
@Override
public String toString() {
	return "Orders [Order_ID=" + Order_ID + ", Customer_ID=" + Customer_ID + ", name=" + name + "]";
}
//hashcode
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Customer_ID;
	result = prime * result + Order_ID;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
//getters and setters

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Orders other = (Orders) obj;
	if (Customer_ID != other.Customer_ID)
		return false;
	if (Order_ID != other.Order_ID)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

public int getOrder_ID() {
	return Order_ID;
}

public void setOrder_ID(int order_ID) {
	Order_ID = order_ID;
}

public int getCustomer_ID() {
	return Customer_ID;
}

public void setCustomer_ID(int customer_ID) {
	Customer_ID = customer_ID;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}









}


	

