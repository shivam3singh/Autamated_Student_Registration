package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.InformationCourseDTO;

public class SearchInformationCourse {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter course id to Search Information about Course");
			int cid= sc.nextInt();
			
		
			
			AdministratorDao adm= new AdministratorDaoImpl();
			

			try {
			List<InformationCourseDTO> d=	adm.searchInformationOfCourse(cid);
				
			d.forEach(s->System.out.println(s));
				
			} catch (AdminException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
}
	
}
