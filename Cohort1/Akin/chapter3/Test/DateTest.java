package chapter3.exercise314;

import java.util.Scanner;
public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month of the year: ");
        int month1 = input.nextInt();

        System.out.print("Enter the day of the year: ");
        int day1 = input.nextInt();
        
        System.out.print("Enter the year: ");
        int year1 = input.nextInt();


        Date  present = new Date(day1, month1, year1);

        System.out.print(present.displayDate());

        input.close();
    }
}