
public class Program1 {

	public static void stars(int n) {
//Since row = no. enter in the input
		for (int i = 0; i <= n; i++) {
//Since column = no of rows printing 
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();

		stars(num);
		

	}

}