package org.prgm9;

import java.util.Scanner;

public class Program9 {
	public static boolean isPaindrome(int num) {

		if (num < 0) {
			return false;
		}

		int orignal = num;
		int reversed = 0;

		while (num != 0) {

			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}

		return reversed == orignal;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();

		System.out.println(isPaindrome(n));

	}

}

//Time complexity:O(n)
//Space complexity:O(1)
