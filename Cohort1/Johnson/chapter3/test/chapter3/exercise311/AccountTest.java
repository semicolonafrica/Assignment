package chapter3.exercise311;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 2000.00);
        Account account2 = new Account("John Blue", 3000.00); 
        displayAccount(account1);
        displayAccount(account2);
        //System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance()); 
        //System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance()); 

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input

        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1’s balance

        displayAccount(account1);
        displayAccount(account2);
        //System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance()); 
        //System.out.printf("%s balance: $%.2f %n%n", account2.getName(),account2.getBalance()); 

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        displayAccount(account1);
        displayAccount(account2);
        //System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        //System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

        System.out.println("Enter amount to withdraw from account1: ");
        double withdrawAmount = input.nextDouble(); // obtain user input

        System.out.println("Deduct " + withdrawAmount + " from " + account1.getName() );
        System.out.println("New balance in account1: " + account1.withdrawal(withdrawAmount));

        System.out.println("Enter amount to withdraw from account2: ");
        double withdrawAmount2 = input.nextDouble(); // obtain user input

        System.out.println("Deduct " + withdrawAmount2 + " from " + account2.getName() );
        System.out.println("New balance in account2: " + account2.withdrawal(withdrawAmount));

	}
	public static void displayAccount(Account display){
        System.out.printf("%s balance: $%.2f%n", display.getName(), display.getBalance());
    }

}
