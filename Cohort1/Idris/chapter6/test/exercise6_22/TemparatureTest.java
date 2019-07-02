package exercise6_22;

import java.util.Scanner;
public class TemparatureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 to convert to celsuis or 2 for fahrenheit :");
		int check = input.nextInt();
		
		
			
			while(check<1 || check>2) {  //this is to ask for user input again.
				System.out.printf("%s"," invalid input!!!");
				System.out.println("Enter 1 to convert to celsuis or 2 for fahrenheit :");
				check = input.nextInt();
			}
		
		if(check==1) {
			System.out.println("Enter the value to convert to celsui:");
			double value1 = input.nextDouble();
			value1 = Temparature.calculateCelcius(value1);
			System.out.printf("%s %.3f"," the value of fahrenheit to celsius is: ",value1);
		}
		if(check ==2) {
			System.out.println("Enter the value to convert to celsius :");
			double value2 = input.nextDouble();
			value2 = Temparature.calculateFahrenheit(value2);
			System.out.printf("%s %.3f"," the value of celsius to fahrenheit is: ",value2);
		}
		
	
		input.close();
	}

}
