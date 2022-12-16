package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.Course;

public class InsertStudent {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter course id");
		String cname= sc.next();
		System.out.println("Enter batch id");
		int bname=sc.nextInt();
		System.out.println("Enter student roll");
		int roll= sc.nextInt();
		
		
		
		AdministratorDao adm= new AdministratorDaoImpl();
		
		try {
		String s=	adm.allocateStudent(roll, bname, roll);
			System.out.println(s);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
