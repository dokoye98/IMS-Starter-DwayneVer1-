package com.qa.ims.persistance.models;

public class Customer {
	
	private int id;
	private String Firt_name;
	private String Last_name;
	private String Username;
	private String Password;
	public Customer(String firt_name, String last_name, String username, String password) {
		super();
		Firt_name = firt_name;
		Last_name = last_name;
		Username = username;
		Password = password;
	}
	public Customer(int id, String firt_name, String last_name, String username, String password) {
		super();
		this.id = id;
		Firt_name = firt_name;
		Last_name = last_name;
		Username = username;
		Password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Firt_name == null) ? 0 : Firt_name.hashCode());
		result = prime * result + ((Last_name == null) ? 0 : Last_name.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + ((Username == null) ? 0 : Username.hashCode());
		result = prime * result + id;
		return result;
	}
	
	//toString 
	
		@Override
	public String toString() {
		return "Customer [id=" + id + ", Firt_name=" + Firt_name + ", Last_name=" + Last_name + ", Username=" + Username
				+ ", Password=" + Password + "]";
	}
	
	
	//hash code 
		
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (Firt_name == null) {
			if (other.Firt_name != null)
				return false;
		} else if (!Firt_name.equals(other.Firt_name))
			return false;
		if (Last_name == null) {
			if (other.Last_name != null)
				return false;
		} else if (!Last_name.equals(other.Last_name))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (Username == null) {
			if (other.Username != null)
				return false;
		} else if (!Username.equals(other.Username))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	//methods will be added here 
	
	
	

	//getter and setter 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirt_name() {
		return Firt_name;
	}
	public void setFirt_name(String firt_name) {
		Firt_name = firt_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

	
}
