package exercises;
//Craps class simulates the dice game craps.

import java.security.SecureRandom;

public class GameOfCraps {
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
int myPoint = 0; // point if no win or loss on first roll
Status gameStatus; // can contain CONTINUE, WON or LOST
int[] numberOfWins = new int[22];
int[] numberOfLoss = new int[22];

for(int x = 1; x<= 1_000_000; x++) {
int sumOfDice = rollDice(); // first roll of the dice

// determine game status and point based on first roll
switch (sumOfDice) {
case SEVEN: // win with 7 on first roll
case YO_LEVEN: // win with 11 on first roll
gameStatus = Status.WON;
break;
case SNAKE_EYES: // lose with 2 on first roll
case TREY: // lose with 3 on first roll
case BOX_CARS: // lose with 12 on first roll
gameStatus = Status.LOST;
break;
default: // did not win or lose, so remember point
gameStatus = Status.CONTINUE; // game is not over
myPoint = sumOfDice; // remember the point
break;
 }

// while game is not complete
while (gameStatus == Status.CONTINUE) { // not WON or LOST
sumOfDice = rollDice(); // roll dice again

// determine game status
if (sumOfDice == myPoint) { // win by making point
gameStatus = Status.WON;
 }
else {
if (sumOfDice == SEVEN) { // lose by rolling 7 before point
gameStatus = Status.LOST;
}
 }
 }

// display won or lost message
if (gameStatus == Status.WON) {
	
	if(x <=20)
	++numberOfWins[x];
	
	if(x > 20)
		++numberOfWins[21];
 }
 if(gameStatus == Status.LOST) {
	 
	 if(x <=20)
			++numberOfLoss[x];
			
			if(x > 20)
				++numberOfLoss[21];
	 
 }

}
	
System.out.printf("%s\t%s\t%s%n", "ROLLS", "NO OF WINS", "NO OF LOSS");
int w =0;
int v = 0;
int q = 0;

	for(int u = 1; u< numberOfWins.length; u++) {
		
		v = numberOfWins[w] + numberOfWins[u];
		numberOfWins[u] = v;
		
		
		q = numberOfLoss[w] + numberOfLoss[u];
		numberOfLoss[u] = q;
		
		w++;
	}
	
	for(int c = 1; c< numberOfWins.length; c++) {
		
		System.out.printf("%d\t%5d%15d%n", c, numberOfWins[c], numberOfLoss[c]);
	}
 }



//roll dice, calculate sum and display results
public static int rollDice() {
// pick random die values
int die1 = 1 + randomNumbers.nextInt(6); // first die roll
int die2 = 1 + randomNumbers.nextInt(6); // second die roll

int sum = die1 + die2; // sum of die values

// display results of this roll

return sum;
 }
 }