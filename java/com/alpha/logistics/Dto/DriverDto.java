package com.alpha.logistics.Dto;

public class DriverDto {

	private int id;
	private String name;
	private long contact;
	public DriverDto(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
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
	public long getContact() {
		return contact;
	}
	@Override
	public String toString() {
		return "DriverDto [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public DriverDto() {
		super();
	}
}
