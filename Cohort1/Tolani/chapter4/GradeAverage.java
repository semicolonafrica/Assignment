//Implementing Sentinel-Controlled Iteration
//Chapter 4, page 443. 01/june/2019.

/* 
sentinel value(signal value,dummy value,flag value) to indicate end of data entry. sentinel controlled iteration is often called indefinite 
iteration cos d number of iteration is not known before loop begins executing.
()unary cast operator to ctemporary create anothe type, this is explicit conversion or type casting. the value store 
(eg total is still an integer). (double)total/counter, java arithmetic expression evalutes only if operand tpes re same, 
since couter is int and int total has been explicitly temporaryly converted to double, java will perform promotion or implicit conversion
 on counter, makig it double too.
 */


import java.util.Scanner;

public class GradeAverage{
    public static void main(String [] main){

        Scanner input = new Scanner(System.in);

        int total = 0;
        int counter = 0;

        System.out.println("Enter grade or -1 to exit: ");
        int grade = input.nextInt();

        while(grade != -1){
            total = total + grade;

            counter++;

            System.out.print("Enter grade or -1 to exit: ");
            grade = input.nextInt();
        }
        if(counter != 0){
            double average = (double) total/counter;

            System.out.println("");
            System.out.println("Total of the " + counter + " grades inputed is " + total);
            System.out.println("");
            System.out.println("Average is: " + average);
        }
        else{
            System.out.print("No grade was inputed");
        }
        input.close();
    }
}