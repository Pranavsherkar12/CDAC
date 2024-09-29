public class Program2 {

	public static int dupliremove(int[] arr) {

		if (arr.length == 0)
			return 0;
    
		int unique = 1;
		/*This loop ensures that if
		1.1st element is unique always so started with 2nd element
		2.If 2nd element is unique than 1st(1st unique element) then it will go in loop else come out of loop
		3.count will increment 0if it is unique */
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[unique - 1]) {
				arr[unique] = arr[i];
				unique++;
			}

		}
		return unique;
	}

	public static int[] inputfromuser() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter elements: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;

	}

	public static void main(String[] args) {

		int[] arr = inputfromuser();

		int length1 = dupliremove(arr);

		System.out.println("unique length is:" + length1);

	}

}
