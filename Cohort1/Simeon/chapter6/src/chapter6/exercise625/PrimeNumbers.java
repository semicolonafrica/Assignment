package chapter6.exercise625;

public class PrimeNumbers {

	public static void isPrime() 
	{
		int number = 0;
			
		int prime = 0;
		double temp = 0;
		
		for(number = 2; number <= 100; number++) {
			temp = number / 2;
		
			for(int i = 1; i <= temp; i++) {
				prime = number % 2;
					
				if (prime == 0) {
					break;
				}
				
			}
			
			if (prime != 0) {
				System.out.println(number);		


			}
		}
	}
	
	public static void squareRoot() 
	{
		int number = 0;
			
		int prime = 0;
		double temp = 0;
		
		for(number = 2; number <= 100; number++) {
			temp = Math.sqrt(number);
		
			for(int i = 1; i <= temp; i++) {
				prime = number % 2;
					
				if (prime == 0) {
					break;
				}
				
			}
			
			if (prime != 0) {
				System.out.println(number);		


			}
		}
	}
}

