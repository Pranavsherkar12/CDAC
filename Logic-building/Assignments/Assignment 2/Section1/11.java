public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
} 


//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
We basically can't hav array of length 3 and trying to print 4rth index which does not exist in array