/**
 * 
 */
package chapter6.exercise626;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class ReversingDigit {
	private static int numberLength;
	private static String storeReverseNumber = " ";
		public static double doReverseDigit() {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter number to reverse");
			String number = input.nextLine();
			numberLength= number.length();
			
			int numberDigit = Integer.parseInt(number);
			
			int reverseNumber = calculateReverseDigit(numberDigit);
			
			return reverseNumber;
		}
		
		public static int calculateReverseDigit(int number) {
			int numMod=0;
			for (int counter =1; counter <= numberLength; counter++) {
				
				 numMod  = number % 10;
				
				storeReverseNumber += " " + numMod;
				
				number /=10;
			 
			}
			
			System.out.println(storeReverseNumber);
			return numMod;
		}
}
