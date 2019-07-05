package chapter5.exercise518;
import java.util.Scanner;
public class ModifiedCompoundInterestTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter principal, year and rate respectively: ");
		int principal1 = input.nextInt();
		int year1 = input.nextInt();
		double rate1 = input.nextDouble();
		
		ModifiedCompoudInterest ojb = new ModifiedCompoudInterest(principal1, year1, rate1);
		System.out.print(ojb.calculateInterest());
	

	}

}
