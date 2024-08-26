/*public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
}*/


//error: incompatible types: String cannot be converted to double

public class Main { 
    public static void main(String[] args) { 
		String str = "Hello";
        double num = Double.parseDouble(str); 
        System.out.println(num); 
    } 
}