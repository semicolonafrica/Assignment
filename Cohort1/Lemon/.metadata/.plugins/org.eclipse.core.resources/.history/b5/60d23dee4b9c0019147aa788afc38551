/**
 * 
 */
package chapter6;

/**
 * @author User
 *
 */
public class NumberSystem {
	
	public static String binary(int number) {
		String store= "";
		while(number!=0) {
			int remainder = number%2;
			store=remainder+""+store;
			number/=2;
			
		}
		return (store);
	}
	
	
	public static String octal(int number) {
		String store= "";
		while(number!=0) {
			int remainder = number%8;
			store=remainder+""+store;
			number/=8;
			
		}
		return (store);
	}
	
	
	
	
	public static String hexaDecimal(int number) {
		String remainder="" + number % 16;

		switch (remainder) {
		case "10":
			remainder = "A";
			break;
		case "11":
			remainder = "B";
			break;
		case "12":
			remainder = "C";
			break;
		case "13":
			remainder = "D";
			break;
		case "14":
			remainder = "E";
			break;
		case "15":
			remainder = "F";
			break;
		
		
		}
		
		return (remainder);
		
	}
	
	public static void getNumber() {
		System.out.println("Binary Number\t octal Number\t Hexadecimal Number");
		for(int i=1;i<=256;i++) {
			System.out.printf("%s%15s   %17s%n",binary(i),octal(i),hexaDecimal(i));
			
		}
	}
	
	public static void main (String[] args) {

		
	getNumber();
	}

}
