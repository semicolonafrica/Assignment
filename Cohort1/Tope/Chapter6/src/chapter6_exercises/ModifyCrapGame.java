package chapter6_exercises;

import java.security.SecureRandom;
import java.util.Scanner;
//Program to modify crap game Exercise 6.33
//Program written by Oyemade Temitope
//24th of June 2019

public class ModifyCrapGame {
	
	 //Create secure random number generator for use in method rollDice

    private static final SecureRandom randomNumbers = new SecureRandom();
   //Enum type with constants that represent the game status
   private enum Status{CONTINUE, WON, LOST};

   //Constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;
   
   private static double bankBalance = 1000; 
   

   public static int rollDIce(){
       //pick random die values
       int die1 = 1+ randomNumbers.nextInt(6); //first die roll
       int die2 = 1+ randomNumbers.nextInt(6); //Second die roll

       int sum = die1 + die2;
       //display results of this roll
       System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

       return sum;
   }
   
   

   //Plays one game of craps
   public static void main(String[] args){
	   //Prompt player to enter wager
	   
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter wager(Amount you want to stake)");
	   double wager = input.nextDouble();
	   
	   while(wager > bankBalance) {
		   System.out.println("Enter a valid wager");
		   wager = input.nextDouble();
	   }
	   
	   
       int myPoint = 0; //point if no win or loss on first roll
       Status gameStatus;

       int sumOfDice = rollDIce(); //First roll of the dice 

       //Determine game status and point based on first roll

       switch(sumOfDice){
           case YO_LEVEN: //Win with 7 on first roll
           case SEVEN: //Win with 11 on first roll
           gameStatus = Status.WON;
           System.out.println(chatter());
           bankBalance = bankBalance + wager;
           System.out.println("Your balance = " + bankBalance);

           case SNAKE_EYES:// lose with 2 on first roll
           case TREY: //lose with 12 on first roll
           case BOX_CARS: //lose with 3 on first roll
           gameStatus = Status.LOST;
           bankBalance = bankBalance - wager;
           System.out.println(chatter());
           System.out.println("Your balance = " + bankBalance);
           

           default: //did  not win or lose, so remember point
           gameStatus = Status.CONTINUE; //game is not over
           myPoint = sumOfDice; //remember the point
           System.out.printf("Point is %d%n", myPoint);
           break;

       }

       while( gameStatus == Status.CONTINUE){
           //That is not won or not lost
           sumOfDice = rollDIce(); //roll dice again
           //Determine game status
           if(sumOfDice == myPoint) { // win by making point
           gameStatus = Status.WON;
           bankBalance = bankBalance + wager;
           System.out.println(chatter());
           System.out.println("Your balance = " + bankBalance);
           }

           else if (sumOfDice ==SEVEN) {//lose by rolling 7 before point
           gameStatus = Status.LOST;
           System.out.println(chatter());
           bankBalance = bankBalance - wager;
           System.out.println("Your balance = " + bankBalance);
           }
       }
           //Display won or lost message
       if(gameStatus == Status.WON)
           System.out.println("Player wins");

           else    
               System.out.println("Player loses");

   
	   
	   if(bankBalance ==0)
		   System.out.println("Sorry you busted!");
	   
	   input.close();
   }
   
   
   
   
   
   public static String chatter() {
	  int num =  randomNumbers.nextInt(3);
	  String accolade = " ";
	  String oh = "Oh, you're going for broke, huh?";
	  String aw = "Aw c'mon, take a chance!";
	  String chop = "You're up big now. Now its time to cash in your chips!";
	  
	  if(num == 0)
		  accolade = oh;
	  if(num == 1)
		  accolade = aw;
	  
	  if(num == 2 )
		  accolade = chop;
	   
	   return  accolade;
	   
   }


}
