package chapter3.exercise3_12;

import java.util.Scanner;

public class HealthRecordsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter firstname");
		String firstname = input.nextLine();	
		System.out.println("enter lastname");
		String lastname = input.nextLine();
		System.out.println("enter presentyear");
		int height = input.nextInt();
		System.out.println("enter year of birth");
		int weight = input.nextInt();

		
		HealthRecord profile1 = new HealthRecord(firstname, lastname,height,weight);
		profile1.getFirstName();
		profile1.displayDateofBirth(06, 18, 2019);
		profile1.dateofBirth(2019, 1994);
		profile1.targetHeartRate(25);
		profile1.maximumHeartRate(25);
		profile1.calculateBMI(weight, height);

	}
	
	
}
