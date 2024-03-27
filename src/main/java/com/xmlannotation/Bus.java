package com.xmlannotation;

public class Bus {

	private int number;
	private String name;
	private String type;
	
	public Bus() {
	
	
	}

	public Bus(int number, String name, String type) {
		super();
		this.number = number;
		this.name = name;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bus [number=" + number + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
