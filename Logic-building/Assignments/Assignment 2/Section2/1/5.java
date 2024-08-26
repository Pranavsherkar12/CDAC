/*
Question 5: Student Pass/Fail Status with Nested Switch
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 
*/

import java.util.*;

public class student {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Subject1 marks: ");
        int subject1  = sc.nextInt();;

        System.out.println("Enter the Subject1 marks: ");
        int subject2  = sc.nextInt();

        System.out.println("Enter the Subject1 marks: ");
        int subject3  = sc.nextInt();

        int failcount  = 0;

        switch(subject1 > 40 ? 1 : 0){

            case 0:
            failcount++;

            switch(subject2 > 40 ? 1 : 0){

                case 0:
                failcount++;

                switch(subject3 > 40 ? 1 : 0){
                    
                    case 0:
                    failcount++;
                    break;

                }

            }


        }


        switch(failcount){
            case 0:
            System.out.println("Student is pass in all subjects");
            break;

            case 1:
            System.out.println("Student is failed in " + failcount + " subject");
            break;

            default:
            System.out.println("Student is failed in " + failcount + " subjects");
            break;

        }

    
       

    }


}
