import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);
        int[] result = Arrays.stream(arr).distinct().toArray();
        
        System.out.println("Array after removing duplicates:");
        for (int value : result) {
            System.out.println(value);
        }
    }
}
