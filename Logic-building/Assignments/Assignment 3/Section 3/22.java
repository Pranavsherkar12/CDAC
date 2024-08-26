public class Main {
    public static void main(String[] args) {
        int n = 5;
      
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
