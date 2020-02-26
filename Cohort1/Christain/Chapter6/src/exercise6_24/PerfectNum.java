package exercise6_24;

public class PerfectNum {
	public void isPerfect() {
		
		int sum;
		for(int number = 1; number <= 1000; number++) {
			
			sum = 0;
			
			for(int i = 1; i <= number/2; i++) {
				
				if(number % i == 0) {
					sum += i;
				}
			}
			if(sum == number) {
			System.out.printf("%d is a perfect number\n", number);
			
		}
	}
}
}
