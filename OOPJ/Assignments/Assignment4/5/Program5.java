package org.prgm5;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TollBoothRevenueManagerUtil u = new TollBoothRevenueManagerUtil();
		
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
			
			
		}while(choice != 0);
	}

}
