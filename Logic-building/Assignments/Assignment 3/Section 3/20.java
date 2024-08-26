public class Main {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i <= n; i++) {
         
            for (int j = n; j > n - i; j--) {
                System.out.print(j); 
                if (j > n - i + 1) {
                    System.out.print("*"); 
                }
            }
            System.out.println();
        }
    }
}
