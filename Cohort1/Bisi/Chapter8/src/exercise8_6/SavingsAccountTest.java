package exercise8_6;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		System.out.println(saver1.calculateMonthlyInterest());
		System.out.println(saver2.calculateMonthlyInterest());
		
	SavingsAccount.modifyInterestRate();		

	}

}
