package chapter5.exercise17;

/* Author: ADEBAYO Johnson
Date: 12/06/2019 
Location of exercise:  Exercise 5, qu 5.18
Purpose: Program for calculating sales (Version1)
*/

import java.util.Scanner;
public class Sales{
   
   public static void main(String[] args){
       double price;
       double amount;
       int counter = 1;
       double total = 0;
       Scanner input = new Scanner (System.in);
       int product =0;
       while(product != -1){
           System.out.println("Enter product: ");
           product = input.nextInt();
           System.out.println("Enter quantity: ");
           int quantity = input.nextInt();
           switch(product){
               case 1:
               amount = 2.98 *quantity;
               break;

               case 2:
               amount = 4.50 *quantity;
               break;


               case 3:
               amount = 9.98 *quantity;
               break;

               case 4:
               amount = 4.49 *quantity;
               break;

               case 5:
               amount = 6.87 *quantity;
               break;

               default:
               amount = 0 * quantity;
               break;
           }
           System.out.println("Amount for this product: $" + amount);
           total = total + amount;
           counter++;
       }
       System.out.println("Total retail value of all products sold: $" + total);      
   }
}