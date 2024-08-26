/*public class Main { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} */


//displayMessage method place in main method which is not allowed in JAVA

//Instead

public class Main { 
	public static void displayMessage() { 
            System.out.println("Message"); 
        } 


    public static void main(String[] args) { 
        displayMessage();
    } 
} 