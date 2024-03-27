package com.modules;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Car {

	private int id;
	private String name;
	private List parts;
	private Set components;
	private Map<Integer, String> BOM;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String name, List parts, Set components, Map<Integer, String> bOM) {
		super();
		this.id = id;
		this.name = name;
		this.parts = parts;
		this.components = components;
		BOM = bOM;
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
	public List getParts() {
		return parts;
	}
	public void setParts(List parts) {
		this.parts = parts;
	}
	public Set getComponents() {
		return components;
	}
	public void setComponents(Set components) {
		this.components = components;
	}
	public Map<Integer, String> getBOM() {
		return BOM;
	}
	public void setBOM(Map<Integer, String> bOM) {
		BOM = bOM;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", parts=" + parts + ", components=" + components + ", BOM=" + BOM
				+ "]";
	}
	


}
