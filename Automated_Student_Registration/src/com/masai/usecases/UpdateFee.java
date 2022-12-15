package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;

public class UpdateFee {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter course id to update fee");
		int cid= sc.nextInt();
		
		System.out.println("Enter updated amount ");
		int fee=sc.nextInt();
		
		
		AdministratorDao adm= new AdministratorDaoImpl();
		
		try {
			String res=adm.updateFee(cid, fee);
			System.out.println(res);
			
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
