/* 
public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0); 
 
    } 
} 
*/

//System went in infinite loop as in While block as num>0 condition given which will be correct always 
//So, the loop will run infinitely until the program is manually stopped

public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 0); 
 
 
    } 
}