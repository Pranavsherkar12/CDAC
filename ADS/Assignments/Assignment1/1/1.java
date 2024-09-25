
package org.program1;

import java.util.Scanner;

class Program1 {
	public static boolean isArmstrong(int n) {

		int orignalnum = n;
		int result = 0;
		int NoOfDigits = String.valueOf(n).length();

		while (n != 0) {
			int r = n % 10;
			result = result + (int) Math.pow(r, NoOfDigits);
			n = n / 10;
		}

		return result == orignalnum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int n = sc.nextInt();

		if (isArmstrong(n))
			System.out.println(n + " is Armstrong number");

		else
			System.out.println(n + " is not a Armstrong number");
	}
}


//Time Complexity: O(nlogn)
//Space Complexity: O(n)
