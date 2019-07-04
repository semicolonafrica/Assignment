package chapter6.Exercise622;


import java.util.Scanner;

public class Temperature {

//Author by Olayinka Oloko
//27th June 2019

	
	public static double celsius(int fahrenheit) {
		
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		
		return celsius;
	}
	
	public static double fahrenheit(int celsius) {
		
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		
		return fahrenheit;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Press A for Fahrenheit or B for Celsius ");
		char choice = input.next().charAt(0);
		
		if(choice =='A') {
			System.out.println("Input Fahrenheit value");
			int fahreinheit = input.nextInt();
			System.out.println(celsius(fahreinheit));
		}
		
		
		if(choice == 'B') {
			System.out.println("Input celsius value");
			int celsius = input.nextInt();
			System.out.println(fahrenheit(celsius));
		}
		input.close();

	}

}
