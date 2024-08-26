import java.util.Scanner;

public class largestofthree{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        if(x>y && x>z ){
            System.out.println("Largest number is: "+x);
        }

        else if(y>x && y>z){
            System.out.println("Largest number is: "+y);
        }

        else{
            System.out.println("Largest number is: "+z);
        }

    }



}