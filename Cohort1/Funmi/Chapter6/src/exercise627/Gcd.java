package exercise627;
import java.util.Scanner;
public class Gcd {
	public static void calculateGcd() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Greatest value: ");
			int num1 = input.nextInt();
		 
		 System.out.println("Enter the devisor: ");
		 int num2 = input.nextInt();
		 
		 
		 while(num1 != num2) {
			 if(num1 > num2)
				 
				 num1 = num1 - num2;
			 else 
				 num2 = num2 - num1;
		 
		 }
		 	System.out.printf("GCD of a numbers is: %d", num2);
		 	input.close();
	}
		
	public static void main(String[] args) {
		Gcd.calculateGcd();

	}

}