package exercise3_16;

import java.util.Scanner;

public class HeartRatesTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstName : ");
        String firstName = input.nextLine();
        System.out.println("Enter lastName : ");
        String lastName = input.nextLine();
        System.out.println("Enter month of birth : ");
        int month = input.nextInt();
        System.out.println("Enter day of birth : ");
        int day = input.nextInt();
        System.out.println("Enter year of birth : ");
        int year = input.nextInt();
        System.out.println("Enter current year : ");
        int currentYear = input.nextInt();


        HeartRates user1 = new HeartRates(firstName, lastName, month, day, year);
        System.out.println("Personal Information :");

        System.out.println("Name: "+ user1.getFirstName() + " "+ user1.getLastName());
        user1.displayDate(day, month, year); 
        System.out.println("Age: "+ user1.calculatePersonAge(currentYear));
        System.out.println("Maximum Heart rate : "+ user1.calculateMaximumHeartRate());
        System.out.println("Target Heart rate range : "+ user1.calculateTargetRange1()+ "-" + user1.calculateTargetRange2());
        

        
    }
}