package com.alpha.logistics.Dto;

public class UnloadingDto {
	private String time;
	private String date;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public UnloadingDto(String time, String date) {
		super();
		this.time = time;
		this.date = date;
	}
	public UnloadingDto() {
		super();
	}
	@Override
	public String toString() {
		return "UnloadingDto [time=" + time + ", date=" + date + "]";
	}
	
}
