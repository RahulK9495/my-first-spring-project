package com.zeroxml;

import org.springframework.beans.factory.annotation.Autowired;

public class Bus {

	private int number;
	private String name;
	@Autowired
	private Engine engine;
	
	public Bus() {
	
	
	}

	public Bus(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public void myInitmethod()
	{
		System.out.println("Inside my init method.....");
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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Bus [number=" + number + ", name=" + name + ", engine=" + engine + "]";
	}

	
}
