package chapter7Exercises;

import java.util.Random;

public class DiceRolling {
	
//	(Dice Rolling) Write an application to simulate the rolling of two
//	dice. The application should use an object of class Random once to roll
//	the first die and again to roll the second die. The sum of the two values
//	should then be calculated. Each die can show an integer value from 1 to 6,
//	so the sum of the values will vary from 2 to 12, with 7 being the most
//	frequent sum, and 2 and 12 the least frequent. Figure 7.28 shows the 36
//	possible combinations of the two dice. Your application should roll the
//	dice 36,000,000 times. Use a one-dimensional array to tally the number of
//	times each possible sum appears. Display the results in tabular format.
	
	public static void getSum() {
		
		Random randomNumbers = new Random();
		int sum;
		
		int []frequency = new int [13];
		
		for (int counter=0; counter <36_000_000; counter++) {
			
		int firstDice = 1 + randomNumbers.nextInt(6);
		int secondDice = 1 + randomNumbers.nextInt(6);
		
		sum = firstDice + secondDice;
		
		++frequency[sum];
		}
		
		System.out.printf("%s%12s%n", "Number","Frequency");
		for (int counter2=2; counter2 <frequency.length; counter2++) {
			System.out.printf("%4d%12d%n",counter2, frequency[counter2]);
		}
	}

	public static void main(String[] args) {
		getSum();
			
		
	}

}
