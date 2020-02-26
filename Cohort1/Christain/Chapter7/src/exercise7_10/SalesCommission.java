package exercise7_10;
import java.security.SecureRandom;
public class SalesCommission {
	public void calSales() {
		SecureRandom random = new SecureRandom();
		
		int salary [] = new int[10];
		
		for(int counter = 1; counter < 10; counter++)
			++salary[1 + random.nextInt(9)];
		System.out.printf("%s%20s%n", "Salary", "Salesperson");
		
		for(int salesperson = 2; salesperson < salary.length; salesperson++)
			System.out.printf("%2d-%4d%12d%n", salesperson*100, salesperson * 100 + 99, salary[salesperson]);
	}
}
