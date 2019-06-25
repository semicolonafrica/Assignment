package chapter6.exercise6_24;

//An integer number is said to be a perfect number if its factors, including
//1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
//1 + 2 + 3. Write a method isPerfect that determines if parameter number is a perfect number. Use
//this method in an application that displays all the perfect numbers between 1 and 1000. Display the
//factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing
//power of your computer by testing numbers much larger than 1000. Display the results.

import java.util.Scanner;

public class PerfectNumber {

		public static int findPerfectNumber() {
			Scanner input = new Scanner(System.in);
			int sum = 0;
			int factor;
			System.out.println();
			System.out.println("enter the number: ");
			int perfectNumber = input.nextInt();
		
			
			for(int counter = 1; counter < perfectNumber ; counter++) {
				
				if(perfectNumber % counter == 0){
					factor = counter;
					System.out.println(factor);		
					sum+= factor;
					
			}
				
				System.out.println();
				System.out.printf(" %d",sum);
			{
		
				if(sum == perfectNumber) {
					System.out.println("True: it is a perfect number");
					
				}
				
				else 
					System.out.println("false: it is not a perfect number");
				}	
		
		}
			input.close();
			return sum;	
			
			
}
}