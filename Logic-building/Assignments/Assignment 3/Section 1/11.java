/*public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i += 2;  
        } 
    } 
} 
 */

//Output of program is 0,2,4
//The loop should be incremented with i++;


public class IncorrectLoopUpdate { 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i++; 
        } 
    } 
} 