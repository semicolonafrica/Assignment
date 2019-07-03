package chapter6.exercise617;

import java.util.Scanner;

public class EvenOrOdd {
	
	public void determineEven() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number or -1 to exit: ");
		int x = input.nextInt();
		
		while(x != -1) {
			boolean isEven = isEven(x);
			System.out.println(isEven);
			
			System.out.println("Enter number or -1 to exit: ");
			x = input.nextInt();
			if(x == -1) {
				System.out.println("You exit the application");
			}
		}
		
		
		
		
	}
	public boolean isEven(int z) {
		
		if(z%2 ==0) {
			return true;
		}
			else {
			 return	false;
			
			
		}
	}
}
