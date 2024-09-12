package org.prgm1;


public class LoanAmortizationCalculator {
	private double principal;
	private double annualInterestRate;
	private int loanTerm;
	double monthlyPayment;
	
	public LoanAmortizationCalculator() {
		
	}
	
	public LoanAmortizationCalculator(double principal,double annualInterestRate,int loanTerm) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.loanTerm = loanTerm;
		
	}
	

	public double getPrincipal() {
		return principal;
	}
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public double getinterestrate() {
		return annualInterestRate;
	}
	
	public void setinterestrate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getloanterm() {
		return loanTerm;
	}
	
	public void setloanterm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	

	public double calculateMonthlyPayment() {
		double monthlyInterestRate = (annualInterestRate / 12) / 100;

		int numberOfMonths = loanTerm * 12;

		return  principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
				/ (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

	}
	
	
	public double calculateTotalPayment() {
	 
	return calculateMonthlyPayment() * loanTerm * 12;
	}
	
	
	public String toString() {
		return "Principal is: " + principal + "\n"+
			   "Interest rate is: " + annualInterestRate + "%\n"+
				"Loan term: "+ loanTerm + "years";
				
	}
	
}
