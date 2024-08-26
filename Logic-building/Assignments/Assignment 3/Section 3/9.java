public class Main { 
    public static void main(String[] args) { 
        int number = 4825;
        int maxDigit = 0;
      
        while (number > 0) {
            int digit = number % 10; 
            if (digit > maxDigit) { 
                maxDigit = digit; 
            }
            number = number / 10;
        }

        System.out.println("The largest digit is: " + maxDigit);
    } 
}
