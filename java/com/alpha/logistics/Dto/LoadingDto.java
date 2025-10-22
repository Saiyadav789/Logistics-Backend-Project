package com.alpha.logistics.Dto;

public class LoadingDto {
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
	public LoadingDto(String time, String date) {
		super();
		this.time = time;
		this.date = date;
	}
	public LoadingDto() {
		super();
	}
	@Override
	public String toString() {
		return "LoadingDto [time=" + time + ", date=" + date + "]";
	}
	
}
