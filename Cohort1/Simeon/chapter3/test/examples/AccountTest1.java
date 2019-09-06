package examples;

public class AccountTest1 {

	public static void main(String[] args) {
		
		// create two Account objects
		Account1 count1 = new Account1("Jane Green");
		Account1 count2 = new Account1("John Blue");
		
		// display initial value of name for each Account
		System.out.printf("Account1 name is: %s%n", count1.getName());
		System.out.printf("Account2 name is: %s%n", count2.getName());
		
	} // end method main

} // end class AccountTest1
