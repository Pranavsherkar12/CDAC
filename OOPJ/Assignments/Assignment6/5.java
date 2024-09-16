import java.util.HashSet;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 integers for the first array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.println("Enter 5 integers for the second array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        HashSet<Integer> set1 = new HashSet<>();
        for (int value : arr1) {
            set1.add(value);
        }
        
        System.out.println("Intersection of arrays:");
        for (int value : arr2) {
            if (set1.contains(value)) {
                System.out.println(value);
            }
        }
    }
}
