package com.scopes;

public class Employee {
	
	private int id;
	private String name;
	private Address Address;

	public Employee() {


	}

	public Employee(Object o) {


	}
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return Address;
	}


	public void setAddress(Address address) {
		this.Address = address;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
	

}
