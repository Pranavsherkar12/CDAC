/*4. Reverse a String
Problem: Write a Java program to reverse a given string.*/

import java.util.*;
import java.util.Iterator;

public class Program4 {
	// Using for loop
	public static void main1(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		String rev = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			rev = ch + rev;
		}

		System.out.println(rev);
	}

	// Using reverse() method of StringBuilder class
	public static void main2(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		StringBuilder str1 = new StringBuilder();

		str1.append(str);

		str1.reverse();

		System.out.println(str1);

	}

	// Using toCharArray() method of String class
	public static void main3(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);

		}
	}

	/*
	 * Using ArrayList Object
	 * 1.This program reverses a string by first converting it into a character array,
	 * then adding each character to a List.
	 * 2.The Collections.reverse() method is used to reverse the list, and a ListIterator
	 * is used to iterate through the reversed list, printing each character.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		List<Character> li = new ArrayList<>();

		for (char c : ch) {
			li.add(c);
		}

		Collections.reverse(li);
		ListIterator<Character> lit = li.listIterator();

		while (lit.hasNext()) {
			System.out.print(lit.next());
		}
	}

}
