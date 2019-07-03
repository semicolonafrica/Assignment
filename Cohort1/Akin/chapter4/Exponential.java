package chapters;
import java.util.Scanner;
public class Exponential {

	public double getExponent() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int numberOfTerms = input.nextInt();
		int x = input.nextInt();
		//double store = 1;
		int number = 1;
		int count = numberOfTerms - 1;
		while(count > 1) {

				number = 1 + ( x * number/count);  
			
			--count;
		}
		//int correct = 1 + store;
		System.out.println();
		System.out.print(number);
		input.close();
		return number;
	}
	public static void main(String[] args) {
		Exponential exponent = new Exponential();

		exponent.getExponent();
	}

}
