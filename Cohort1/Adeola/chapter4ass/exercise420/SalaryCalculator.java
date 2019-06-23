package exercise420;
	import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers of employees");
		int numberOfEmployee = input.nextInt();
		int counter = 1;
//		double totalPay = 0;
		
		while(counter <= numberOfEmployee) {
			System.out.print("Enter the number of hours worked by employees");
			int hoursWorked = input.nextInt();
			
			System.out.print("Enter the pay per hour for this of employee");
			double payPerHour = input.nextDouble();
			
			double totalPay = 40*(payPerHour) + ((hoursWorked-40)*(payPerHour*1.5));
			
			System.out.printf("the salary for employee %d is %f%n",counter ,totalPay );
			if(counter< numberOfEmployee)
				System.out.print("enter details of next employee %n ");
			
			counter++ ;
			
		}
		

	}

}
