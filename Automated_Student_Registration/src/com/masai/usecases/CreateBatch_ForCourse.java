package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.Batch;
import com.masai.model.Course;

public class CreateBatch_ForCourse {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Batch name");
		String cname= sc.next();
		System.out.println("Enter Batch duration");
		int duration=sc.nextInt();
	
		System.out.println("Enter Batch seats");
		int seats= sc.nextInt();
		
		System.out.println("Enter course id for which you want to create batch");
		int c_Id= sc.nextInt();
		
		Batch b= new Batch();
		b.setBname(cname);
		b.setDuration(duration);
		b.setSeats(seats);
		
			
			
			
		
			
			AdministratorDao adm= new AdministratorDaoImpl();
		
			try {
				
				System.out.println(adm.createBatch(b, c_Id));
			} catch (AdminException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
	
}
