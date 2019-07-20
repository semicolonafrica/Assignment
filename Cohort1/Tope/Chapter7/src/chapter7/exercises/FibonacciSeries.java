package chapter7.exercises;

//Find the Fibbonacci Series
//20th of July 2019
//Program written by Oyemade Temitope
//Exercise 7.29

public class FibonacciSeries {
	
	public static double fibonacci(double n) {
		
		double fibo =0;
		
		if(n != 0) {
			
			double prev = 0;
			double current = 1;
		
			fibo = prev + current;
		
			for(int x = 1; x<=n ; x++) {
			
			current = fibo;
			
			fibo = prev + current;
			
			prev = current;
				}
	}
		
		
		
		return fibo;
	}
	
	

}
