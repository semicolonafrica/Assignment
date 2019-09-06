package exercise418;

import java.util.Scanner;

public class CreditCardTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		CreditCard creditCardCalculator = new CreditCard();
		
		int accNum;
		int initialBal;
		int totalCharges;
		int totalCredits;
		int creditLimit;
		char customer = 'y';
		
		
		String sep = "\n-----------------------------------------";
		
		while (customer != 'n') {
			
			System.out.println(sep);
		
			System.out.print("Enter Account Number: ");
			accNum = input.nextInt();

			System.out.print("Enter start Balance for Account " + accNum + " : ");
			initialBal = input.nextInt();

			System.out.print("Enter total Charges for the month for Account " + accNum +" : ");
			totalCharges = input.nextInt();

			System.out.print("Enter Total Credits charged for the month for Account " + accNum+" : ");
			totalCredits = input.nextInt();

			System.out.print("Enter Credit Limit for for Account " + accNum + " : " );
			creditLimit = input.nextInt();

			System.out.println(sep);
			
			creditCardCalculator.setAcountNumber(accNum);
			creditCardCalculator.setBalance(initialBal);
			creditCardCalculator.setTotalItemsCharged(totalCharges);
			creditCardCalculator.setTotalCredit(totalCredits);
			creditCardCalculator.setCreditLimit(creditLimit);
			
			System.out.println(sep);
            System.out.printf("CREDIT INFORMATION FOR ACCOUNT %d\n", accNum);
			
            System.out.printf("Starting balance: %d\n", creditCardCalculator.getBalance());
            System.out.printf("Credit Limit:     %d\n", creditCardCalculator.getCreditLimit());
            System.out.printf("Total Charges:    %d\n", creditCardCalculator.getTotalItemsCharged());
            System.out.printf("Total Credits:    %d\n", creditCardCalculator.getTotalCredit());
            System.out.printf("New Balance:      %d\n", creditCardCalculator.newBalance());

            System.out.println(sep);
            creditCardCalculator.checkCreditLimit();

            // continue
            System.out.println();
            System.out.print("Calculate credit for another account? (y/n): ");
            customer = input.next().charAt(0);
            
		}
		input.close();
	}

} // end class CreditCardTest
