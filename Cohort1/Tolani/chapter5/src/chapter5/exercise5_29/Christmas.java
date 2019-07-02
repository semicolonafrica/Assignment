/**
 * 
 */
package chapter5.exercise5_29;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Christmas {
	
	public void getDay() {
		int day = 0;
		int counter = 1;
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter day: ");
		day = input.nextInt();
		
		while(counter <= 12) {
			
		switch(day) 
			{
			
			case 1:
				System.out.print("On the first day of Christmas\r\n" + 
						"My true love gave to me");
				break;  
			
			case 2:
				System.out.print("On the second day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 3:
				System.out.print("On the third day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 4:
				System.out.print("On the fourth day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 5:
				System.out.print("On the fifth day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 6:
				System.out.print("On the sixth day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 7:
				System.out.print("On the seventh day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 8:
				System.out.print("On the eighth day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 9:
				System.out.print("On the ninth day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 10:
				System.out.print("On the tenth day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				
			case 11:
				System.out.print("On the eleventh day of Christmas\r\n" + 
						"My true love gave to me");
				break;
		
			case 12:
				System.out.print("On the twelfth day of Christmas\r\n" + 
						"My true love gave to me");
				break;
				default:
					break;
				
							
			}
			System.out.println();
			switch(day) 
			{
			
			case 12:
				System.out.println("12 drummers drumming");
			case 11:
				System.out.println("Eleven pipers piping");
			case 10:
				System.out.println("Ten lords a leaping");
			case 9:
				System.out.println("Nine ladies dancing");
			case 8:
				System.out.println("Eight maids a milking");
			case 7:
				System.out.println("Seven swans a swimming");
			case 6:
				System.out.println("Six geese a laying");			
			case 5:
				System.out.println("Five gold rings");
			case 4:
				System.out.println("Four calling birds");
			case 3:
				System.out.println("Three French hens");
			case 2:
				System.out.println("Two turtle doves");
			case 1:
				System.out.println("A partridge in a pear tree");
								
			}
			
			System.out.println();
			day = input.nextInt();
						
		 //System.out.println(day);			
		
			counter++;
		
		}
	
			
	}
}


