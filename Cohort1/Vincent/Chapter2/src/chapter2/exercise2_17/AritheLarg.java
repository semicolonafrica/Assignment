package chapter2.exercise2_17;

import java.util.Scanner;
//(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//representation of the average. So, if the sum of the values is 7, the average should be 2, not
//2.3333….]
public class AritheLarg {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		
		System.out.println("enter number");
		number1 = input.nextInt();
		System.out.println("enter number");
		number2 = input.nextInt();
		System.out.println("enter number");
		number3 = input.nextInt();
		
		int sum = number1 + number2 + number3;
		int average = number1 + number3+ number2 /3;
		int product = number1 + number2 + number3;
		int min = Math.min(number1,Math.min(number2, number3));
		int max = Math.max(number1,Math.max(number2,number3));
		

		System.out.printf("sum is: %d%naverage is: %d%nProuct is: %d%nmin is: %d%nmax is: %d%n", sum,average,product,min,max);
	}

}
