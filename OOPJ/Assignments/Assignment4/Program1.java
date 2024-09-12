package org.prgm1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoanAmortizationCalculatorUtil  u = new LoanAmortizationCalculatorUtil();
		
		int choice;
		
		do{
			u.menuList();
			System.out.println("Enter your choice");
			choice = sc.nextInt();		
		
		switch(choice) {
		
		case 0:
			System.out.println("Invalid choice");
			break;
			
		case 1:
			u.acceptRecord();
			break;
			
			
		case 2:
			u.printRecord();
			break;
			
		
		}
		
		}while(choice != 0);

	}
}
