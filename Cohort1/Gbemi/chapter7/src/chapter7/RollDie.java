/**
 * 
 */
package chapter7;

/**
 * Write an application to simulate the rolling of two dice. The application
should use an object of class Random once to roll the first die and again to roll the second die. The
sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
 * @author User
 *
 */
import java.security.SecureRandom;
public class RollDie {
	
	public static int sumingDie() {
		
		SecureRandom randomInput=new SecureRandom();
		
		int roll1 = 1+randomInput.nextInt(6);
		
		int roll2 = 1+randomInput.nextInt(6);
		
		int sum = roll1+roll2;
		
		return sum;
		}
	
	public static void getFrequency() {
		int[] roll=new int[13];
		
		for(int k=0;k<=36_000_00;k++) {
			
			++roll[sumingDie()];
		}
		for(int m=2;m<roll.length;m++) {
			
			System.out.println(m +"  "+roll[m]);
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(sumingDie());
		getFrequency();
	}
		
	}


