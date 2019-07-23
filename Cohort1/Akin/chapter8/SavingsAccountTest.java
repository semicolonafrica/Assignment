package chapter8;

public class SavingsAccountTest {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);

		SavingsAccount.setAnnualInterestRate(0.04);
		System.out.printf("Interest Rate: %.2f%n", SavingsAccount.getAnnualInterestRate());
		System.out.printf("%s%10s%n%n","Saver1", "Saver2");

		double value1 = 0.0;
		double value2 = 0.0;
		for(int i = 1; i <= 12; i++) {
			value1 = saver1.modifySavingsBalance();
			value2 = saver2.modifySavingsBalance();
			System.out.printf("%5.2f%10.2f%n", value1,value2);
		}
		
		SavingsAccount.modifyInterestRate();
		//SavingsAccount.setAnnualInterestRate(0.04);
		System.out.printf("Interest Rate: %.2f%n", SavingsAccount.getAnnualInterestRate());
		System.out.printf("%s%10s%n%n","Saver1", "Saver2");
		value1 = 0.0;
		value2 = 0.0;
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		for(int i = 1; i <= 12; i++) {

			value1 = saver1.modifySavingsBalance();
			value2 = saver2.modifySavingsBalance();
			System.out.printf("%5.2f%10.2f%n", value1,value2);
		}
	}

}
