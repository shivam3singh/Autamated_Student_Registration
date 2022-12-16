package com.masai.model;

public class Admin {

	private int id;
	
	private String name;
	private String pass;
	public Admin(int id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

public Admin() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Admin [id=" + id + ", name=" + name + ", pass=" + pass + "]";
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

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

	
	

}

