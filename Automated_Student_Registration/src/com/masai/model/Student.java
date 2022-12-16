package com.masai.model;

public class Student {

	private int roll;


	private String email;
	private String password;
	private String name;
	
	
	public Student() {};
	
	
	
	
	public Student(int roll, String name, String email, String password) {
		super();
		this.roll = roll;
		this.name = name;
	
		this.email = email;
		this.password = password;
	}




	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "Student name : "+name+"\nStudent roll : "+roll+"\nStudent Email : "+email+"\nStudent password :"+password;
	}
	
	
}
