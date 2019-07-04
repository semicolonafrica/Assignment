package chapter6.Exercise623;

import java.util.Scanner;

//Author Olayinka Oloko
//21st June 2019

public class FindTheMinimum {
	
	public static float minimum3(float numb1, float numb2, float numb3) {
		
		float smallest;
		
		smallest = Math.min(numb1, Math.min(numb2, numb3));
		
		return smallest;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input three floating point digits that you will like to compare");
		float numb1 = input.nextFloat();
		float numb2 = input.nextFloat();
		float numb3 = input.nextFloat();
		
		System.out.printf("Smallest = %.2f", minimum3(numb1, numb2, numb3));
		input.close();
	}

}



