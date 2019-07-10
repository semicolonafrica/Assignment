package exercise717;
import java.security.SecureRandom;


public class RollDie {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
	int die1 = 0;
	int die2 = 0;
	
	int sum = 0;
	 int [] results = new int [11];
	 for(int j = 0; j < 36000;j++) {
		 
		 die1 = 1+ randomNumbers.nextInt(6);
		 die2 = 1 + randomNumbers.nextInt(6);
		 sum = die1 + die2;
		  ++results[sum-2];
	 }
	 System.out.printf("%5s%8s%8s%n","NumberOfRolls:", "Sum: ", " Results ");
	 for(int k = 0; k <results.length; k++)
		 System.out.printf("%-7d%11d%11d%n", k, k+2, results[k]);
	}
	

}
