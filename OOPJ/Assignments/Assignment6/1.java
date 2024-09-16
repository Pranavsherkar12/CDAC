
import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        

        System.out.println("Default values of the array:");
        for (int value : arr) {
            System.out.println(value);
        }
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        

        System.out.println("Updated values of the array:");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
