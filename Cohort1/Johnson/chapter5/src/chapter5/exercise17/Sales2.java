package chapter5.exercise17;

/* Author: ADEBAYO Johnson
Date: 12/06/2019 
Location of exercise:  Exercise 5, qu 5.17
Purpose: Program for calculating sales (Version2 )
*/

import java.util.Scanner;
public class Sales2{
   
   //public static void main(String[] args){
       //Sales2 agent1 = new Sales2();
       //agent1.sales();
  // }
   public void sales(){
       double price;
       double amount;
       int counter = 1;
       double total = 0;
       int quantity1 = 0;
       int quantity2 = 0;
       int quantity3 = 0;
       int quantity4 = 0;
       int quantity5 = 0;
       int quantity6 =0;
       double sales1 = 0;
       double sales2 = 0;
       double sales3 = 0;
       double sales4 = 0;
       double sales5 = 0;

       Scanner input = new Scanner (System.in);
       int product =0;
       while(product != -1){
           System.out.println("Enter product: ");
           product = input.nextInt();
           System.out.println("Enter quantity: ");
           int quantity = input.nextInt();
           switch(product){
               case 1:
               quantity1 = quantity1 + quantity;
               break;

               case 2:
               quantity2 = quantity2 + quantity;
               break;

               case 3:
               quantity3 = quantity3 + quantity;
               break;

               case 4:
               quantity4 = quantity4 + quantity;
               break;

               case 5:
               quantity5 = quantity5 + quantity;
               break;

               default:
               quantity6 = 0;
               break;
           }
           counter++;
       }
       sales1 = 2.98*quantity1;
       sales2 = 4.50*quantity2;
       sales3 = 9.98*quantity3;
       sales4 = 4.49*quantity4;
       sales5 = 6.87*quantity5;
       total = sales1 + sales2 + sales3 + sales4 + sales5;

       System.out.println("Total number of product 1 sold: " + quantity1 + " and amount $" + sales1);
       System.out.println("Total number of product 2 sold: " + quantity2 + " and amount $" + sales2);
       System.out.println("Total number of product 3 sold: " + quantity3 + " and amount $" + sales3);
       System.out.println("Total number of product 4 sold: " + quantity4 + " and amount $" + sales4);
       System.out.println("Total number of product 5 sold: " + quantity5 + " and amount $" + sales5);
       System.out.println("Total retail value of all products sold: $" + total);      
   }
}