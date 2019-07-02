package exercise6_24;

public class PerfectNumber {
	public static boolean isPerfect(int n) {
		int skill = n/2;
		String keep = " ";
		int i, sum = 0;
		for(i = 1; i <= skill; i++) {
			
			if(n % i==0) {
				sum += i;
				keep = keep+" "+i;	
			}
			
		}//this check if the sum is perfect.
		if(sum==n) {
			System.out.printf("%s = %d%n",keep,sum );
		}
		
		return true;
	}
	public static void loop() { //control will be transfered here since it show range of number to check.
		int i;
		for(i= 1;i<=1000;i++) {
			isPerfect(i);
			
		}
	}

}
