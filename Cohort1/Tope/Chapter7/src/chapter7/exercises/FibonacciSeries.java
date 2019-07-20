package chapter7.exercises;

//Find the Fibbonacci Series
//20th of July 2019
//Program written by Oyemade Temitope
//Exercise 7.29

public class FibonacciSeries {
	
	public static int fibonacci(int n) {
		
		int fibo =0;
		
		if(n != 0) {
			
			int prev = 0, current = 1;
		
			fibo = prev + current;
		
			for(int x = 1; x<=n ; x++) {
			
			current = fibo;
			
			fibo = prev + current;
			
			prev = current;
				}
	}
		
		
		
		return fibo;
	}
	
	

	public static void main(String[] args) {
		
		for(int i = 0; i<= 100; i++) {
			
		 System.out.println(fibonacci(i));
		 
		 
		}
	
	}

}
