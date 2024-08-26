/*public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
}*/

//we can use "break" statement to make it work

public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
				//break;
            case 2: 
                System.out.println("Value is 2"); 
				break;
            case 3: 
                System.out.println("Value is 3"); 
				//break;
            default: 
                System.out.println("Default case"); 
				//break;
        } 
    } 
}