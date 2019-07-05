package chapter3.exercise314;

//program for DateTest.java//

//using a java.utility Scanner //
import java.util.Scanner;

//creating the program class //
public class DateTest{

 //creating a main method //
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     Date newDate = new Date(3, 16, 2019);

     System.out.print("Enter month: " );
     int month = input.nextInt();
     newDate.setMonth(month);

     System.out.print("Enter day: ");
     int day = input.nextInt();
     newDate.setDay(day);

     System.out.print("Enter year: " );
     int year = input.nextInt();
     newDate.setYear(year);

     System.out.println("The Date is: " + newDate.displayDate());
 }
}

