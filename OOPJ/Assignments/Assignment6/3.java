import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
