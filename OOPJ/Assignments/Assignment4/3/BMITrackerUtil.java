package orgg.prgm3;

import java.util.Scanner;
public class BMITrackerUtil {
	
	BMITracker util = new BMITracker(0,0);
	
	
	public void acceptrecord() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Weight ");
		util.setWeight(sc.nextInt());

		System.out.println("Enter the height ");
		util.setHeight(sc.nextFloat());

	}
	
	public void printrecord() {

		System.out.println(util.toString());

		System.out.printf("Bmi is:%.2f ", util.calculateBMI());
		System.out.println("\nYou are: " + util.classifyBMI());

	}
	
	public void menulist() {
		System.out.println("0,Exit...");
		System.out.println("1,Enter details ...");
		System.out.println("2,Show details ...");

	}
	
		
}
