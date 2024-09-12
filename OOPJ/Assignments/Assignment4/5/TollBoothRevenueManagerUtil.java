package org.prgm5;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
	
	Scanner sc = new Scanner(System.in);
	TollBoothRevenueManager util = new TollBoothRevenueManager();
//	private int MotorCnt;
//	private int CarCnt; 
	
	public void acceptrecord() {
		
		System.out.println("Set toll rates...");
		System.out.println("\nEnter the rate for car");
		util.setCarRate(sc.nextDouble());

		System.out.println("Enter the rate for Truck");
		util.setTruckRate(sc.nextDouble());

		System.out.println("Enter the rate for motor");
		util.setMotorcycleRate(sc.nextDouble());
		
		System.out.println("\nEnter count of vehicles...");
		
		System.out.println("Enter the count for car");
		util.setCarCnt(sc.nextInt());

		System.out.println("Enter the count for Truck");
		util.setTruckCnt(sc.nextInt());

		System.out.println("Enter the count for motor");
		util.setMotorCnt(sc.nextInt());
		
	}
	
	
	public void printrecord() {
		
		System.out.println(util.toString());
		
		int totalnovehicle = util.getCarCnt() + util.getMotorCnt() + util.getTruckCnt();
		System.out.println("total no of vehicle is: " + totalnovehicle);
		System.out.println("total revenue is: " + util.calculateRevenue()+"\n");
	}
	
	
	
		public void menulist() {
			System.out.println("0,Exit...");
			System.out.println("1,Enter details ...");
			System.out.println("2,Show details ...");

	}
}
