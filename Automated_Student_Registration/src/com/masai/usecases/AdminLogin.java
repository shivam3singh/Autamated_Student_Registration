package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.main.Main;
import com.masai.model.Admin;

public class AdminLogin {

	public static boolean main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter pass");
		String pass=sc.next();
		
		
		
		
		AdministratorDao a= new AdministratorDaoImpl();
	
		try {
			
			a.adminLogin(name, pass);
			
	System.out.println("Login Succesfull");
			return true;
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		return false;
		}
		
		
	}
	
}
