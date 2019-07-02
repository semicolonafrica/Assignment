/**
 * 
 */
package exercises;

/**Not outputting the correct result in cent.
 * @author user
 *
 */
import java.util.Scanner;

public class Savings1{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double amount = 0;
        int principal;
        double rate = 0;
        int year = 0;
        int interest = 1;

        System.out.print("Enter number of years: ");
         year = input.nextInt();

         System.out.print("Enter rate: ");
         rate =  input.nextInt()/100;

         System.out.print("Enter principal: ");
         principal = input.nextInt();

        for(int counter = 1; counter <= year; counter++)

        //interest = interest * (1 + rate);
        //amount =  principal * interest;
        amount =  principal * Math.pow(1.0 + rate, counter);
        
        int dollar = (int) amount/100;
        int cent = (int) amount%100;
        
        //amount = principal * Math.pow(1.0 + rate, counter);
        System.out.printf("Return on Investment is:  %s%d%s%d%s", "$",   dollar, "\n", cent, " cent");
        

    }
    
}
