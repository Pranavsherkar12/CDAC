public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int result = ++a + b--;

        System.out.println("Value of a after pre-increment: " + a);  
        System.out.println("Value of b after post-decrement: " + b); 
        System.out.println("Result of the expression (++a + b--): " + result); 
    }
}
