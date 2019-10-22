package chapter3.exercise313;

//program for Employee.java //
public class Employee {
	
 private String firstName;
 private String lastName;
 private double monthlySalary;

 //creating a constructor//
 public Employee(String firstName, String lastName, double monthlySalary) {

     this.firstName = firstName;
     this.lastName = lastName;
     
     if(monthlySalary > 0.0) {
       this.monthlySalary = monthlySalary;
     }
 
 }

 	// creating a setter and getter method //
 	public void setFirstName(String firstName) {
    this.firstName = firstName;
 	}
 	public String getFirstName() {
    return firstName;
 	}

 	public void setLastName(String lastName) {
    this.lastName = lastName;
 	}
 	public String getLastName() {
    return lastName;
 	}

 	public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
 	}
 	
 	public double getMonthlySalary() {
    return monthlySalary;
 	}

 	public double yearlySalary() {
     double salary = monthlySalary * 12;
     
     
     return salary;
 	}

 	public double salaryRaise() {
     double raise = 1.1 * monthlySalary;
     
     return raise;
 	}
}

