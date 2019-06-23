package minimum;

import java.util.Scanner;

public class MinimumFinderTest {
	public static void main(String args[]) {
		SmallestSalary obj = new SmallestSalary();
		Scanner input = new Scanner(System.in);
		
		System.out.println("THIS APP TELLS THE SMALLEST OF SALARIES OF 3 EMPLOYEES");
		
		System.out.println();
		System.out.print("Enter Employee 1 salary");
		double salary1 = input.nextDouble();
		
		System.out.print("Enter Employee 2 salary");
		double salary2 = input.nextDouble();
		
		System.out.print("Enter Employee 3 salary");
		double salary3 = input.nextDouble();
		
		System.out.println(obj.minimum3(salary1, salary2, salary3));
	}

}
