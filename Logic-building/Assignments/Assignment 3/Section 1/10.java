/*public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} */

//The program gave error "int cannot be converted to boolean" as while initialising num is integer and in while loop we gave condition as equal to 10 which is boolean type

public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num > 0) { 
            System.out.println(num); 
            num--; 
        } 
    } 
}