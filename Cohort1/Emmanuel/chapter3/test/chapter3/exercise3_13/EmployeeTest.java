/**
 * 
 */
package chapter3.exercise3_13;

/**
 * @author Emmanuel Akinbode
 *
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Employee employee1 = new Employee("Akin", "Bode", 800.00 );
		        Employee employee2 = new Employee("Ade", "Deji", 400.00 );

		        double r = (0.1 * employee1.getSalary()) + employee1.getSalary();
		        double p = (0.1 * employee2.getSalary()) + employee2.getSalary();

		        
		        System.out.println(employee1.getFirstName() + " "+ employee1.getLastName() + " yearly salary is: " + (employee1.getSalary() * 12));
		        System.out.println(employee2.getFirstName() + " "+ employee2.getLastName() + " yearly salary is: " + (employee2.getSalary() * 12));
		        System.out.println();
		        System.out.println(employee1.getFirstName() + " "+ employee1.getLastName() + " 10% raise yearly salary is: " + (r * 12));
		        System.out.println(employee2.getFirstName() + " "+ employee2.getLastName() + " 10% raise yearly salary is: " + (p * 12));




		    }
		

	}


