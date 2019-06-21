package chapter6_exercises;
//Exercise 6.24
//Program to determine if a number is perfect
//Program written by Oyemade Temitope
//21st of June 2019
public class PerfectNumber {
	
	
	public static boolean isPerfect(int number) {
		boolean status = false;
		int sum = 0;
		int remainder;
		
		for(int counter = 1; counter<number; counter++) {
			remainder = number % counter;
			if(remainder == 0)
				sum = sum + counter;
			}
		
				if(sum == number)
			status = true;
				
						else
							status = false;
		return status;       
	}
	
	public static void displayPerfectNumbers(int number) {
		
		int sum = 0;
		int remainder = 0;
		int perfect = 0;
		String status = "";
		
		for(int counter = 1; counter<number; counter++) {
			remainder = number % counter;
			
			if(remainder == 0) 
				
				sum = sum + counter;
		
			}
		
				if(sum == number)
					perfect = number;	
				
		if(perfect !=0)	
			System.out.println(perfect);
		 
		
	}
	
	
	public static void main(String[] args) {
		
		
		for(int i = 1; i<=100; i++) 
			displayPerfectNumbers(i);
		
	}

}
