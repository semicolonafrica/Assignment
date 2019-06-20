package exercise4_19;

	import java.util.Scanner;

	public class SalesCommissionTest {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			SalesCommission nimat = new SalesCommission(200, 450, 10, 239.99);
			
			System.out.println(nimat.getGrossSales());
			
			System.out.println(nimat.getCommissionOnItem());
			
			System.out.println(nimat.calWeeklyEarning());
			
		}
	}

