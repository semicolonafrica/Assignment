package chapter6_exercises;
//Program to return a student range
//Exercise 6.28
//Written by Oyemade Temitope
//22nd of June 2019

import java.util.Scanner;
public class Student {
	
	public static int qualityPoints(double average) {
		int range = 0;
		
		if(average <= 100 && average >= 90)
			range = 4;
		
		if(average <=89  && average >= 80)
			range = 3;
		
		if(average <= 79 && average >= 70)
			range = 2;
		
		if(average <= 69 && average >= 60)
			range = 1;
		
		if(average < 60)
			range = 0;
		
		return range;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value");
		double average = input.nextDouble();
		
		System.out.println(qualityPoints(average));
		
		input.close();
	}

}
