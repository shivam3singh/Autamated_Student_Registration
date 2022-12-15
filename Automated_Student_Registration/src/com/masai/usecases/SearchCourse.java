package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.Course;

public class SearchCourse {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter course id to get Information about Course");
			int cid= sc.nextInt();
			
		
			
			AdministratorDao adm= new AdministratorDaoImpl();
			
			
			try {
			Course c=adm.searchInformation_Course(cid);
				
			System.out.println("Course name :"+c.getC_name());
			
			System.out.println("Course id :"+c.getCid());
			
			System.out.println("Course fee :"+c.getFee());
			
			System.out.println("Total Course seats :"+c.getSeats());
			
				
			} catch (AdminException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
}
