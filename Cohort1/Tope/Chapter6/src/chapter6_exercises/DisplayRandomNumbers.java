package chapter6_exercises;

import java.security.SecureRandom;

//Exercise 6.13 Display random numbers from a given range
//Written by Oyemade Temitope
//20th of June 2019
public class DisplayRandomNumbers {
	
	public static void displayNumber() {
		
		//Display from the following range of numbers 2,4,6,8,10
		
		SecureRandom random = new SecureRandom();
		int even = 1 +random.nextInt(10);
		if(even %2 == 1)
			even = 1 + even;
		
		System.out.println(even);
		
		//Display from the following range of Numbers 3, 5, 7, 9, 11
		int odd = 1 + random.nextInt(11);
			if(odd%2 == 0)
				odd = 1 + odd;
		System.out.println(odd);
		
		//Display from the following range of numers 6, 10, 14, 18,22
		int num = 1 + random.nextInt(11);
			if(num % 2 == 0 )
				num = 1+num ;
			if(num ==1)
				num = num +2;
			
			
			num =  num *2;
				
		
		System.out.println(num);
		
	}
	
	public static void main(String[] args) {
		
		displayNumber();
	}

}
