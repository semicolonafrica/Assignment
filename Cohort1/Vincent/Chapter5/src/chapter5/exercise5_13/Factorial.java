package chapter5.exercise5_13;

//Factorials are used frequently in probability problems. The factorial of a positive
//integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
//1 to n.Write an application that calculates the factorials of 1 through 20. Use type long. Display the
//results in tabular format. What difficulty might prevent you from calculating the factorial of 100?

public class Factorial {

		public static void calculateFactorial() {
			long fact = 1;
			
			System.out.printf("%s%5s", "number" , "\t\tfactorialnumber");
			System.out.println();
			
			for(int f = 1; f <= 20; f++) {
				fact = f * fact;
				
				System.out.printf("%d!%25d%n", f , fact);
			}
		}
}