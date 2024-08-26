/*Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. */

import java.util.Scanner;

public class discounting {
    
    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the purchase amount: ");
     float purchase = sc.nextFloat();
     float discount  = 0;

     if(purchase >= 1000){
         discount = purchase * 0.2f;
     }

     else if(500 < purchase && purchase < 999){
         discount = purchase *0.1f;
     }

     else{
         discount = purchase * 0.05f;
     }

     System.out.println("Discount after purchasing the item is: "+ discount);
    }
    

}
