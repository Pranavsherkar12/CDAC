import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array (N):");
        int N = scanner.nextInt();
        
        int[] arr = new int[N-1];
        System.out.println("Enter " + (N-1) + " integers from 1 to " + N + ":");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int totalSum = N * (N + 1) / 2;
        int arraySum = 0;
        for (int value : arr) {
            arraySum += value;
        }
        
        System.out.println("Missing number is: " + (totalSum - arraySum));
    }
}
