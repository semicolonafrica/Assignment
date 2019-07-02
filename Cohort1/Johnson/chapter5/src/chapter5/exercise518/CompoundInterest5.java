package chapter5.exercise518;

/* Author: ADEBAYO Johnson
Date: 12/06/2019 
Location of exercise:  Exercise 5, qu 5.18
Purpose: Modified Compound Interest
*/

public class CompoundInterest5{
   public static void main(String[] args){
       int amount = 0;
       int principal = 1000;// principal in dollar $1000
       int rate = 5;
       int year;
       int principal1 = 100000; // principal in pence $1000 = 100000 cent
   
       for (year =1; year <= 10; year++){
           int factor = (int)Math.pow(100+rate,1);   
           amount = principal * factor;
           int interest = amount - principal1; // to calculate compound interest

           principal =amount/100; // changing the new principal calculated amount

           int amount1 = amount / 100; // to reduce amount by 10^2
           int interest1 = interest / 100; // to reduce compound interest by 10^2

           System.out.println("Amount in year  " + year + ":$" + amount1);
           System.out.println("Compound interest in year  " + year + ":$" + interest1 + "\n");
       }
       //System.out.println("Total amount and compound interest after: " + (year-1) + " years is " + compoundInt);
   }
}
