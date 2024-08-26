/*public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} */

// error: illegal start of expression ** cant be used in java to find exponantial number like 2^3
//import java.lang.Math;


public class Main { 
    public static void main(String[] args) { 
        int a = 2; 
        int b = 5; 
        double result = Math.pow(a , b); 
        System.out.println(result); 
    } 
} 