
import java.util.*;

public class Program5 {

	public static void reversearr(int[] arr) {

		int n = arr.length;

		int[] temp = new int[n];

		for (int i = 0; i < n; i++)
			temp[i] = arr[n - i - 1];

//		for (int i = 0; i < n; i++)
	//		arr[i] = temp[i];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int num = sc.nextInt();

		int[] arr = new int[num];

		System.out.println("Enter elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		reversearr(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
