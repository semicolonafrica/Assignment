package chapter7.exercises;


public class SalesTable {	
	
	public void getSales(){
		
	
		
		int [][] sales = {{250,100,76,9},
						{104,2,7,9},
						{54,23,45,6},
						{50,15,12,150},
						{40,23,7,1}};		
	
			
			int sum=0;
			
			System.out.printf("%s%13s%15s%15s%15s%15s%n","Product","SalesPerson1","SalesPerson2","SalesPerson3","SalesPerson4","Total");
			
			for(int i=0;i<sales.length;i++) {				
				
				System.out.print(i+1);
				
				int totalDollar =0;
				
				for(int product=0;product<sales[i].length;product++) {
					
					totalDollar += sales[i][product];
					
					System.out.printf("%15d",sales[i][product]);
					
					sum+=sales[i][product];
				}		
				System.out.printf("%17d", totalDollar);		
				
				System.out.println();				
				
				totalDollar += 0;
				if (i == 4) {
					System.out.print("\nST");
				}
			} //System.out.print("SPtotal");
			
			for(int col = 0; col<sales[0].length; col++) {
				int total =0;
				for(int row=0; row <sales.length; row++) {
					
					total += sales[row][col];
					
				}
				System.out.printf("%15d", total);
			}
			System.out.printf("%16d",sum);
		}
}