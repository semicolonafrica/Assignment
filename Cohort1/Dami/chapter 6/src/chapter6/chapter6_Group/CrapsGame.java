
package chapter6.chapter6_Group;

//Craps class simulates the dice game craps.
import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {
//create secure random number generator for use in method rollDice
private static final SecureRandom randomNumbers = new SecureRandom();

//enum type with constants that represent the game status
private enum Status {CONTINUE, WON, LOST};

//constants that represent common rolls of the dice
private static final int SNAKE_EYES = 2;
private static final int TREY = 3;
private static final int SEVEN = 7;
private static final int YO_LEVEN = 11;
private static final int BOX_CARS = 12;

// plays one game of craps
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Wager");
	int wager = input.nextInt();
	int bankBalance = 1000;
	
	for( ; wager > bankBalance; ) {
		System.out.println("Your wager CANNOt be greater than BankBalance.\n"+"Re-enter wager");
		wager = input.nextInt();
	}
	
	
int myPoint = 0; // point if no win or loss on first roll
Status gameStatus; // can contain CONTINUE, WON or LOST

int sumOfDice = rollDice(); // first roll of the dice

// determine game status and point based on first roll
switch (sumOfDice) {
case SEVEN: // win with 7 on first roll
case YO_LEVEN: // win with 11 on first roll
gameStatus = Status.WON;
//	if (gameStatus == Status.WON) {
		bankBalance += wager;
		System.out.println("Boss like you! Your new BankBalance is: "+ bankBalance);
//	}
break;
case SNAKE_EYES: // lose with 2 on first roll
case TREY: // lose with 3 on first roll
case BOX_CARS: // lose with 12 on first roll
gameStatus = Status.LOST;
	bankBalance -= wager;
	System.out.println("You are goint to be broke niggar! You BankBalance is looking red!! See --> "+ bankBalance);
break;
default: // did not win or lose, so remember point
gameStatus = Status.CONTINUE; // game is not over
myPoint = sumOfDice; // remember the point
System.out.printf("Your point is %d%n", myPoint);
break;
 }

// while game is not complete
while (gameStatus == Status.CONTINUE) { // not WON or LOST
	sumOfDice = print();
	sumOfDice = rollDice(); // roll dice again
	
// determine game status
if (sumOfDice == myPoint) { // win by making point
gameStatus = Status.WON;
	bankBalance += wager;
	System.out.println("Narrow Escape, now you are richer than you came. See your BankBalance: "+ bankBalance);
 }
else {
if (sumOfDice == SEVEN) { // lose by rolling 7 before point
gameStatus = Status.LOST;
	bankBalance -= wager;
	if(bankBalance == 0) {
		System.out.println("Sorry. You busted! Your BankBalance is: "+ bankBalance);
	}
	else {
	System.out.println("Loser like you! You are going to be broke soon, see your BankBalance: "+ bankBalance);
	}
	}
 }
 }

// display won or lost message
//if (gameStatus == Status.WON) {
//System.out.println("Pyrric victory, at last you win! See your money --> "+ bankBalance);
// }
// else {
//System.out.println("Loser going broke...See how broke you are now "+ bankBalance);
// }
 }

//roll dice, calculate sum and display results
public static int rollDice() {
// pick random die values
int die1 = 1 + randomNumbers.nextInt(6); // first die roll
int die2 = 1 + randomNumbers.nextInt(6); // second die roll

int sum = die1 + die2; // sum of die values

// display results of this roll
System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

return sum;
}

//Method to generate and random prints
public static int print() {
	SecureRandom rando = new SecureRandom();
	int generate = 1 + rando.nextInt(5);
	switch(generate) {
		case 1:
			System.out.println("Oh, you’re going for broke, huh?");
			break;
		case 2:
			System.out.println("Aw c’mon, take a chance!");
			break;
		case 3:
			System.out.println("You’re up big. Now’s the time to cash in your chips!");
			break;
		case 4:
			System.out.println("Pity your sorry ass!");
			break;
		case 5:
			System.out.println("Try harder this time, c'mon!");
			break;
	}
	return generate;
}

}