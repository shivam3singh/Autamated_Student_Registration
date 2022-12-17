package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class Registerstudent {

public static boolean main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("Enter email");
		String email= sc.next();
		
		System.out.println("Enter password");
		String pass= sc.next();
		
		System.out.println("Enter Student name");
		String name= sc.next();
		
		
		
		
		Student s= new Student();
		s.setEmail(email);
        s.setName(name);
		s.setPassword(pass);
		
		StudentDao st= new StudentDaoImpl();
		
		try {
			String res=st.registration(s);
			
			return true;
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}
	
	
}
