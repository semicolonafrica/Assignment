/**
 * 
 */
package chapter6.exercise6_34;

/**
 * @author Emmanuel Akinbode
 *
 */
public class TableOfNumber {
	
	
	public static String generateBinary(int integer) {
		int digit = 0;
		String store= "";
		while(integer != 0) {
			digit = integer % 2;
			store= "" + digit + store;
			integer = integer/2;	
		}			
		return store;
	}

	public static String generateOctal(int integer) {
		int digit = 0;
		String store= "";
		while(integer != 0) {
			digit = integer % 8;
			store= "" + digit + store;
			integer = integer/8;	
		}			
		return store;
	}
	
	public static String generateHexadecimal(int integer) {
		String digit = "";
		String store= "";
		while(integer != 0) {
			digit = "" + integer % 16;
			
			switch(digit) {
			
			case "10":
				digit = "A";
				break;
				
			case "11":
				digit = "B";
				break;
			
			case "12":
				digit = "C";
				break;
				
			case "13":
				digit = "D";
				break;
				
			case "14":
				digit = "E";
				break;
				
			case "15":
				digit = "F";
				break;
				
			}
			store= "" + digit + store;
			integer = integer/16;	
		}			
		return store;
	}
	public static void displayTable() {
		
		for(int i = 1; i <= 256; i++) {
			System.out.printf("%d\t\t%-7s%11s\t\t%s%n",i, generateBinary(i), generateOctal(i),generateHexadecimal(i) );
			 if( i % 10 == 0) {
				 for(int j = 1; j <= 17; j++) {
					 System.out.print("___");
				 }
				 System.out.println();
			 }
			

		}
		
	}
}
