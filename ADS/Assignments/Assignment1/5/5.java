package org.prgm5;

import java.util.Scanner;

public class Program5 {

	public static int GCD(int a, int b) {

		if (b == 0)
			return a;

		else
			return GCD(b, a % b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();

		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();

		int res = GCD(a, b);
		System.out.println("GCD of " + a + " and " + b + " is " + res);

	}

}
