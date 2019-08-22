package chapter3.exercise3_12;
import java.util.Scanner;
public class EmployeeBookletTest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Employee Salary");
		int salary = input.nextInt();
		
		EmployeeBooklet employee1 = new EmployeeBooklet("Mr john", "Okoro", salary);
		EmployeeBooklet employee2 = new EmployeeBooklet("Mr vincent","Okengwu", salary);
		

		System.out.printf("employee1 details are: \n%s\t%s\nYearlysalary of employee: %.2f", employee1.getFirstName(),employee1.getLastName(),employee1.calculateSalary());
	
		System.out.printf("employee1 details are: \n%s\t%s\nYearlysalary of employee: %.2f", employee2.getFirstName(),employee2.getLastName(),employee2.calculateSalary());
	}

}
