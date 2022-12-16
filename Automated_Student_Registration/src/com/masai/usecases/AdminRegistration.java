package com.masai.usecases;

import java.net.SecureCacheResponse;
import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.Admin;

public class AdminRegistration {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter name");
	String name=sc.next();
	
	System.out.println("Enter pass");
	String pass=sc.next();
	
	Admin adm= new Admin();
	adm.setName(name);
	adm.setPass(pass);
	
	
	AdministratorDao a= new AdministratorDaoImpl();
	try {
		String res=a.adminRegistration(adm);
		System.out.println(res);
		System.out.println("Please logIn");
	} catch (AdminException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	}
	
	
}
