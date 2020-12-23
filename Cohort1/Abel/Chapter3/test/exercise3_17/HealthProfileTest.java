package exercise3_17;

import java.util.Scanner;
public class HealthProfileTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstName : ");
        String firstName = input.nextLine();
        System.out.println("Enter lastName : ");
        String lastName = input.nextLine();  
        System.out.println("Enter gender : ");
        String gender = input.nextLine();
        System.out.println("Enter month of birth : ");
        int month = input.nextInt();
        System.out.println("Enter day of birth : ");
        int day = input.nextInt();
        System.out.println("Enter year of birth : ");
        int year = input.nextInt();
        System.out.println("Enter height in inches: ");
        int height = input.nextInt();
        System.out.println("Enter weight in pounds : ");
        int weight = input.nextInt();
    
        String dateOfBirth = month + "/" + day + "/" + year;

        HealthProfile user1 = new HealthProfile(firstName, lastName, gender,height, weight,dateOfBirth );
        System.out.println("Personal Information :");

        System.out.println("Name: "+ user1.getFirstName() + " "+ user1.getLastName() +"\n"+"Gender: "+user1.getHeight()+"\n"+"Height: "+user1.getHeight()+"\n"+"Weight: "+user1.getWeight());
        System.out.println(user1.getDateOfBirth(day, month, year)); 
        System.out.println("Age: "+ user1.calculatePersonAge(year));
        System.out.println("Maximum Heart rate : "+ user1.calculateMaximumHeartRate());
        System.out.println("Target Heart rate range : "+ user1.calculateTargetRange1()+ "-" + user1.calculateTargetRange2());
        System.out.println("BMI : "+ user1.calculateBMI(height, weight));
        System.out.println("BMI Values : \nUnderWeight : less than 18.5 \nNormal    :      between 18.5 and 24.9 \nOverweight :   between 25 and 29.9 \nObese :     30 or greater");
        input.close();
    }
}