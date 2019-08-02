package chapter8.exercises;

public class SavingsAccountTest {

	public static void main(String[] args) {
		
		SavingsAccount lem = new SavingsAccount(2000);
		SavingsAccount lem1 = new SavingsAccount(3000);

		SavingsAccount.setAnnualInterestRate(0.04);
		System.out.printf("Interest Rate: %.2f%n", SavingsAccount.getAnnualInterestRate());
		System.out.printf("%s%10s%n%n","lemon", "toby");

		double numb = 0.0;
		double numb1 = 0.0;
		for(int i = 1; i <= 12; i++) {
			numb = lem.modifySavingsBalance();
			numb1 = lem1.modifySavingsBalance();
			System.out.printf("%5.2f%10.2f%n", numb,numb1);
		}
		
		SavingsAccount.modifyInterestRate();
		//SavingsAccount.setAnnualInterestRate(0.04);
		System.out.printf("Interest Rate: %.2f%n", SavingsAccount.getAnnualInterestRate());
		System.out.printf("%s%10s%n%n","lemon", "toby");
		numb = 0.0;
		numb1 = 0.0;
		lem.setSavingsBalance(2000);
		lem1.setSavingsBalance(3000);
		for(int i = 1; i <= 12; i++) {

			numb = lem.modifySavingsBalance();
			numb1 = lem1.modifySavingsBalance();
			System.out.printf("%5.2f%10.2f%n", numb,numb1);
		}
	}

}