//Write a program to find and print the first 5 prime numbers. 

import java.util.*;

public class prime{

	public static void main(String[] args){
		
		//prime = 2,3,5,7,11
		
		for(int i = 1;i<=11;i++){
			
			if(i%2 == 0 ){ 					
			
			continue;
			
			else if(i%9==0){
			continue;
			}
			else{
			System.out.println(i+" ");	
				
			}
		}
		
		
		
	}

}
