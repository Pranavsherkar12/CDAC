package org.prgm1;
import java.util.Scanner;

class LoanAmortizationCalculatorUtil {
	 
	 LoanAmortizationCalculator loan= new LoanAmortizationCalculator();
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principal amount");
		loan.setPrincipal(sc.nextDouble());

		System.out.println("Enter the interest rate");
		loan.setinterestrate(sc.nextDouble());

		System.out.println("Enter the loan term");
		loan.setloanterm(sc.nextInt());
		
		
	}
	
	 public void printRecord() {
	            System.out.println(loan.toString());
	            double monthlyPayment = loan.calculateMonthlyPayment();
	            double totalPayment = loan.calculateTotalPayment();

	            System.out.printf("Monthly Payment: ₹%.2f%n", monthlyPayment);
	            System.out.printf("Total Payment over the loan period: ₹%.2f%n", totalPayment);
	 
	    }
	 
	public void menuList() {
		System.out.println("1,Enter loan detail");
		System.out.println("2,Display loan details");
		System.out.println("0,Exit...");
	
		}
}
