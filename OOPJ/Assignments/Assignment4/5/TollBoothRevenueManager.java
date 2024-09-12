package org.prgm5;

import java.util.Scanner;

public class TollBoothRevenueManager {
	private double CarRate;
	private double TruckRate;
	private double MotorcycleRate;

	private int CarCnt;
	private int TruckCnt;
	private int MotorCnt;
	
	public TollBoothRevenueManager() {
		
	}

	public TollBoothRevenueManager(double CarRate, double TruckRate, double MotorcycleRate, int CarCnt, int TruckCnt,
			int MotorCnt) {
		this.CarRate = CarRate;
		this.TruckRate = TruckRate;
		this.MotorcycleRate = MotorcycleRate;

		this.CarCnt = CarCnt;
		this.TruckCnt = TruckCnt;
		this.MotorCnt = MotorCnt;
	}

	public double getCarRate() {
		return CarRate;
	}

	public void setCarRate(double carRate) {
		CarRate = carRate;
	}

	public double getTruckRate() {
		return TruckRate;
	}

	public void setTruckRate(double truckRate) {
		TruckRate = truckRate;
	}

	public double getMotorcycleRate() {
		return MotorcycleRate;
	}

	public void setMotorcycleRate(double motorcycleRate) {
		MotorcycleRate = motorcycleRate;
	}

	public int getCarCnt() {
		return CarCnt;
	}

	public void setCarCnt(int carCnt) {
		CarCnt = carCnt;
	}

	public int getTruckCnt() {
		return TruckCnt;
	}

	public void setTruckCnt(int truckCnt) {
		TruckCnt = truckCnt;
	}

	public int getMotorCnt() {
		return MotorCnt;
	}

	public void setMotorCnt(int motorCnt) {
		MotorCnt = motorCnt;
	}
	
	public double   calculateRevenue() {
		return  (CarRate * CarCnt + TruckRate * TruckCnt + MotorcycleRate * MotorCnt);
	}

	
	public String toString() {
		return "\n"+"Rates set are..."+"\n"+
				"Car rate: "+ CarRate +"\n"+
				"truck rate: "+ CarRate +"\n"+
				"motorcycle rate: "+ CarRate +"\n"+
				"********************************"+"\n"+
				"Count set are..."+"\n"+
				"Car count: "+ CarCnt +"\n"+
				"truck rate: "+ TruckCnt +"\n"+
				"Motor cycle count: "+ MotorCnt;
				
	}
}
