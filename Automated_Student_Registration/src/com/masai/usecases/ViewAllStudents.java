package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.StudentDTO;

public class ViewAllStudents {

	public static void main(String[] args) {
		
		
		//Scanner sc= new Scanner(System.in);
		
		
		
		AdministratorDao adm= new AdministratorDaoImpl();
		
		try {
		List<StudentDTO> ss=	adm.viewAllStudent_Batch();
		ss.forEach(s->System.out.println(s));	
		
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
}
