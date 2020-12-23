package chapter7.exercise710;

public class SalesCommission {
	
//public static void main(String[] args) {
//		
//		sales();
//		
//	}
	
	public static void sales() {
		int[] earn = new int[9];
		int[] grossSales = {6000, 5000, 4000, 5400, 6050, 9000, 8000, 20000, 5000};
		int[] frequency = new int[100];
		
		for(int i = 0; i < grossSales.length; i++) {
			earn[i] = 200 + (int) (grossSales[i]*0.09);
			int a = earn[i]/100;
			if(a==2) {
				frequency[2] += 1;
				
			}
			if(a==3) {
				frequency[3] += 1;
			
			}
			if(a==4) {
				frequency[4] += 1;
			
			}
			if(a==5) {
				frequency[5] += 1;
			
			}
			if(a==6) {
				frequency[6] += 1;
			
			}
			if(a==7) {
				frequency[7] += 1;
			
			}
			if(a==8) {
				frequency[8] += 1;
			
			}
			if(a==9) {
				frequency[9] += 1;
			
			}
			if(a>=10) {
				frequency[10] += 1;
			
			}
			
		}
		System.out.println("Range" + "\tFrequency");
		System.out.println("200-299: \t" + frequency[2]+ "\n300-399: \t" + frequency[3] + "\n400-499: \t" + frequency[4]+ "\n"
				+ "500-599: \t" + frequency[5] + "\n600-699: \t" + frequency[6] + "\n700-799: \t" + frequency[7]+ "\n"
				+ "800-899: \t" + frequency[8] + "\n900-999: \t" + frequency[9] + "\n1000 & over: \t" + frequency[10] );
	
	}
	
}
	
	
