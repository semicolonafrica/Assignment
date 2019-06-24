package exercise624;

public class PerfectNumber {
	
	public static boolean isPerfect(int num) {

	boolean result = true;
		
			String store = "";
			int sum = 0;
		
			for(int k = 1; k < num; k++) {
				if(num % k == 0) {
					
					sum += k; 
					store = store + " " + k;

				}
		}
			if(sum == num) {
			
			result = true;
			System.out.printf("%s = %d%n",store,sum);
			
			}
			else {
			
				result = false;
			}
			return result;
		
		
	}

	public static void main(String[] args) {
				
		display();
			
			
		
//			if(n >= 1 && n <= 1000) {
//				
//				 sum = sum + n;
//				
//			
//			  System.out.println(sum);
//			}
		
	}
	public static void display() {
		
		for(int i = 1; i < 100000; i++) {
			isPerfect(i);
		}
	}

}

