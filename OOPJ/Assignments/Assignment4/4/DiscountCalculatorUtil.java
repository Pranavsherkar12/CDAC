package org.prgm4;
import java.util.Scanner;
public class DiscountCalculatorUtil {
	
	DiscountCalculator util = new DiscountCalculator(0,0);
	
	public void acceptrecord() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Original Price ");
		util.setOriginalPrice(sc.nextDouble());

		System.out.println("Enter the Discount percent");
		util.setDiscountRate(sc.nextDouble());

	}
	
	
	public void printrecord() {

		System.out.println(util.toString());

		System.out.println("Discount is: " + util.discountRate());
		System.out.println("final price is: " + util.finalPrice());
	}
	
	
	public void menulist() {
		System.out.println("0,Exit...");
		System.out.println("1,Enter details ...");
		System.out.println("2,Show details ...");

	}
	
}
