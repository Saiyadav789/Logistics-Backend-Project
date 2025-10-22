package com.alpha.logistics.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	private int id;
	private String street;
	private String city;
	private int pin;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(int id, String street, String city, int pin, String state) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.pin = pin;
		this.state = state;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", pincode=" + pin + ", state="
				+ state + "]";
	}
	
	
}
