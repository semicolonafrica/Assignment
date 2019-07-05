package chapter3.exercise311;

//program to test the account //
//inputing and outputing floating point //
import java.util.Scanner;
public class AccountTest {

 public static void main(String[] args) {
     Account account1 = new Account("Jane Green", 50.00);
     Account account2 = new Account("John Blue", -7.00);

     
     displayAccount(account1);
     //System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
     displayAccount(account2);
     //System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
     // create a Scanner to obtain input from the command window
     Scanner input = new Scanner(System.in);

     System.out.print("Enter deposit amount for account1: "); // prompt
     double depositAmount = input.nextDouble(); // obtain user input
         account1.deposit(depositAmount); // add to account1’s balance

     System.out.print("Enter deposit amount for account2: "); // prompt
     depositAmount = input.nextDouble(); // obtain user input
         account2.deposit(depositAmount); // add to account2 balance

     // display balances
     System.out.printf("%s balance: $%.2f%n",
     account1.getName(), account1.getBalance());
     System.out.printf("%s balance: $%.2f%n%n",
     account2.getName(), account2.getBalance());

    

     System.out.print("Enter withdraw amount for account1: "); // prompt
     double withdrawAmount = input.nextDouble(); // obtain user input
         account1.withdraw(withdrawAmount); // add to account1’s balance


     System.out.print("Enter withdraw amount for account2: "); // prompt
      withdrawAmount = input.nextDouble(); // obtain user input
         account2.withdraw(withdrawAmount); // add to account2 balance

     // display balances
     System.out.printf("%s balance: $%.2f%n",
     account1.getName(), account1.getBalance());
     System.out.printf("%s balance: $%.2f%n%n",
     account2.getName(), account2.getBalance());
 }
 	public static void displayAccount(Account display) {
 		
 		System.out.printf("%s balance: $%.2f%n%n", display.getName(), display.getBalance());
 	}

 
 
 

}
