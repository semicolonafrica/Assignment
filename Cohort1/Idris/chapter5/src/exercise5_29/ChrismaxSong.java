package exercise5_29;


import java.util.Scanner;
public class ChrismaxSong {
			
	public void displayXmasSong() {

		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of verse");
		int day=input.nextInt();
		while(day<=12) {
			
			switch(day) {
			case 1:
				System.out.print("On the first day of Christmas\r\n" +
						"My true love gave to me\n");
				break;
			case 2:
				System.out.print("On the second day of Christmas\r\n" +
						"My true love gave to me\n");
				break;
			case 3:
				System.out.print("On the third day of Christmas\r\n" +
						"My true love gave to me\n");
				break;
			case 4:
				System.out.print("On the fourth day of Christmas\r\n" +
						"My true love gave to me\n");
				break;
			case 5:
				System.out.print("On the fifth day of Christmas\r\n" +
						"My true love gave to me\n");
				break;
			case 6:
				System.out.print("On the sixth day of Christmas\r\n" +
						"My true love gave to me\n");
				break;
			case 7:
				
				System.out.print("On the seventh day of Christmas\r\n" +
				"My true love gave to me\n");
				break;
			case 8:
				System.out.print("On the eighth day of Christmas\r\n" +
				"My true love gave to me\n");
				break;
			case 9:
				System.out.print("On the ninth day of Christmas\r\n" +
				"My true love gave to me\n");
				break;
			case 10:
				System.out.print("On the tenth day of Christmas\r\n" +
				"My true love gave to me\n");
				break;
			case 11:
				System.out.print("On the eleventh day of Christmas\r\n" +
				"My true love gave to me\n");
				break;
			case 12:
				System.out.print("On the twelveth day of Christmas\r\n" +
				"My true love gave to me\n");
				break;
				
				
			}
			switch(day) {
			case 12:
				System.out.print("12 drummers drumming\n");
			case 11:
				System.out.print("Eleven pipers piping\n");
			case 10:
				System.out.print("Ten lords a leaping\n");
			case 9:
				System.out.print("Nine ladies dancing\n");
				
			case 8:
				System.out.print("Eight maids a milking\n");
				
			case 7:
				System.out.print("Seven swans a swimming\n");
			
			case 6:
				System.out.print("Six geese a laying\n");
				
			case 5:
				System.out.print("Five gold rings\n");
				
			case 4:
				System.out.print("Four calling birds\n");
			case 3:
				System.out.print("Three French hens\n");
			case 2:
				System.out.print("Two turtle doves\n");
			case 1:
				System.out.print("And a partridge in a pear tree\n");
				
				
			}
		
			//System.out.println(verse1 + verse2);
			System.out.println("enter the number of verse");
			day= input.nextInt();
			
		}	
	}
	
}



