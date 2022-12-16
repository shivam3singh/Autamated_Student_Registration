package com.masai.model;

public class InformationCourseDTO {
	
	
	private String cname; 
	private int cfee; 
	private String bname; 
	private int bseats; 
	

	public InformationCourseDTO() {
		// TODO Auto-generated constructor stub
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getCfee() {
		return cfee;
	}


	public void setCfee(int cfee) {
		this.cfee = cfee;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public int getBseats() {
		return bseats;
	}


	public void setBseats(int bseats) {
		this.bseats = bseats;
	}


	@Override
	public String toString() {
		return "InformationCourseDTO [cname=" + cname + ", cfee=" + cfee + ", bname=" + bname + ", bseats=" + bseats
				+ "]";
	}


	public InformationCourseDTO(String cname, int cfee, String bname, int bseats) {
		super();
		this.cname = cname;
		this.cfee = cfee;
		this.bname = bname;
		this.bseats = bseats;
	}
	
	
	
}
