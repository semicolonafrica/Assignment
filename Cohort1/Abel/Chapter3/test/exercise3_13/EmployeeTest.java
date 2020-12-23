package exercise3_13;

public class EmployeeTest {
public static void main(String args[]) {
Employee emp1 = new Employee("James" , "ony", 100); 
Employee emp2 = new Employee("john" , "akin", 200); 

System.out.printf("First employee name: %s%n", emp1.getFirstName() + emp1.getLastName());
double emp1Sal = emp1.getSalary() * 12;
System.out.printf("First employee yearly salary: $%.2f%n", emp1Sal);
System.out.println();

System.out.printf("Second employee name: %s%n", emp2.getFirstName() + emp2.getLastName());
double emp2Sal = emp2.getSalary() * 12;
System.out.printf("Second employee yearly salary: $%.2f%n", emp2Sal);

emp1Sal = ((emp1.getSalary() * 0.1) * 12) + (emp1.getSalary() * 12);
emp2Sal = ((emp2.getSalary() * 0.1) * 12) + (emp2.getSalary() * 12);

System.out.printf("First employee name: %s%n", emp1.getFirstName() + emp1.getLastName());
System.out.printf("First employee yearly salary after raise: $%.2f%n", emp1Sal);

System.out.println();

System.out.printf("Second employee name: %s%n", emp2.getFirstName() + emp2.getLastName());
System.out.printf("Second employee yearly salary after raise: $%.2f%n", emp2Sal);
}
}

