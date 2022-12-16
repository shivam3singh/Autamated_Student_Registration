package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;

public class UpdateSeats {

	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter batch id to update seats");
	int bid= sc.nextInt();
	
	System.out.println("Enter updated seats ");
	int seats=sc.nextInt();
	
	
	AdministratorDao adm= new AdministratorDaoImpl();
	
	try {
	String s=	adm.updateSeatsOfBatch(bid, seats);
		System.out.println(s);
	} catch (AdminException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
