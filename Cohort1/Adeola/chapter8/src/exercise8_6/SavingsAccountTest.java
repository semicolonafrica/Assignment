package exercise8_6;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		System.out.printf("%10s%10s%13s%n","month", "saver1", "saver2");
		
		for(int i=4; i<=5; i++) {
			SavingsAccount.modifyInterestRate(i);
			for(int j=1; j<=12; j++)
			System.out.printf("month %2d : %10.2f%12.2f%n", j, saver1.calculateMonthlyInterest(), saver2.calculateMonthlyInterest());
			
			System.out.println();
		}
	}

}
