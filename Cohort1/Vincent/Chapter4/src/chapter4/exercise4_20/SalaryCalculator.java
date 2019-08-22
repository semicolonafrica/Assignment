package chapter4.exercise4_20;

//Develop a Java application that determines the gross pay for each of
//three employees. The company pays straight time for the first 40 hours worked by each employee
//and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//number of hours worked last week and their hourly rates. Your program should input this information
//for each employee, then determine and display the employee’s gross pay. Use class Scanner to
//input the data.

import java.util.Scanner;

public class SalaryCalculator{

    public static void calculateSalary(){
        Scanner input = new Scanner(System.in);
        int fixedHour = 40;
        int counter = 1;
        int employee = 1;
        int numberOfHours;
        int hourRate;
        int total=0;
       
        while (counter <= 3){
        	System.out.printf("Employee%d: ", employee++);
            System.out.println("enter number of hours worked"); // prompt to enter the hours worked
            numberOfHours = input.nextInt();
            numberOfHours += fixedHour;
            System.out.println("enter hourRate"); 
            hourRate = input.nextInt();
    
            total = hourRate * numberOfHours ;
            
            System.out.println();
            System.out.printf("Employee gross pay is : %d\n", total);
            
            counter++; 
            
       }
     input.close();
    
   }
    
}