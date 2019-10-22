package chapter5.exercise520;
import java.util.Scanner;
public class ValueOfPi {
	
	
	public double calculatePi() {
		double pi;  double v;
	
		
		// calculating for pi
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of terms: ");
		double number = input.nextDouble();
		
		pi = 0.0;
		v = -1.0;
		
		for(double i = 1.0; i <= number; i+=2) {
			
			v = v * (-1);
			
			pi = pi + (4 / i) * v;
			
			System.out.println(pi);
			
		}
		input.close();
		
		return pi;
	}
	

}
