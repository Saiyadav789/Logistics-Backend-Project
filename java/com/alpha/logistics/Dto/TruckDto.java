package com.alpha.logistics.Dto;

public class TruckDto {
	private int id;
	private String name;
	private long number;
	private double capacity;
	private String status="available";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "TruckDto [id=" + id + ", name=" + name + ", number=" + number + ", capacity=" + capacity + ", status="
				+ status + "]";
	}
	public TruckDto() {
		super();
	}
	public TruckDto(int id, String name, long number, double capacity, String status) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.capacity = capacity;
		this.status = status;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
