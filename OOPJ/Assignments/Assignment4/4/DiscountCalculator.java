package org.prgm4;

public class DiscountCalculator {
	
	private double originalPrice;
	private double discountRate;
	double discountAmount;
	
	public DiscountCalculator(double originalPrice,double discountRate){
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "details are..."+"\n"+
				"Original Price: "+ originalPrice +"\n"+
				"Discount Percent: "+discountRate+"\n";
	}
	
	public double discountRate() {
		return (originalPrice * (discountRate / 100));
		
	}
	
	public double finalPrice() {
		return (originalPrice - discountRate());
	}
	
	
}
