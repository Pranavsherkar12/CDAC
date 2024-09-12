package org.prgm4;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiscountCalculatorUtil u = new DiscountCalculatorUtil();
		
		int choice;
		do {
			u.menulist();
			System.out.println("Enter your choice..");
			choice = sc.nextInt();
			
			switch(choice){
			case 0:
				System.out.println("Exit...");
				break;
			
			case 1:
				u.acceptrecord();
				break;
				
			case 2:
				u.printrecord();
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}while(choice!=0);

	}

}
