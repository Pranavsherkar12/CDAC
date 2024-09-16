import java.util.Scanner;

public class ArrayWithGetSet {
    private int[] arr;

    public ArrayWithGetSet(int size) {
        arr = new int[size];
    }

    public void setArrayValue(int index, int value) {
        arr[index] = value;
    }

    public int getArrayValue(int index) {
        return arr[index];
    }

    public static void main(String[] args) {
        ArrayWithGetSet arrayObj = new ArrayWithGetSet(5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            int value = scanner.nextInt();
            arrayObj.setArrayValue(i, value);
        }

        System.out.println("Array values:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayObj.getArrayValue(i));
        }
    }
}
