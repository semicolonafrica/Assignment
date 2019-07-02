/**
 * 
 */
package chapter3.exercise3_13;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Employee {
	
	    private String firstName;
	    private String lastName;
	    private double salary;

	    public Employee(String firstName, String lastName, double salary){
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.salary = salary;
	    }
	    public void setFirstName(String firstName){
	        this.firstName = firstName;
	    }
	    public void setLastName(String lastName){
	        this.lastName = lastName;
	    }
	    public void setSalary(double salary){
	        this.salary = salary;
	    }
	    public String getFirstName(){
	        return firstName;
	    }
	    public String getLastName(){
	        return lastName;
	    }
	    public double getSalary(){
	        return salary;
	    }
	    

	}


