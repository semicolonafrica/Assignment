/**
 * 
 */
package chapter3.exercise3_15;

/**
 * @author Emmanuel Akinbode
 *
 */
public class AccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//import java.util.Scanner;
		
		        Account account1 = new Account("Jane Green", 50.00);
		        Account account2 = new Account("John Blue", -7.53);

		        displayAccount(account1);
		        displayAccount(account2);
		        System.out.print("");
		               
		        account1.deposit(500.00);
		        displayAccount(account1);

		        account2.deposit(0.00);
		        displayAccount(account2);

		        account1.withdraw(400.00);
		        displayAccount(account1);

		        account2.withdraw(300.00);
		        displayAccount(account2);
		         

		    }
		    
		    public static void displayAccount(Account accountToDisplay){
		        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(),accountToDisplay.getBalance());
		    }
		        

	}

