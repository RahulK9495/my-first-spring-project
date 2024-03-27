package com.modules;

public class Address {

	private int pin;
	private String place;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pin, String place) {
		super();
		this.pin = pin;
		this.place = place;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", place=" + place + "]";
	}
	
}
