/**
 * 
 */
package chapter4.exercis418;

/**
 * @author user
 *
 */
	import java.util.Scanner;
public class CreditLimitTest {
	
	
	//main method to display credit Limit
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter your account Number 1: ");
		int inputAccount1 = input.nextInt();
		
		System.out.print("Enter your account Number 2: ");
		int inputAccount2 = input.nextInt();
		//System.out.print("Enter beginning balance: ");
		
		System.out.print("Enter your account Number 3: ");
		int inputAccount3 = input.nextInt();
		
		System.out.print("Input your total charge 1: ");
		int charge1 = input.nextInt();
		
		System.out.print("Input your total charge 2: ");
		int charge2 = input.nextInt();
		
		System.out.print("Input your total charge 3: ");
		int charge3 = input.nextInt();
		
		
		System.out.print("Input total credit 1: ");
		int credit1 = input.nextInt();
		
		System.out.print("Input total credit 2: ");
		int credit2 = input.nextInt();
		
		System.out.print("Input total credit 3: ");
		int credit3 = input.nextInt();
		
//		System.out.print("Set credit limit: ");
//		int limit = input.nextInt();
//		
		CreditLimitCalculator ayoitunu = new CreditLimitCalculator("Ayo Itunu",inputAccount1, 200_000.00, charge1, 60_000, credit1);
		CreditLimitCalculator victor = new CreditLimitCalculator("Victor Adebiyi",inputAccount2, 1_000.00, charge2, 8_00, credit2);
		CreditLimitCalculator akin = new CreditLimitCalculator("Akinlolu olaposi",inputAccount3, 1_000.00, charge3, 1_000, credit3);
		
		System.out.printf("The new balance for customer %s with account number %d is: %.2f%n",ayoitunu.getCustomerName(),ayoitunu.getAccountNumber(),ayoitunu.getNewBalance());
		System.out.printf("The new balance for customer %s with account number %d is: %.2f%n",victor.getCustomerName(),victor.getAccountNumber(),victor.getNewBalance());
		System.out.format("The new balance for customer %s with account number %d is: %.2f%n",akin.getCustomerName(),akin.getAccountNumber(),akin.getNewBalance());


		input.close();
	}
}
