import java.util.Scanner;

public class ArrayInClass {
    private int[] arr;

    public ArrayInClass(int size) {
        arr = new int[size];
    }

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public void printRecord() {
        System.out.println("Array values:");
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        ArrayInClass arrayObj = new ArrayInClass(5);
        arrayObj.acceptRecord();
        arrayObj.printRecord();
    }
}
