package chapter5.exercise511;

/* Author: ADEBAYO Johnson
Date: 10/06/2019 
Location of exercise: Exercise 5, exercise Qu (7) 5.13
Purpose: To find Smallest out of several input
*/

import java.util.Scanner;
public class SmallestNumber{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.println("Enter the amount of numbers to compare: "); //Enter the length of numbers to enter
       int num1 = input.nextInt();

       System.out.println("Enter number: "); // Input of first number to be compare with others
       int smallest = input.nextInt(); // store the first number entered as the smallest and compare with the others

       int counter = 1;
       
       while (counter <= num1 -1){ // 
           System.out.println("Enter number: ");
           int num2 = input.nextInt();

           if (num2 < smallest){
               smallest = num2;
           }
           else {
               smallest = smallest;
           }
           counter++;
       } 
       System.out.println("The smallest is: " + smallest);    
   }
}