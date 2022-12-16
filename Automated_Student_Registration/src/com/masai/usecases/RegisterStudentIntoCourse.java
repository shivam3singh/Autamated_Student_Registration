package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class RegisterStudentIntoCourse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("Enter email");
		String email= sc.next();
		
		System.out.println("Enter password");
		String pass= sc.next();
		
		System.out.println("Enter Student name");
		String name= sc.next();
		
		
		System.out.println("Enter course id in which You want to take admission");
		int cid= sc.nextInt();
		
		Student s= new Student();
		s.setEmail(email);
        s.setName(name);
		s.setPassword(pass);
		
		StudentDao st= new StudentDaoImpl();
		
		try {
			String res=st.studentRegistration(s,cid);
			
			System.out.println(res);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
