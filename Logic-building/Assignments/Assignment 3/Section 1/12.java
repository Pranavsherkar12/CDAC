/*
  public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
}
 */
//Error: 'x' is not accessible here as x is declare inside for loop so it is accessible only in for loop
//To make it accessible declare it in main method


public class LoopVariableScope { 
    public static void main(String[] args) { 
        int x = 0;
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); 
    } 
}