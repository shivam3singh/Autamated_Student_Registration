package com.masai.main;

import java.util.Scanner;

import com.masai.flow.AdminFlow;
import com.masai.flow.StudentFlow;
import com.masai.utility.ConsoleColors;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(ConsoleColors.CYAN_BOLD+"WELCOME TO STUDENT REGISTRATION PORTAL"+ConsoleColors.RESET);
		System.out.println("-----------------------------------------");
		System.out.println(" ");
		startRun();

	}
	public static void startRun() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println(ConsoleColors.ANSI_PURPLE);
			System.out.println("Enter '1': If You are Administrator. ");
			System.out.println("Enter '2': If you are Student. ");
			System.out.println("Enter '0': 'Exit Now' ");
				System.out.println(ConsoleColors.RESET);
			int input=sc.nextInt();
			
			if(input==0) {
				System.out.println(ConsoleColors.CYAN_BOLD +" Thank You !"+ConsoleColors.RESET);
				return;
			}
			else if(input==1) {
				AdminFlow.main(null);
			}else if(input==2) {
				StudentFlow.main(null);
			}else {
				
				System.out.println(ConsoleColors.ANSI_RED+"Please Enter A Valid Option"+ConsoleColors.RESET);
				Main.main(null);
			}
	}
	
}
