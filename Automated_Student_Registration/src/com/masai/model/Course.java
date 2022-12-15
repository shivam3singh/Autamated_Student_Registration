package com.masai.model;

public class Course {

	private  int cid;
	private String c_name;
	private int fee;
	private int seats;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", c_name=" + c_name + ", fee=" + fee + ", seats=" + seats + "]";
	}
	
	
	
}
