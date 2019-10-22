package chapter3.exercise313;

//program for employeeTest //
//creating a util Scanner //
import java.util.Scanner;

//creating a class.java class //
public class EmployeeTest{

	// creating a main method //
 public static void main(String[] args){
	
	// calling the Scanner created //
	Scanner input = new Scanner(System.in);
	
	// creating the employees //
 Employee employee1 = new Employee("Tolani", "Ajala", 800);
 Employee employee2 = new Employee("Sikemi", "Ogunleye", 700);


 System.out.printf("Initial firstname is: %s%n Initial lastname: %s%n initial monthly salary is: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary());
		
	
	System.out.println("Enter first name of employee1: " );
	String firstName = input.nextLine();
	employee1.setFirstName(firstName);
	
	System.out.println("Enter last name employee1: ");
	String lastName = input.nextLine();
	employee1.setLastName(lastName);
	
	System.out.println("Enter monthly salary for employee1: ");
	double monthlySalary = input.nextDouble();
	employee1.setMonthlySalary(monthlySalary);
	
 System.out.printf("Yearly salary of employee1 is: %.2f%n", employee1.yearlySalary());
 System.out.printf("Ten percent raise for employee1 is: %.2f%n", employee1.salaryRaise());
	
	
	
	
	
	
 }
}
