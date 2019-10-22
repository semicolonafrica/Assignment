package chapter3.exercise316;

import java.util.Scanner;

public class HeartRatesTest {
	
	 // creating a main method //
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter day: ");
        int month = input.nextInt();

        System.out.print("Enter month: ");
        int day = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        String dateOfBirth = month+"/"+day+"/"+year;

        HeartRates lee = new HeartRates(firstName, lastName, dateOfBirth);
    
        System.out.println("Fullname: " + lee.getFirstName() + " " + lee.getLastName());
        System.out.println("Date of Birth: " + lee.getDateOfBirth(month, day, year));
        System.out.println("Age: " + lee.calculateAge(year));
        System.out.printf("Maximum Rate", lee.calculateMaximumHeartRate());
        System.out.println("Heart range: " + lee.calculateRateRangeA()+" "+ "-" + " " + lee.calculateRateRangeB());
            
    
    }

}
