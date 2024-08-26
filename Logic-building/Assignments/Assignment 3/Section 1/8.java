/* 
public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
    } 
}
*/

//In the code we have initialised the value with 1 and then printing the 1 we have decremented the value which became 0, and condition is pass in while loop as "num > 0" so it came out of loop as value was 0 already

public class OffByOneDoWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
    }
}