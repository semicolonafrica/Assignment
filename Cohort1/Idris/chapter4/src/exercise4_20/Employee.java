package exercise4_20;

import java.util.Scanner;

public class Employee {
	
	private int numberOfHoursWorked = 0; 
	private int hourlyRate = 0;
	private int listOfEmployee = 3;
	
	
	public Employee(int numberOfHoursWorked, int hourlyRate, int listOfEmployee) {
		
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.hourlyRate = hourlyRate;
		this.listOfEmployee = listOfEmployee;
		
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getListOfEmployee() {
		return listOfEmployee;
	}

	public void setListOfEmployee(int listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}

	
	public void calculateEmployeeSalary() {
		
		Scanner accept = new Scanner(System.in);

		 int numberOfHoursWorked = 0; 
		 int hourlyRate = 0;
		 int listOfEmployee = 3;
		
		int counter = 0;
		double grossPay = 0.0; 
		
		while( counter < listOfEmployee) {
			
			System.out.print("Enter number Of Hours Worked: " );
			numberOfHoursWorked = accept.nextInt();
			
			System.out.print("Enter hourly rate: " );
			hourlyRate = accept.nextInt();
			
			if(numberOfHoursWorked <= 40 ) {
				grossPay = numberOfHoursWorked * hourlyRate;
				System.out.println("Employee grossPay is: "+ grossPay);
			}
			else {
				grossPay = numberOfHoursWorked * hourlyRate;
				//overtime = (numberOfHoursWorked-40)* hourlyRate;
				 //overtime;
				System.out.println("Employee grossPay is: "+ grossPay);
			}
			counter++;
		}
		//System.out.println("Employee grossPay is: "+ grossPay);
		accept.close();
	}
}
