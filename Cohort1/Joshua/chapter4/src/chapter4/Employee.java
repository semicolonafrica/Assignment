/**
 * 
 */
package chapter4;

/**
 * @author Group3
 *
 */
import java.util.Scanner;
public class Employee {
	
	Scanner input = new Scanner(System.in);

	private int numberOfHoursWorked;
	private double hourlyRate;
	private int listOfEmployee;
	private double extraHours;
	public Employee(int numberOfHoursWorked, double hourlyRate, int listOfEmployee, double extraHours) {
		
		
		super();
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.hourlyRate = hourlyRate;
		this.listOfEmployee = listOfEmployee;
		this.extraHours = extraHours;
	}
	
	
	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}
	
	
	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
	public int getListOfEmployee3() {
		return listOfEmployee;
	}
	
	
	public void setListOfEmployee3(int listOfEmployee3) {
		this.listOfEmployee = listOfEmployee;
	}
	
	
	public double getExtraHours() {
		return extraHours;
	}
	
	
	public void setExtraHours(double extraHours) {
		this.extraHours = extraHours;
	}
	
	
	public void calculateGrossPay() {
		 
		 int total = 0;
		 int counter = 1;
		 double grossPay = 0;
		 double overTime = 0; 
		 int listOfEmployee = 3;
		 
		 while(counter < listOfEmployee) {
			 
			 System.out.println("Enter Number Of Hours Worked: ");
			  numberOfHoursWorked = input.nextInt();
			 
			 System.out.println("Enter rate per hour: ");
			 hourlyRate = input.nextDouble();
			 
			 System.out.println("Enter Extra Hours Worked: ");
			 extraHours = input.nextDouble();
			 
			total += numberOfHoursWorked;
			 if(numberOfHoursWorked <= 40) {
				 grossPay = numberOfHoursWorked * hourlyRate;
			 }
			 
			 else {
				 overTime = (numberOfHoursWorked - 40) * hourlyRate;
				 grossPay = grossPay + overTime;
			 }
			 
			 System.out.println("Your Gross Pay Is: " + grossPay);
			 counter++;
		 }
	}
	
}
