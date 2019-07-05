package chapter7.exercises;

import java.security.SecureRandom;

//Exercise 7.16
//Program written by Oyemade Temitope
//4th of July 2019

public class GameOfCraps {

    private static final SecureRandom randomNumbers = new SecureRandom();
   
   private enum Status{CONTINUE, WON, LOST};

  
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;
   
    static int[] holdWin = new int[22];
    static int[] holdLoss = new int[22];
    static int rollDiceCounter =0;
   

   public static int rollDIce(){
      
       int die1 = 1+ randomNumbers.nextInt(6); 
       int die2 = 1+ randomNumbers.nextInt(6);

       int sum = die1 + die2;
      

       return sum;
   }

   
   public static void main(String[] args){
       int myPoint = 0; 
       Status gameStatus;
       
       for(int i = 1; i<= 1_000_000; i++) {
    	   
       int sumOfDice = rollDIce(); 
       rollDiceCounter++;
       

       switch(sumOfDice){
           case YO_LEVEN:
           case SEVEN: 
           gameStatus = Status.WON;

           case SNAKE_EYES:
           case TREY: 
           case BOX_CARS: 
           gameStatus = Status.LOST;

           default:
           gameStatus = Status.CONTINUE;
           myPoint = sumOfDice; 
           break;

       }

       while( gameStatus == Status.CONTINUE){
      
           sumOfDice = rollDIce();
           rollDiceCounter++;
        
           if(sumOfDice == myPoint)
           gameStatus = Status.WON;

           else if (sumOfDice ==SEVEN)
           gameStatus = Status.LOST;
       }
       
       if(gameStatus == Status.WON) { 
    	   
    	   if(i <=20)
    		   ++holdWin[i];
    	   
    	   if(i >20)
    		   ++holdWin[21];
       }
       
       if(gameStatus == Status.LOST) {
    	   
    	   if(i <= 20)
    		   ++holdLoss[i];
    	   
    	   if(i>20)
    		   ++holdLoss[21];
       }
       
   }
       
       //manipulate (sum) Array of win and Loss
       int u =0;
       int win= 0;
       int loss = 0;
       for(int s =1; s< holdWin.length; s++) {
    	   
    	   win = holdWin[s] + holdWin[u];
    	   holdWin[s] = win;
    	   
    	   loss = holdLoss[s] + holdLoss[u];
    	   holdLoss[s] = loss;
    	   
    	   u++;
       }
       
       
       System.out.printf("%s\t%s\t%s%n", "ROLLS", "NO of WINS", "NO of LOSSES");
       
       
       for(int v = 1; v< holdWin.length; v++) {
    	   
    	   System.out.printf("%3d%s\t%5d\t\t%4d%n",
    			   (v <= 20? v :20),(v ==21?'+':""),holdWin[v], holdLoss[v]);
       }
       
       int chanceOfWinning = holdWin[21] / 10000;
      // int chanceofLossing = holdLoss[21] / 10000;
       
       System.out.printf("%nChances of winning game of Craps = %d%s%n", chanceOfWinning, "%");
       System.out.printf("Average Length of Game of Craps = %d%n", (rollDiceCounter/holdWin[21]));
       System.out.printf("Do chances of Winning improve with the Length of the game?: %b", false);
   }


}
