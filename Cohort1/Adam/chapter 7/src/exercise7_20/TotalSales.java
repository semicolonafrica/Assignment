package exercise7_20;

import java.security.SecureRandom;


public class TotalSales {
	static int [][]sales = new int [5][4];
	
	public static int calSales() {
		
		int totalSales= 0;
		
		
		SecureRandom random = new SecureRandom();
		
		for(int sals = 0; sals < sales.length; sals++) {
			for(int prds = 0; prds < sales[sals].length; prds++) {
				
				totalSales = 100 + random.nextInt(1000);
				sales[sals][prds]= totalSales;
				
				
			}
			
		}
		return totalSales;
		
	}
	
	public static void getSales() {
		
		int Sales = 0;
		
		
		System.out.printf("%s%13s%13s%13s%15s%15s%n","products", "Salesperson1", "salesperson2", "salesperson3", "salesperson4","TotalPerMonth");
		
		calSales();
		
		int total = 0;
		
		for(int prds =0; prds < sales.length; prds++) {
			
			System.out.printf("%7d", prds);
			
			for(int sp = 0; sp < sales[prds].length; sp++) {
				
				total += sales[prds][sp];
				
				System.out.printf("%13d", sales[prds][sp]);
			}
			System.out.printf("%15d", total);
			
			System.out.println("\n");
		}
		getTotal();
	
		}
	public static void getTotal() {
		int total = 0;
		
		int sp = 0;
		
		for(int i = 0; i < sales.length; i++) {
			
			if(i < 5) {
				total += sales[i][sp];
				
				System.out.printf("\t        %d", total);
				sp++;
				i = 0;
			}
			if(sp > 3 ) {
				break;
			
		}
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		getSales();
	}

}
