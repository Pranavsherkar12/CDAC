import java.util.Scanner;
public class SumofDigitsOfNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0){
			int remainder = num % 10;
			num = num /10;
			sum += remainder;
		}
		System.out.println("sum of digits of a num is: "+sum);
	}
}