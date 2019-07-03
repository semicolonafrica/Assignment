/**
 * 
 */
package chapter6.exercise621;

import java.util.Scanner;

/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class SeparatingDigits {
	
 
	public static String  printDigit() {
		
		Scanner input = new Scanner(System.in);
			System.out.println(" Enter number");
		String digit = input.nextLine();
		int numberOfDigit = digit.length();
		
		int intNumber = Integer.parseInt(digit);
		
		String separatedDigit = calculateSeparatedDigit(intNumber, numberOfDigit);
		
		return separatedDigit;
	}
	
	public static String calculateSeparatedDigit(int intNumber, int numberOfDigit) {
		String numOutput = "    "; 
		String reversenumOutput=" ";
			int counterNum =10;
		for (int counter = 1; counter <= numberOfDigit; counter++) {
			
 			 int intNumMod = intNumber % counterNum;
			 
 			 // this is use to concatenate  modulus output and specifies spaces " "
			 numOutput += "  " + intNumMod;
			 // this is use to reverse value of numOuput  
			 reversenumOutput = new StringBuffer(numOutput).reverse().toString();
 
		// this is use to reduce input so that modulus can take it course.
			 intNumber/=10;
		
		}
		 System.out.println(reversenumOutput);
		 return numOutput;
	}
}
