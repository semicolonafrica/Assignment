package chapter4.exercise4_37;

import java.util.Scanner;

public class Factorial1 {



	public  void calculateFactorial() {
		int y = 4;
		int n =5 ;
		int counter = 1;
		int total;
		int result = 0;
	while(counter <= n) {
		 total = counter * y ;
		 result = result + total;
		System.out.println(total);
		++counter;
	}
		
	System.out.print("factorial total is: ");
	System.out.println(result);
	
	
	}

	public void calculateconstant() {
		Scanner input = new Scanner(System.in);
		
		int count = 1;
	;
		
		while(count != -1) {
		
		System.out.println("enter number");
		int number = input.nextInt();
		int total = 1 + number * 3;
		
		System.out.println(total);
		
		if(number ==  -1) {
			System.out.println("end");
		}
				
		}
		
		
	}
	
	public void calculateValue() {
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int number1 = 0;
		int y; 
		
		 

		while(number1 != -1) {
			 System.out.println("Enter number and press -1 to end: ");
			 number1 = input.nextInt();
			 
			 double total = Math.exp(number1);
			 y = (int) total * 3;
			 System.out.println(y);
			 number1++;
			 }
	   input.close();
}
	
	}



