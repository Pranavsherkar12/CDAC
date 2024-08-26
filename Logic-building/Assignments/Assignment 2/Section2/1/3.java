/*
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message. 
*/



import java.util.*;

public class calci{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the first number: ");
		double x = sc.nextDouble();
	
		
		System.out.println("Enter the second number: ");
		double y = sc.nextDouble();
		
		
		System.out.println("Enter the operation to be perform: ");
		char operator = sc.next().charAt(0);
		
		
		double result = 0;
		boolean validoperation = true;
	
		switch (operator){
			case '+':
			result = (x+y);
			break;
			
			case '-':
			result =(x-y);
			break;
			
			case '*':
			result =(x*y);
			break;
			
			case '/':
			if(y!=0){
				result =(x/y);
				
			}
			else{
				System.out.println("Cannot divide by zero");
				validoperation = false;	
			}
	
			break;
			
			
		}
		if(validoperation){
			System.out.println("Result is:"+result);
		}
	
	}

}