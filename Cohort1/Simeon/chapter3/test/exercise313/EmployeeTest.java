package exercise313;


import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Employee employee1 = new Employee("James", "Dara", 30_000.99);
		Employee employee2 = new Employee("Tasha", "Walts", 834_000.23);
		
		System.out.printf("%s %s yearly salary is %.2f%n"	, employee1.getFirstName(),
				employee1.getLastName(), employee1.yearlySalary());
		System.out.printf("%s %s yearly salary is %.2f%n"	, employee2.getFirstName(),
				employee2.getLastName(), employee2.yearlySalary());
		
		System.out.println();
		
		System.out.print("Enter raise percentage: ");
		double raise = input.nextDouble();
		
		System.out.printf("%nRaise monthly salary of employee1 and employee2 by %.2f percent.%n", raise);
		
		System.out.println();
		
		employee1.raise(raise);
		employee2.raise(raise);
		
		// print new salary of meployee1 and employee2
		System.out.printf("New Salary of %s %s and %s %s after a Raise of %.2f percent %n%n", employee1.getFirstName(), employee1.getLastName(),
				employee2.getFirstName(), employee2.getLastName(), raise);
		System.out.printf("%s %s yearly salary is %.2f%n"	, employee1.getFirstName(),
				employee1.getLastName(), employee1.yearlySalary());
		System.out.printf("%s %s yearly salary is %.2f"	, employee2.getFirstName(),
				employee2.getLastName(), employee2.yearlySalary());

		
		input.close();
	}

}
