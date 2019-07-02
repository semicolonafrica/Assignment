package chapter5.exercise518;


public class TwelveDaysOfChristmas {

	
	public int getDay() {
		
		int count = 1;
		int day = 1;
		while(count <= 12) {
			switch(day) {
			case 1:
				System.out.print("On the first day of Christmas\nMy true love gave to me\n" );
			
			break;
			case 2:
				System.out.print("On the second day of Christmas\nMy true love gave to me\n");
			
			break;
			case 3:
				System.out.print("On the third day of Christmas\nMy true love gave to me\n");
				break;
			case 4:
				System.out.print("On the fourth day of Christmas\nMy true love gave to me\n");
			
			break;
			case 5:
				System.out.print("On the fifth day of Christmas\nMy true love gave to me\n");
				break;
			case 6: 
				System.out.print("On the sixth day of Christmas\nMy true love gave to me\n");
				break;
			case 7:
				System.out.print("On the seventh day of Christmas\nMy true love gave to me\n");
			
			case 8:
				System.out.print("On the eighth day of Christmas\nMy true love gave to me\n");
			case 9:
				System.out.print("On the ninth day of Christmas\nMy true love gave to me\n");
				break;
			case 10:
				System.out.print("On the tenth day of Christmas\nMy true love gave to me\n");
			
			break;
			case 11: 
				System.out.print("On the eleventh day of Christmas\nMy true love gave to me\n");
			break;
			case 12:
				System.out.print("On the twelfth day of Christmas\nMy true love gave to me\n");
			}

			
		switch(day) {
		case 12:
			System.out.print("twelve drummers drumming\n");
		
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
			System.out.print("Five gold rings, badam-pam-pam\n");
		case 4:
			System.out.print("Four calling birds\n");
		case 3:
			System.out.print("Three French hens\n");
		case 2:
			System.out.print("Two turtle doves\n");
		case 1:
			System.out.print("And a partridge in a pear tree\n");
		}
		count++;day++;
		System.out.println();
		}
	
		return day;
}
	
	public static void main(String[] args) {
		TwelveDaysOfChristmas mine = new TwelveDaysOfChristmas();
		
		mine.getDay();
	}
}

