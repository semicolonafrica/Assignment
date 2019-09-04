package exercise8_6;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		double keep;
		double keep1;
		
	//		System.out.println("Monthly interest for Saver1 is $" + saver1.calculateMonthlyInterest());
	//		System.out.println("Monthly interest for Saver2 is $" + saver2.calculateMonthlyInterest());
	//		System.out.println();
	//		System.out.println("The account balance for Saver1 is $" + saver1.getSavingsBalance());
	//		System.out.println("The account balance for Saver2 is $" + saver2.getSavingsBalance());
	//	//SavingsAccount.modifyInterestRate();		
		for(int i = 1; i <= 13; i++) {
			keep = saver1.calculateMonthlyInterest();
			saver1.setSavingsBalance(keep);
			
			keep1 = saver2.calculateMonthlyInterest();
			saver2.setSavingsBalance(keep1);
			System.out.println(i+" "+keep+" "+keep1);
			if(i == 13) {
				SavingsAccount.modifyInterestRate(0.05);
			}
		}
	}

}
