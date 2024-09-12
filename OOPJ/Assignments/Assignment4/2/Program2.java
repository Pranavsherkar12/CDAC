package orr.prgm2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CompoundInterestCalculatorUtil u = new CompoundInterestCalculatorUtil();
		
		int choice;
		do {
			
			u.menulist();
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch(choice) {
			case 0:
				System.out.println("Exit...");
				break;
			case 1:
				u.acceptRecord();
				break;
				
			case 2:
				u.printRecord();
				break;
				
			default:
				System.out.println("Envalid choice"); 
				
				
			}

		}while(choice != 0);
		

	}

}
