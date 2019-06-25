package chapter5.exercise5_13;

//Factorials are used frequently in probability problems. The factorial of a positive
//integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
//1 to n.Write an application that calculates the factorials of 1 through 20. Use type long. Display the
//results in tabular format. What difficulty might prevent you from calculating the factorial of 100?

public class Factorial {

		public static void main(String[] args) { 
			int y = 20;
			int n =20 ;
			int counter = 1;
			long total;
			long result = 0;
			int count = 1;
			
		while(counter <= n) {
			 total = counter * y ;
			 result = result + total;
			System.out.println(total);
			++counter;
		}
			
		System.out.print("factorial total is: ");
		System.out.println(result);
		



		}		
}