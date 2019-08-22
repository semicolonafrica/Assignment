package chapter3.exercise3_12;
import java.util.Scanner;
public class HeartRateCalculatorTest {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
	
		System.out.println("enter firstname");
		String firstname = input.nextLine();	
		System.out.println("enter lastname");
		String lastname = input.nextLine();
		System.out.println("enter presentyear");
		int presentyear = input.nextInt();
		System.out.println("enter year of birth");
		int yearofBirth = input.nextInt();
	
		HeartRateCalculator calculator1 = new HeartRateCalculator(firstname,lastname,presentyear,yearofBirth);
	
		calculator1.getFirstName();
		calculator1.getLastName();
		calculator1.displayDateofBirth(14, 03, yearofBirth);
		calculator1.dateofBirth(presentyear,yearofBirth);
		calculator1.maximumHeartRate(25);
		calculator1.targetHeartRate(25);
		
	}

}
