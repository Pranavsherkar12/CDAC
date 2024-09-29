import java.util.Scanner;

public class Program3 {

	public static void main1(String[] args) {

		// using replaceAll method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = sc.nextLine();

		String n1 = str1.replaceAll("\\s", "");

		System.out.println(n1);
	}

	public static void main2(String[] args) {

		// using replace method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = sc.nextLine();

		String n1 = str1.replace(" ", "");

		System.out.println(n1);
	}

	public static void main(String[] args) {

		// using Char class inbuilt function
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = sc.nextLine();

		String op = "";

		for (int i = 0; i < str1.length(); i++) {

			char c = str1.charAt(i);

			if (!Character.isWhitespace(c))
				op = op + c;

		}

		System.out.println(op);
	}

}
