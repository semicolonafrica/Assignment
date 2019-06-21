/**
 * 
 */
package chapter3.exercise311;

/**
 * @author user
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Okoro Chukwuebuka", 1000.12);
		Account account2 = new Account("Omotolani Ligali", -100000);
		
		System.out.print("Initial balance for " + account1.getName() + " is " + account1.getBalance());
		System.out.print("Initial balance for " + account2.getName() + " is " + account2.getBalance());
	
		System.out.println();
		
		account1.deposit(1000000);
		displayAccount(account1);	
		
		account2.deposit(5000000);
		displayAccount(account2);	
		
		account1.withdraw(5000);
		displayAccount(account1);		
		
		account2.withdraw(5000001);
		displayAccount(account2);

	}
	
	public static void displayAccount(Account accountdisplay) {
		System.out.print("Balance after withdrawal: " + accountdisplay.getName() + "is" + accountdisplay.getBalance());
	}
}
