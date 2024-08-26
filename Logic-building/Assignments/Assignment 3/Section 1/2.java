/* 
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}
*/

// in While loop we are giving condition count = 0 and we have initialised the
// count with 5 as integer so code is giving error that "int cannot be converted
// to boolean " as Count in while loop block is 0 which means an boolean value

public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count > 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
}