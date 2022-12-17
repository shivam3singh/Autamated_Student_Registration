package com.masai.flow;

import java.util.Scanner;

import com.masai.usecases.AddCourse;
import com.masai.usecases.AdminLogin;
import com.masai.usecases.AdminRegistration;
import com.masai.usecases.AllDetailsCourseAndSeats;
import com.masai.usecases.CreateBatch_ForCourse;
import com.masai.usecases.DeleteCourse;
import com.masai.usecases.InsertStudent;
import com.masai.usecases.SearchInformationCourse;
import com.masai.usecases.UpdateFee;
import com.masai.usecases.UpdateSeats;
import com.masai.usecases.UpdateStudentDetails;
import com.masai.utility.ConsoleColors;

public class AdminFlow {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(ConsoleColors.BLACK_BOLD);
		System.out.println("Welcome to Admin Panel");
		System.out.println(ConsoleColors.RESET);
		System.out.println(ConsoleColors.ANSI_CYAN);
		 while(true) {
			 Thread.sleep(100);
		System.out.println(" ==================================");
		 Thread.sleep(100);
		System.out.println("| Enter 1 for Register as Admin    |");
		 Thread.sleep(100);
		System.out.println("| Enter 2 for login as Admin       |");
		 Thread.sleep(100);
		System.out.println("| Enter 0 to Exit                  |");
		 Thread.sleep(100);
		System.out.println(" ==================================");
		
		System.out.println(ConsoleColors.RESET);
	 Scanner sc= new Scanner(System.in);
	 
	 int res= sc.nextInt();
	
	 if(res==1) {
	
			boolean b1=	AdminRegistration.main(null);
		
			if(b1) {
				System.out.println("Registration Succesful");
				System.out.println("Please log in");
				 AdminFlow.main(null);
			}else {
				System.out.println("Please provide valid Data!");
				 AdminFlow.main(null);
			}
		 
		 
		 
		 
	 }else if(res==2) {
		 
		boolean b=AdminLogin.main(null);
		 if(b) {
			 afterAdminLogin();
			 
			 break;
		 }else {
			 System.out.println("Please provide valid Information");
			 AdminFlow.main(null);
		 }
		 
	
	 }else if(res==0) {
		 System.out.println("Thank You!");
		 return;
	 }
	 else {
		 System.out.println("Please Enter valid Option");
		 AdminFlow.main(null);
	 }
		
	 
	 
	 
	 
		
	}
	}
	
	
	public static void afterAdminLogin() throws InterruptedException {
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Welcome to Admin Panel");
		
		while(true) {
			System.out.println(ConsoleColors.ANSI_PURPLE);
			 Thread.sleep(100);
			System.out.println(" ===========================================");
			 Thread.sleep(100);
			System.out.println("| Enter 1 to Add Course                     |");
			 Thread.sleep(100);
			System.out.println("| Enter 2 to Delete Course                  |");
			 Thread.sleep(100);
			System.out.println("| Enter 3 to Update fee of a Course         |");
			 Thread.sleep(100);
			System.out.println("| Enter 4 to Update Seats in a Batch        |");
			 Thread.sleep(100);
			System.out.println("| Enter 5 to Admit student in a course      |");
			 Thread.sleep(100);
			System.out.println("| Enter 6 to create Batch                   |");
			 Thread.sleep(100);
			System.out.println("| Enter 7 to Search Information of a Course |");
			 Thread.sleep(100);
			System.out.println("| Enter 8 to View all Details of all Batch  |");
			 Thread.sleep(100);
			System.out.println("| Enter 9 to Exit                           |");
			 Thread.sleep(100);
			System.out.println("| Enter 10 to Back                          |");
			 Thread.sleep(100);
		    System.out.println(" ============================================");
		    System.out.println(ConsoleColors.RESET);
		    int op= sc.nextInt();
		    
		    if(op==1) {
		    	AddCourse.main(null);
		    }
		    else if(op==2) {
            	DeleteCourse.main(null);
		    }
		    else   if(op==3) {
	                 UpdateFee.main(null);
              }
		    else  if(op==4) {
	UpdateSeats.main(null);
                               }
		    else   if(op==5) {
	InsertStudent.main(null);
                          } 
		    else   if(op==6) {
	CreateBatch_ForCourse.main(null);
                          }
		    else  if(op==7) {
	SearchInformationCourse.main(null);
                          }
		    else  if(op==8) {
	AllDetailsCourseAndSeats.main(null);
                            }
		    else  if(op==9) {
		    	System.out.println("Thank You!");
	return;
                            }
		    else if(op==10) {
		    	AdminFlow.main(null);
		    }else {
		    	System.out.println("Please Enetr valid Option");
		    }
		    
		}
		
	}
	
	
	
		}

