package exercise720;
import java.security.SecureRandom;

public class TotalSalesCal {
		static int  [][] sales = new int [5][4];

		
	
	public static int calSales() {
		SecureRandom randomNumbers = new  SecureRandom();
		
	int totalSales = 0;
	
	for(int i = 0; i < sales.length; i++) {
		for(int j = 0; j < sales[i].length;j++) { 
			
			totalSales = 100 + randomNumbers.nextInt(1000);
			sales[i][j] = totalSales;
				
		}
	}
	return totalSales;
		
	}

	
	public static void getSales() {
		
		int total= 0;
		
		System.out.printf("%s%13s%13s%13s%10s%15s%n","Product ","Saleperson1","Saleperson2"," Saleperson3 ", "Saleperson4"," TotalPerMonth");
		calSales();
		
		for(int pds = 0; pds < sales.length; pds++) {	
			
			System.out.printf("%7d",pds);
			for(int sp = 0; sp < sales[pds].length; sp++) {
				
				total += sales[pds][sp];
				
				
				System.out.printf("%13d",sales[pds][sp]);
				

				
			}
			System.out.printf("%15d",total);
			
			System.out.println("\n");
	
		}
		getTotal();
	}
	public static void getTotal() {
		int total = 0, sp = 0;
		for(int a = 0; a < sales.length;a++) {
			
			if(a < 5) {
				   total += sales[a][sp];
				
				System.out.printf("%15d",total);
				sp++;
				a = 0;
			}
			
			if(sp > 3)
				break;
			
		
		}
	}
	
		
		
	
	
	



	public static void main(String[] args) {
		getSales();

		

				}

}
