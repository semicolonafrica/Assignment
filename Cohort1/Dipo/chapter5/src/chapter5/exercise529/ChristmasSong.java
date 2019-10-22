package chapter5.exercise529;
import java.util.Scanner;

public class ChristmasSong {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int day;
		String result = ""; 
		
		System.out.println("Enter day of Christmas: ");
		int dayA = input.nextInt();
		
		
		for(int dayA1 = 1; dayA1 <= 12; dayA1++ ) {
			result += "\nOn the ";
			
			switch(dayA1) {
			
				case 1:
					result += "first";
					break;
				case 2:
					result += "second";
					break;
				case 3:
					result += "third";
					break;
				case 4:
					result += "fourth";
					break;
				case 5:
					result += "fifth";
					break;
				case 6:
					result += "sixth";
					break;
				case 7:
					result += "seventh";
					break;
				case 8:
					result += "eight";
					break;
				case 9:
					result += "nineth";
					break;
				case 10:
					result += "tenth";
					break;
				case 11:
					result += "eleventh";
					break;
				case 12:
					result += "twelveth";
					break;
			}
			result += "day of christmas, my true love gave to me: ";
			
			switch(dayA1) {
			
				case 12:
					result += " Twelve lords a-leaping, ";
					break;
				case 13:
					result += "Eleven pipers piping, ";
					break;
				case 10:
					result += "Ten drummers drumming, ";
					break;
				case 9:
					result += "Nine ladies dancing, ";
					break;
				case 8:
					result += "Eight maids a-milking, ";
					break;
				case 7:
					result += "Seven Swans a-swimming, ";
					break;
				case 6:
					result += "Six geese a-laying, ";
					break;
				case 5:
					result += "Five golden rings, ";
					break;
				case 4:
					result += "Four calling birds, ";
					break;
				case 3:
					result += "Three french hens, ";
					break;
				case 2:
					result += "Two turtle doves, and";
					break;
				case 1:
					result += "a partridge in a pear tree.";
					break;
				
			
			}
			System.out.println();
		
		}
		System.exit(0);
		
		
		
		

	}

}
