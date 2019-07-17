package exercise7_27;

/**
 * @author tboydev
 *When this process completes, the array elements that are still true indicate that the index is a
prime number. These indices can be displayed. Write an application that uses an array of 1,000 elements to determine and display the prime numbers between 2 and 999. Ignore array elements 0
and 1
 */
public class PrimeArray {
	
	boolean prime[] = new boolean[1000];
	
	
	public void findPrime() {
		
		setValues(); //sets all boolean array values to true
		int result;
		
		for(int index = 2; index < prime.length; index++) {
			
			if(prime[index] == true ){
				
				for(int i = index + 1; i < prime.length; i++) {
					
					result = i % index;
					
					if(result == 0) {
						prime[i] = false;
					}
					
				}
			}
		}
		
		int br = 0;
		for(int j = 1; j < prime.length; j++) {
			
			if(prime[j] == true) {
			System.out.printf("%2d  ", j);
			br++;
			}
			
			if(br % 5== 0) {
				System.out.println();
			}
			
				
		}
		
	}
	public void setValues() {
		
		for(int i = 0; i < prime.length; i++) {
			
			prime[i] = true;
		}
	}

}
