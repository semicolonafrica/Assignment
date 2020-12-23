package chapter5.exercise513;

public class Factorial {
	
	public void calculateFactorial() {
		
		long factorial = 1;
		int counter;
		
		System.out.printf("%s%25s%n",  "Counter", "Factorial");
		for(counter = 1; counter <=20; counter++) {
			factorial = factorial * counter;
			System.out.printf("%-25d%-5d", counter, factorial);
			System.out.println();
		}
		 
	}

}
