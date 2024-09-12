package orr.prgm2;
import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	
	private CompoundInterestCalculator util = new CompoundInterestCalculator(0,0,0, 0);
	
	
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principal ");
		util.setPrincipal(sc.nextDouble());

		System.out.println("Enter the annualInterestRate ");
		util.setInterestRate(sc.nextDouble());

		System.out.println("Enter the numberOfCompounds ");
		util.setNoOfcompounds(sc.nextDouble());

		System.out.println("Enter the years ");
		util.setYears(sc.nextInt());
		
		
	}
	
	public void printRecord() {
		System.out.println(util.toString());

		System.out.printf("Future value is: %.2f\n", util.calculateFutureValue());
		System.out.printf("totalInterest earn is: %.2f\n", util.totalInterestEarn());

	}

	
	public void menulist() {
		System.out.println("0,Exit... ");
		System.out.println("1,Enter the details ");
		System.out.println("2,Show details ");
		
	
	}
}
