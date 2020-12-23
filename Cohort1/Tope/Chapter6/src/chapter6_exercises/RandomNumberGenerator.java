package chapter6_exercises;

import java.security.SecureRandom;

public class RandomNumberGenerator {
//Program that generates number in a given range
//Program written by Oyemade Temitope
//Excercise 6.12
//20th of June 2019
	
	public static  void generateRandomNumber() {
		
		SecureRandom randomNumber = new SecureRandom();
		//1<=n<=2
		int num1 = 1 + randomNumber.nextInt(2);
		System.out.println(num1);
		
		//1<=n<=100
		int num2 = 1 + randomNumber.nextInt(100);
		System.out.println(num2);
		
		//0<=n<=9
		int num3 = randomNumber.nextInt(10);
		System.out.println(num3);
		
		//1000<=n<=1112
		int num4 = 1000 + randomNumber.nextInt(113);
		System.out.println(num4);
		
		//-1<=n<=1
		int num5 = randomNumber.nextInt(3) - 1;
		System.out.println(num5);
		
		//-3<=n<=11
		int num6 = randomNumber.nextInt(15) - 3;
		System.out.println(num6);
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
			generateRandomNumber();
	}

}
