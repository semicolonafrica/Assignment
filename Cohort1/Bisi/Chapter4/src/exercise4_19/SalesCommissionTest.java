package exercise4_19;
import java.util.Scanner;

public class SalesCommissionTest {
	public static void main(String[] args) {
		SalesCommission nimat = new SalesCommission(200, 450, 10, 239.99);
		
		Scanner in = new Scanner(System.in);
	
		System.out.println(nimat.getGrossSales());
			
		System.out.println(nimat.getCommissionOnItem());
			
		System.out.println(nimat.calWeeklyEarning());
			
		}
}

