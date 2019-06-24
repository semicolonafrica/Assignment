package exercise6_30;

import java.security.SecureRandom;

import java.util.Scanner;

public class GuessTheNumber {

	public static void getNumber(int number) {
		// TODO Auto-generated method stub
	SecureRandom randomNumbers = new SecureRandom();
		
	int value = 1 + randomNumbers.nextInt(1000);
		System.out.println(value);
	
		 if(number > value) {
			 System.out.print("Too high, try again");
			 }
		 else if(number < value) {
			 System.out.print("Too low, try again");
		 }
		 else if(number == value) {
			System.out.print("Congratulations, you guessed the number!"); 
		
		 }
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int value = 0;
		
		System.out.println("Guess the number:");
		 value = in.nextInt();
		
		getNumber(value);
	}
	

}
