package com.masai.model;

public class StudentDTO {

	private int sroll;
	private String name;
	private String cname;
	private String bname;
	public StudentDTO(int sroll, String name, String cname, String bname) {
		super();
		this.sroll = sroll;
		this.name = name;
		this.cname = cname;
		this.bname = bname;
	}
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "StudentDTO [sroll=" + sroll + ", name=" + name + ", cname=" + cname + ", bname=" + bname + "]";
	}
	
	
	
	
	
}
