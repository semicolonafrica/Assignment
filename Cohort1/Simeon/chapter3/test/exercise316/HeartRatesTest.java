package exercise316;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		HeartRates hrt = new HeartRates("Sam", "Imma", 23, 10, 1976);
//		
//		System.out.println(hrt.getDateOfBirth() + "\n" + hrt.calMaxHeartRate() 
//			+ "\n" + hrt.getTargetHeartRate());
		
		System.out.print("Welcome to SIMT GYM!\n\n");
		
		System.out.print("Please Enter Your first Name: ");
		String name = input.nextLine();
		hrt.setFirstName(name);
		
		System.out.println();
		
		System.out.print("Please Enter Your  Surname: ");
		name = input.nextLine();
		hrt.setLastName(name);
		
		System.out.println();
		
		System.out.printf("Welcome, %s %s!\n\n", hrt.getFirstName(), hrt.getLastName());
		
		System.out.print("Please Enter your day of birth:");
		int birth = input.nextInt();
		hrt.setDay(birth);
		
		System.out.println();
		
		System.out.print("Please Enter your month of birth:");
		birth = input.nextInt();
		hrt.setMonth(birth);
		
		System.out.println();
		
		System.out.print("Please Enter your year of birth:");
		birth = input.nextInt();
		hrt.setYear(birth);
		
		System.out.println();
		
		System.out.println("YOUR PROFILE");
		System.out.printf("Name: %s %s \nAge: %d \nMax Heart Rate: %d beats/min \nTarget Heart Rate: ", hrt.getFirstName(), hrt.getLastName(),
				hrt.getAge(), hrt.calMaxHeartRate());
		hrt.getTargetHeartRate();
		
		input.close();
		
	}

}
