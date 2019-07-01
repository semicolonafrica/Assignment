/**
 * 
 */
package chapter6;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;
public class PerfectNumber {
	
	public static boolean isperfectNumber(int number) {
		
		int counter=1;
		String store=" ";
		int addition=0;
		
		boolean result = true;
		
		for(counter=1;counter<number;counter++) {
			if(number%counter==0) {
				addition+=counter;
				store= store + "  "+ counter;
			}

		}

		if(addition==number) {
			
			result = true;
			
			System.out.printf("%s = %d%n",store,addition);
		}
		else {
			result = false;
		}
		return result;
	}
	public static void main(String[] args) {
		display();
	}
	
	public static void display() {
		for(int i = 1; i < 1000000;i++) {
			isperfectNumber(i);
		}
	}

}
