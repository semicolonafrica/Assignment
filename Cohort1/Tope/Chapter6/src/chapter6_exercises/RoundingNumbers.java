package chapter6_exercises;

import java.util.Scanner;

//Program that round numbers to its nearest integer using Math.floor
//Exercise 6.09
public class RoundingNumbers {
	
	
	public static double roundNumber(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the floating point number you want to round up");
		double number = input.nextDouble();
		int y =(int) Math.floor(number + 0.5);
		
		System.out.println("This is your number before roundingUp operation: " + number);
		
		input.close();
		return y;
		
	}

	
	public static void main(String[] args) {

			System.out.println(roundNumber());
	}

}
