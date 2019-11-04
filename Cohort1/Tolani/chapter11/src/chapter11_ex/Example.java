package chapter11_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
	
	
	
	public static int quotient(int x,int y){
		int division = x / y;
		return division;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		boolean continueLoop = true;
		
		do {
			try {
				System.out.println("Enter numerator:");
				int x = input.nextInt();
				System.out.println("Enter numerator:");
				int y = input.nextInt();
				int result = quotient(x,y);
				System.out.printf("%s:%d%n","The quotient of x, y is",result);

				continueLoop = false;
				
			}
			catch(InputMismatchException |ArithmeticException e ) {
				System.err.printf("%nException:  %s%n",e);
				System.out.println("Input must be an integer");
				
			}
			
		}while(continueLoop);
	}

}
