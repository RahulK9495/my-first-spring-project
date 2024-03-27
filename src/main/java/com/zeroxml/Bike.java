package com.zeroxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Bike {
	
//	@Value(value = "10")
	private int id;
//	@Value(value = "jupiter")
	private String name;
//	@Value(value = "moped")
	private String type;
	
	public Bike() {
	
	
	}
	

	public Bike(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	

}
