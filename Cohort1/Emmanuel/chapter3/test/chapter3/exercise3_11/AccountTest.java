/**
 * 
 */
package chapter3.exercise3_11;


/**
 * @author Emmanuel Akinbode
 *
 */
import java.util.Scanner;

import chapter3.exercise3_11.Account;

public class AccountTest{
    public static void main(String [] args){

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

       
        //display initial balance of each object
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());


        Scanner input = new Scanner(System.in);
        
        //scanner input
        System.out.print("Enter deposit amount for account 1: ");
        double depositAmount = input.nextDouble();
        
        //adding to account
        System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount);
        //System.out.println();
        //display balance
        System.out.printf("%s balance: $%.2f%n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
 
        //scanner input
        System.out.print("Enter deposit amount for account 2: ");
        depositAmount = input.nextDouble();

        //adding to account
        System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
        account2.deposit(depositAmount);
        //System.out.println();
        //display balance
        System.out.printf("%s balance: $%.2f%n%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
         
        input.close();
    }
    
}