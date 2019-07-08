package Chapter6.exercise6_33;
import java.security.SecureRandom; import java.util.Scanner;

public class CrapGameModification {
	
	 private static final SecureRandom randomNumbers = new SecureRandom();
	 static Scanner input = new Scanner(System.in);
	 private enum Status { CONTINUE, WON, LOST };
	 private static final int SNAKE_EYES = 2;
	 private static final int TREY = 3;
	 private static final int SEVEN = 7;
	 private static final int YO_LEVEN = 11;
	 private static final int BOX_CARS = 12;
	 
	
	  public static void main(String[] args)
	  {
		  int bankBalance = 1000;
		  int newBalance = 0;
		  int myPoint = 0;
		  System.out.println("Enter wager to play: " + "\n" + "Your balance is: " + bankBalance + " Dollars");
		  int wager = input.nextInt();
		  
		  if(wager<=bankBalance) {
			  rollDice();
		  }
		  else {
			  System.out.println("Wager not valid. Please Enter a " + "\n" + " a valid Wager to play");
			  wager = input.nextInt();
		  }
		  Status gameStatus; // can contain CONTINUE, WON or LOST
		  int sumOfDice = rollDice(); // first roll of the dice
		  
		  switch (sumOfDice) {
	  case SEVEN:
	  case YO_LEVEN:
	       newBalance = bankBalance + wager;  
	       gameStatus = Status.WON;
     
	 
	  break;
	  
	  case SNAKE_EYES:
	  case TREY:
	  case BOX_CARS:
	       newBalance = bankBalance - wager;  
	       gameStatus = Status.LOST;
	 
	  
	  break;
	  
	  default:
	  gameStatus = Status.CONTINUE; 
	  myPoint = sumOfDice;
	  System.out.printf("Point is %d%n", myPoint);
	  break;
	  }
		  
	 while(gameStatus == Status.CONTINUE) {
		 
		 sumOfDice = rollDice();
		 if (sumOfDice == myPoint)
			 newBalance = bankBalance + wager;
			 gameStatus = Status.WON;
		
		  if (sumOfDice == SEVEN)
			 newBalance = bankBalance - wager;
			 gameStatus = Status.LOST;
	 }
	 
	 //display won or lost message
	  if (gameStatus == Status.WON )
	  System.out.println("Player wins" + "\n" + "Your new balance = " + newBalance);
	  else
	  System.out.println("Player looses" + "\n" + "Your new balance = " + newBalance);
	 }
	 
	
	  public static int rollDice()
	 {
		  
	 
	 int die1 = 1 + randomNumbers.nextInt(6);
	  int die2 = 1 + randomNumbers.nextInt(6);
	 
	 int sum = die1 + die2;
	 
	 
	  System.out.printf("Player rolled %d + %d = %d%n",die1, die2, sum);
	 
	  return sum;
	  }
}
	

