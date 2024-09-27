package org.prgm4;

import java.util.Scanner;

public class Program4 {

	public static int fib(int n) {

		if (n <= 1)
			return n;

		else
			return fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + " ");
		}

	}

}

//T.C = O(2^n)
//S.C = O(n)
