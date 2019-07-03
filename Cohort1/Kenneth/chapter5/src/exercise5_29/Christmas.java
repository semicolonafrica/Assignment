/**
 * 
 */
package exercise5_29;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class Christmas {
	
	public void printSong() {
		
		Scanner insert = new Scanner(System.in);
		
		for(int i = 1; i <= 12; i++) {
			System.out.print("On the ");
			switch(i){
			
			case 1:
				System.out.print("first ");
				break;
			
			case 2:
				System.out.print("second ");
				break;
				
			case 3:
				System.out.print("third ");
				break;
				
			case 4:
				System.out.print("fourth ");
				break;
				
			case 5:
				System.out.print("fifth ");
				break;
				
			case 6:
				System.out.print("sixth ");
				break;
				
			case 7:
				System.out.print("seventh ");
				break;
				
			case 8:
				System.out.print("eight ");
				break;
				
			case 9:
				System.out.print("ninth ");
				break;
				
			case 10:
				System.out.print("tenth ");
				break;
				
			case 11:
				System.out.print("eleventh ");
				break;
				
			case 12:
				System.out.print("twelveth ");
				break;
			default:
				break;
			}
			System.out.println("day of Christmas my true love gave me ");
			

				
				switch(i) {
				
				case 12:
					System.out.println("Twelve Drummers drumming");
					
					
				case 11:
					System.out.println("Eleven pipers piping ");
					
					
				case 10:
					System.out.println("Ten lords a-leaping");
					
					
				case 9:
					System.out.println("Nine ladies dancing");
					
					
				case 8:
					System.out.println("Eight maids a-milking");
					
					
				case 7:
					System.out.println("Seven swans a-swimming");
					
					
				case 6:
					System.out.println("Six geese a-laying ");
					
					
				case 5:
					System.out.println("Five golden rings ");
					
					
				case 4:
					System.out.println("Four calling birds ");
					
					
				case 3:
					System.out.println("Three french hens ");
					
					
				case 2:
					System.out.println("Two turtle doves, and");
					
					
				case 1:
					System.out.println("A partridge in a pear tree ");
					
					
				default:
					
				
				}
				System.out.println();
			
			
		}
		insert.close();
	}

}
