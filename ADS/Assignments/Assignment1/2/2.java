package org.prgm2;

import java.util.Scanner;

public class Program2 {

	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		if (isPrime(n))
			System.out.println("It is prime number");

		else
			System.out.println("Not prime number");
	}
}
//Time complexity:O(n^1/2)
//Space complexity:O(1)
