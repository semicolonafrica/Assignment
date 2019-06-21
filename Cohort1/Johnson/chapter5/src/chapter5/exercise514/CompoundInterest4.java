package chapter5.exercise514;

/* Author: ADEBAYO Johnson
Date: 11/06/2019 
Location of exercise:  Exercise 5 Qu 5.14
Purpose: For Compound interest on saving account
*/

//import java.util.Scanner;
public class CompoundInterest4{

   public void calculateAmount(int principal, int year, int rate){
       double amount = 0.00;
       for (int counter = 5; counter <= rate; counter++){
           
           double rate1 = (double)counter/100; // casting counter i.e. converting it from int to double
           double factor1 = (1 + rate1);// (1+r)
           double factor2 = Math.pow( factor1, year); // (1+r)^n
           // amount = principal * Math.pow(1.0 + rate, year);
           amount = principal * factor2; // p (1+r)^n 

           System.out.println("Amount after 10 years for " + counter + " % rate is: " + amount);
       }
   }
   public static void main(String[] args){
       CompoundInterest4 customer1 = new CompoundInterest4();
       customer1.calculateAmount(1000, 10, 15);
   }
}
