/**
 * 
 */
package chapter3.exercise313;

/**
 * Employee
 */
public class Employee {


    private String firstName, lastName;
    private double salary;

    public Employee(String firstname, String lastname, double salary) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.salary = salary;
    }

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
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        if(salary < 0.0) {
            return 0.0;
        } 
        else {
            return 12 * salary;
        }
        
    }
    public double getSalaryWithIncrease() {
        return (getSalary() * 1.1);
    }

}