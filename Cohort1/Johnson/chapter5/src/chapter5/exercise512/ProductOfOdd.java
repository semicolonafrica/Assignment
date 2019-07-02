package chapter5.exercise512;

/* Author: ADEBAYO Johnson
Date: 10/06/2019 
Location of exercise: Exercise 5, exercise Qu (7) 5.13
Purpose: Product of Odd numbers from 1 - 15
*/

//import java.util.Scanner;
public class ProductOfOdd{
   public static void main(String[] args){
       int product = 1;
      
      for (int counter = 1; counter<= 15; counter += 2){
          product *= counter;
      }
      System.out.println("The product of odd numbers from 1-15 is: " + product);
   }
}
