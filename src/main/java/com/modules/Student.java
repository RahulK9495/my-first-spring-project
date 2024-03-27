package com.modules;

import java.util.List;

public class Student {

	private int roll;
	private String name;
	private List<Address> addresses;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, List<Address> addresses) {
		super();
		this.roll = roll;
		this.name = name;
		this.addresses = addresses;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addresses=" + addresses + "]";
	}

	
	
	
}
