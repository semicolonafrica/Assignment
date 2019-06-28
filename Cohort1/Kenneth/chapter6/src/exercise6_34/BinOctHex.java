/**
 * 
 */
package exercise6_34;

/**
 * @author ken_granero
 *
 */
public class BinOctHex {
	
	
	public static void printNumbers() {
		
		System.out.println("Decimal\tBinary\tOctal\tHexadecimal");
		
		for(int i = 1; i <= 256; i++) {
			
			System.out.println(i+ "\t" +getBinary(i)+ "\t" +getOctal(i)+ "\t" +getHexadecimal(i));
		}
	}
	
	
	public static String getBinary(int number) {
		
		String result = " ";
		int remainder = 0;
		
		while(number > 0) {
			remainder = number % 2;
			result = remainder + result;
			number = number/2; 
			
		}
		return result;
	}
	
	public static String getOctal(int number) {
			
			String result = " ";
			int remainder = 0;
			
			while(number > 0) {
				remainder = number % 8;
				result = remainder + result;
				number = number/8; 
				
			}
			return result;
		}
	
	public static String getHexadecimal(int number) {
			
			String result = " ";
			String remainder = "";
			
			while(number > 0) {
				remainder = ""+number % 16;
				switch(remainder) {
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
				
				result = ""+ remainder + result;
				number = number/16; 
				
			}
			return result;
		}



}
