package displayLargestAndSmallest;
import java.security.SecureRandom;

public class NumberSize {
	
	public static void main(String args[]) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int[] numberArray = new int[99];
		
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i] = 1+ randomNumbers.nextInt(9); 
			System.out.println(numberArray[i]);
		}
//		
		int largest = numberArray[0];
		int smallest = numberArray[0];
		for(int i = 0; i < numberArray.length; i++) {
			if(numberArray[i] > largest) {
				largest = numberArray[i];
			}
			if(numberArray[i] < smallest) {
				smallest = numberArray[i];
			}
		}
		System.out.printf("%5s%8s%n", "smallest", "largest");
		System.out.printf("%5s%8s%n", smallest, largest);
		
		
		
	}

}
