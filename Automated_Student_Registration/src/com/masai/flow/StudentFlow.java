package com.masai.flow;

import java.util.Scanner;

import com.masai.main.Main;
import com.masai.usecases.AddCourse;
import com.masai.usecases.AdminRegistration;
import com.masai.usecases.DeleteCourse;
import com.masai.usecases.RegisterStudentIntoCourse;
import com.masai.usecases.Registerstudent;
import com.masai.usecases.SearchInformationCourse;
import com.masai.usecases.StudentLogin;
import com.masai.usecases.UpdateFee;
import com.masai.usecases.UpdateSeats;
import com.masai.usecases.UpdateStudentDetails;
import com.masai.utility.ConsoleColors;

public class StudentFlow {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(ConsoleColors.BLACK_BOLD);
		System.out.println("Welcome to Student Panel");
		System.out.println(ConsoleColors.RESET);
		
		 while(true) {
		
			 System.out.println(ConsoleColors.ANSI_PURPLE);
		System.out.println(" ==================================");
		System.out.println("| Enter 1 for Register as Student  |");
		System.out.println("| Enter 2 for login as Student     |");
		System.out.println("| Enter 0 to Exit                  |");
		System.out.println(" ==================================");
	System.out.println(ConsoleColors.RESET);
	 Scanner sc= new Scanner(System.in);
	 
	 int res= sc.nextInt();
	
	 if(res==1) {
	
			boolean b1=	Registerstudent.main(null);
		
			if(b1) {
				System.out.println("Registration Succesful");
				System.out.println("Please log in");
				 StudentFlow.main(null);
			}else {
				System.out.println("Please provide valid Data!");
				StudentFlow.main(null);
			}
		
		
	}else if(res==2) {
		boolean b2=	StudentLogin.main(null);
		if(b2) {
			
			stu();
			
			
		}else {
			
			break;
		}
	}else if(res==0){
		System.out.println("Thanks");
	
		break;
	}else{
		System.out.println("Please provide valid option");
		StudentFlow.main(null);
	}
	}
	
}
	
	public static void stu() {
		

	while(true) {
		System.out.println(ConsoleColors.ANSI_CYAN);
		System.out.println(" ===========================================");
		System.out.println("| Enter 1 to update your Details            |");
		System.out.println("| Enter 2 to see Details of a Course        |");
		System.out.println("| Enter 3 to Register yourself in a course  |");
		System.out.println("| Enter 4 to Exist                          |");
		System.out.println("|===========================================|");
		System.out.println(ConsoleColors.RESET);
		Scanner sc= new Scanner(System.in);
		
		   int op= sc.nextInt();
		    
		    if(op==1) {
		    	UpdateStudentDetails.main(null);
		    }
		    else if(op==2) {
            	SearchInformationCourse.main(null);
		    }
		    else   if(op==3) {
	                 RegisterStudentIntoCourse.main(null);
              }
		    else  if(op==4) {
	
		break;
		
		    
		
	}
	}
	
	
}
}
