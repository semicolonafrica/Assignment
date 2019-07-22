package exercise3_13;
//import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		
		Employee employee1 = new Employee("Olabisi", "O", -50_000);
		Employee employee2 = new Employee("Ololade","A",20_000);
		
		employee1.yearlySalary(0);
		System.out.println("Yearly Salary for Employee1 is " + employee1.getFirstName() +"\t"
				+ employee1.getLastName() +"\t"+ employee1.getSalary());
		
		System.out.println();
		employee2.yearlySalary(0);
		System.out.println("Yearly Salary for Employee2 is " + employee2.getFirstName() +"\t"
				+ employee2.getLastName()+"\t"+ employee2.getSalary());

		System.out.println();
		employee1.raise(0);
		System.out.println("New Salary with 10% increase for Employee1 is " + employee1.getFirstName() +"\t"
				+ employee1.getLastName()+"\t"+ employee1.getSalary());
		
		System.out.println();
		employee2.raise(0);
		System.out.println("New Salary with 10% increase for Employee2 is " + employee2.getFirstName() +"\t"
				+ employee2.getLastName()+"\t"+ employee2.getSalary());
	}
}
