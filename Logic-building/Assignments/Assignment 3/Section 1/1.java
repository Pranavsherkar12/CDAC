/* public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
}*/

//Explanation: in for loop we define block with start from 0 less than 10 and decremented the value of i so went in infinite loop
//Solution: we should define the condition in for loop as "i++" instead of "i--"


public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
}