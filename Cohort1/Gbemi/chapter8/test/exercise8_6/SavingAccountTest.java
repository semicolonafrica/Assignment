package exercise8_6;

import exercise8_6.SavingAccount;

public class SavingAccountTest {

	

	public static void main(String[] args) {
		System.out.println("Year     customer1        customer2  ");
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		SavingAccount.modifyInterest(0.04);
		double bal1;
		double bal2;
		for(int count=1;count<=13;count++) {
			
			
			bal1=saver1.calMonthInterest();
			saver1.setSavingBalance(bal1);
			
			
			bal2=saver2.calMonthInterest();
			saver2.setSavingBalance(bal2);
			System.out.printf("%2d%15.2f%17.2f%n",count,bal1,bal2);
			if(count==12) {
				SavingAccount.modifyInterest(0.05);
			}
			
		}
	}

	
}
