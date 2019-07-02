	/**
	 * 
	 */
	package chapter3.exercise313;

	/**
	 * EmployeeTest
	 */import java.util.Scanner;
public class EmployeeTest {

	

	    

	 public static void main(String[] args) {
	        Scanner enter = new Scanner(System.in);

	        System.out.print("First Name: ");
	        String first = enter.nextLine();

	        System.out.print("Last Name: ");
	        String second = enter.nextLine(); 
	        
	        System.out.print("Salary: ");
	        double salary = enter.nextDouble();

	        Employee ademola = new Employee(first,second, salary);

	        // System.out.print("\n");

	        // System.out.print("First Name: ");
	        // String first1 = enter.nextLine();

	        // System.out.print("\n");

	        // System.out.print("Last Name: ");
	        // String second1 = enter.nextLine(); 
	        
	        // System.out.print("Salary: ");
	        // double salary1 = enter.nextDouble();

	        Employee solagbade = new Employee("Adesola","Olabisi",200_000);

	        // Employee ademolanewSalary = new Employee("Ademola","Adeshina",salary));
	        // Employee solagbadenewSalary = new Employee("Gbadebo","Solagbade", salary));

	        System.out.printf("My name is %s %s. I am a working at Semicolon. I earn %.2f%n%n",ademola.getFirstName(),ademola.getLastName(),ademola.getSalary());
	        System.out.printf("My name is %s %s. I am a working at TechStartUp. I earn %.2f%n%n",solagbade.getFirstName(),solagbade.getLastName(),solagbade.getSalary());
	        System.out.printf("My name is %s %s. I am a working at Semicolon. My salary has increased by 0.1 percent: %.2f%n%n",ademola.getFirstName(),ademola.getLastName(),ademola.getSalaryWithIncrease());
	        System.out.printf("My name is %s %s. I am a working at TechStartUp. My salary has increased by 0.1 percent: %.2f",solagbade.getFirstName(),solagbade.getLastName(),solagbade.getSalaryWithIncrease());




	        enter.close();

}
}
