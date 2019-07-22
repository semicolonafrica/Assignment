package Exercise3_11;
import java.util.Scanner;
public class AccountTest {

	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 Account account1 = new Account("Olabisi O.", 2000);
		 Account account2 = new Account("Ololade A.", 5000);
		 
		 
		 System.out.print("Enter withdrawal for account1: ");
		 double withDrawAmount = in.nextDouble();
		 
		 System.out.print("Enter withdrawal for account2: ");
		 double withDrawAmount2 = in.nextDouble();		 
		 
		 System.out.println();
		 account1.withDraw(withDrawAmount);
		 System.out.println("Balance for account1 is: " + account1.getName() + "\t" + account1.getBalance());
				
		 System.out.println();
		 account2.withDraw(withDrawAmount2);	
		 System.out.println("Balance for account2 is: " + account2.getName() + "\t" + account2.getBalance());
		}

}
