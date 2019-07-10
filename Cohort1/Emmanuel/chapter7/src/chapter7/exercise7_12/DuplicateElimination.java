/**
 * 
 */
package chapter7.exercise7_12;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class DuplicateElimination {
	
	static SecureRandom randomNumbers = new SecureRandom();
	
	
	public static int genNumbers(int [] num) {
		
		 int numbers = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = 10 + randomNumbers.nextInt(100); 
			
			numbers = num[i];

			//System.out.println(numbers);
		}
		
		return numbers;
	}
	
	public static void checkDuplicate() {
		Scanner input = new Scanner(System.in);
		int [] num = new int [5];
		
		genNumbers(num);
		 
		 for(int j = 0; j < num.length; j++){
			 
			 int user = input.nextInt();
			 
			 if(user != num[j]) {
				 System.out.printf("%3d%8d%n",user, num[j]);
			 }else if(user == num[j]) {
				 System.out.println("Num not same");
			 }
		 }
	}
	
	public static void main(String [] args) {
		
		DuplicateElimination.checkDuplicate();
		//System.out.println
	}
	
	

}
