package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class utility {

	private static String drivername;
	private static String url;
	private static String username;
	private static String password;
	
	
	static {
		
	ResourceBundle rb = ResourceBundle.getBundle("db");	
		
	drivername = rb.getString("db.drivername");
	url = rb.getString("db.url");
	username= rb.getString("db.username");
	password = rb.getString("db.password");
	
		
		
	}
	
	
	
	
	public static Connection provideconnetion(){
		
		Connection conn= null;
		
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		try {
		conn=	DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
