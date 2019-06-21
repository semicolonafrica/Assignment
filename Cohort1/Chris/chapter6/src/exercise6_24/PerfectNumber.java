package exercise6_24;

public class PerfectNumber {
	
	public static boolean isPerfect(int num) {
		
		int div = num/2;
		int sum = 0;
		String store = " ";
		
		for(int i = 1; i <= div; i++) {
			int check = num % i;
			if(check == 0) {
				sum += i;
				store = store + " "+ i;
			}
		}
		
		if(sum == num) {
			System.out.printf("%d %s%n",sum, store );
		}
		return true;
	}
	
	public static void display() {
		for(int j = 1; j <= 10000; j++) {
			isPerfect(j);
		}
	}

}
