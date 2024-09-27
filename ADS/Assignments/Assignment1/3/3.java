package org.prgm3;

import java.util.Scanner;

public class Program3 {
	public static int fact(int n) {
		if(n<=1) 
			return 1;
		else
			return n*fact(n-1);		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		int result = fact(n);
		System.out.println("Factorial of "+ n + " is "+ result);
	}

}
//Time complex: O(n)
//Space complex:O(n)
//Another way
//	public static long fact(long n) {
//
//		if (n == 0 || n == 1) {
//			return 1;
//		}
//
//		long result = 1;
//
//		for (int i = 2; i <= n; i++) {
//			result = result * i;
//		}
//
//		return result;
//
//	}
