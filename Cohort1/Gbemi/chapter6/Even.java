/**
 * 
 */
package chapter6;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;
public class Even {
	
	
	public static void isEven() {
		Scanner input = new Scanner(System.in);
		
		int number =1;
		
		
		while(number>0) {
			
			
			System.out.println("enter a value or  enter 0 to stop");
			number = input.nextInt();
			
			
			if(number%2==0) {
				System.out.println(number  +   "is true");
				
			}
			else if(number%2!=0) {
				System.out.println(number  +   "is false");
			}
			else{
				number=0;
			break;
	}	
		}
		number++;
		
		
	}
	public static void main(String[] args) {
		isEven();
	}

}
