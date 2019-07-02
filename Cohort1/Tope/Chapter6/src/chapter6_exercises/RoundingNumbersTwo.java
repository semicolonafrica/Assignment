package chapter6_exercises;

import java.util.Scanner;

public class RoundingNumbersTwo {
//Program to round up numbers to its nearest integer, tenth, hundred and thousand using Math.floor
//Excercise 6.10
//Written by Oyemade Temitope
//20th of June 2019
	
	
	
	public static int nearestInteger(double number) {
		
		int y =(int) Math.floor(number + 0.5);
		return y;
	}
	
	public static double nearestTenth(double number){
				double y = Math.floor(number * 10 + 0.5) / 10;
		return y;
	}
	
	
	public static double nearestHundred(double number) {
		double y = Math.floor(number * 100 + 0.5) / 100;
		return y;
	}
	
	public static double nearestThousand(double number) {
		
		double y = Math.floor(number * 1000 + 0.5) / 1000;
		return y;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number you want to approximate/round up");
		double number = input.nextDouble();
		System.out.println("This is the original number " + number);
		System.out.println("Nearest Integer = " + nearestInteger(number));
		System.out.println("Nearest Tenth = " + nearestTenth(number));
		System.out.println("Nearest Hundred = " + nearestHundred(number));
		System.out.println("Nearest Thousand = " + nearestThousand(number));
		input.close();
	
	}

}
