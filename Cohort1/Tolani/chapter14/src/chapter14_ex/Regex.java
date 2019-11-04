package chapter14_ex;

import java.util.Scanner;

public class Regex {
	
	
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z]*([a-zA-Z])*");
	}
	
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[A-Z]*([a-zA-Z])*");
	}
	
	public static boolean validateEmail(String email) {
		return email.matches("[A-Z]* ([a-zA-Z])*");
	}
	
	public static boolean validatePassword(String password) {
		return password.matches("[A-z]+\\d+");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();
		System.out.println("Enter your email address: ");
		String email = input.nextLine();
		System.out.println("Enter your password: ");
		String password = input.nextLine();
		
		
		System.out.printf("%nValidate Result:");
		if(!Regex.validateFirstName(firstName)) {
			System.out.println("Invalid first name");
		}else if(!Regex.validateLastName(lastName)) {
			System.out.println("Invalid last name");
		}else if(!Regex.validateEmail(email)) {
			System.out.println("Invalid email");
		}else if(!Regex.validatePassword(password)) {
			System.out.println("Invalid password");
		}else
			System.out.println("Valid Input..Thank you");
		
	}

}
