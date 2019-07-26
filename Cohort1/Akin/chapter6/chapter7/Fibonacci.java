package chapter7;

public class Fibonacci {

	
	
	public static void fibonacci(int n) {
		
		int[] fibo = new int[n];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2; i < fibo.length; i++) {
			
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			
			System.out.printf("%d  %5d",i, fibo[i]);
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
	}
	public static void fibonacciModified(int num) {
		
		double[] fibo = new double[num];
		fibo[0] = 0.0;
		fibo[1] = 1;
		for(int i = 2; i < fibo.length; i++) {
			
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			
			System.out.printf("%d  %5.2f", i,fibo[i]);
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
