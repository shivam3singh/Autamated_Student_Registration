package com.masai.flow;

import java.util.Scanner;

import com.masai.usecases.AdminLogin;
import com.masai.usecases.AdminRegistration;

public class AdminFlow {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Admin Panel");
		
		
		System.out.println(" ==================================");
		System.out.println("| Enter 1 for Register as Admin    |");
		System.out.println("| Enter 2 for login as Admin       |");
		System.out.println(" ==================================");
		
	 Scanner sc= new Scanner(System.in);
	 
	 int res= sc.nextInt();
	 if(res==1) {
	
		
		 
		 
		 
		 
	 }else if(res==2) {
		 
		 AdminLogin.main(null);
		 
		 
	
	 }else {
		 System.out.println("Please Enter valid Option");
		 AdminFlow.main(null);
	 }
		
	 
	 
	 
	 
		
	}
	
	public static login_Singnup() {
		
		
		
	}
	
	
	
		}

