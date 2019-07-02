package chapter5.exercise518;

import java.util.Scanner;

public class ValueOfPie2Test {

	
	public double calculatePie() {
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of terms: ");
		double number = input.nextDouble();
		
		
		double pi = 0.0, v = -1.0;
		
		for(double i = 1.0; i <= number; i+=2) {
			
			v *= -1;
			
			pi += (4 / i) * v;
			
			System.out.println(pi);
	}
		return pi;	
}

}
