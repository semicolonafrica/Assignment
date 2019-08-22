package chapter3.exercise3_12;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
	
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);

		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

		Scanner input = new Scanner(System.in);
		double depositAmount;
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
		account1.credit(depositAmount);


		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to account@ balance \n\n", depositAmount);
		account2.credit(depositAmount);
		System.out.printf("account1 balance: $%.2f\n",
		account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n",
		account2.getBalance());
		
		System.out.println("enter Amount to withdraw");
		double withdraw= input.nextDouble();
		System.out.printf("\n substracting %.2f to account1 balance\n\n", withdraw);
		account1.debit(withdraw);
		System.out.printf("\nsubstracting %.2f to account@ balance \n\n", withdraw);
		account2.debit(withdraw);
		System.out.printf("account1 balance: $%.2f\n",
		account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n",
		 account2.getBalance());
		
		

		

		        
		    }
	}


