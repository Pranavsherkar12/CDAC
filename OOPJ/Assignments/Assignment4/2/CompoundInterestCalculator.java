package orr.prgm2;



public class CompoundInterestCalculator {

	private double principal;
	private double annualInterestRate;
	private double numberOfCompounds;
	private double years;
	
//	public CompoundInterestCalculator(){
//	
//	}

	public CompoundInterestCalculator(double principal,double annualInterestRate,double numberOfCompounds,double years) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
	}
	
	public double getPrincipal() {
		return principal;
	}
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public double getInterestRate() {
		return annualInterestRate;
	}
	
	public void setInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getNoOfcompounds() {
		return numberOfCompounds;
	}
	
	public void setNoOfcompounds(double numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}
	
	public double getYears() {
		return years;
	}
	
	public void setYears(double years) {
		this.years = years;
	}
	
	
	public double calculateFutureValue() {
		double interestRateDecimal = annualInterestRate / 100;
	double futurevalue =  principal
				* Math.pow((1 + interestRateDecimal / numberOfCompounds), numberOfCompounds * years);
	return futurevalue;
	}
	
	public double totalInterestEarn() {
		double totalInterest = calculateFutureValue() - principal;
		return totalInterest;
	}
	
	public String toString() {
		return "Principal is: " + principal +"\n"+
				"Annual Interest Rate is: " + annualInterestRate +"\n"+
				"Number Of Compounds is: " + numberOfCompounds;
	}
	

}
