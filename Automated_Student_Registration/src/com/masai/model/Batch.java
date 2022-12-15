package com.masai.model;

public class Batch {

	private  int bid;
	private String bname;
	private int duration;
	private  int cid;
	private int seats;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", duration=" + duration + ", cid=" + cid + ", seats=" + seats
				+ "]";
	}
	
	
}
