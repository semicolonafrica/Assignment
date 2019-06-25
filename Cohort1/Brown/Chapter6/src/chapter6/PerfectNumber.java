package Chapter6.exercise6_24;

public class PerfectNumber {
	
	public static boolean isPerfectNumber(long num) {
		
		String store = " ";
		long div = num/2;
		long sum =0;
		long remainder;
		
		for(int i =1; i <= div;i++) {
			
			long check = num%i;
			if(check ==0) {
				sum +=i;
				
				store = store + i + " ";
			}
		}
		if(sum == num) {
			System.out.println(num + "is a perfect number " + store);
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(PerfectNumber.isPerfectNumber(1000));
	}

}
