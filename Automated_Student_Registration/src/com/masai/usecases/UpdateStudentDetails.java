package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;

public class UpdateStudentDetails {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the field which you want to update");
		String field=sc.next();
		
		System.out.println("Enter the new value");
		String newdata=sc.next();
		
		System.out.println("ENter your roll no. for Updation");
		int roll=sc.nextInt();
		
		
		StudentDao s= new StudentDaoImpl();
		try {
			
			System.out.println(s.updateDetails(roll, field, newdata));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
