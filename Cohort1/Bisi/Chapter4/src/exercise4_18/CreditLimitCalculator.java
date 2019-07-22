package exercise4_18;
import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		CreditLimit customer = new CreditLimit(20034, 2000, 2000, 7000, 5000);
		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Enter amount");
//		int amount = in.nextInt();
		System.out.println(customer.calNewBalance(0));
		}

	}
