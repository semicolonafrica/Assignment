package chapter6;

public class TableOfNumbers {
	
	public static String getBinary(int decimal) {
		
		String store = "";
		int digit = 1;
		
		while(decimal != 0) {
			digit = decimal % 2;
			
			store  = digit + "" + store;
			decimal /= 2;
		}
		return store;
		
	}
	
	public static String getOctal(int decimal) {
		String store = "";
		int digit = 1;
		
			while(decimal != 0) {
				digit = decimal % 8;
				
				store = digit + "" + store;
				decimal/= 8;
			}
			return store;
	}

	public static String getHexadecimal(int decimal) {
		String store = "";
		String digit = "";
		
		while(decimal != 0) {
			digit = "" + decimal % 16;
			
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
			}
			
			store = digit + "" + store;
			
			decimal /= 16;
		}
		
		return store;
	}
	public static void runAll() {
		for(int i = 1; i <= 256; i++) {
			//System.out.printf("%s%n",getHexadecimal(i));
			System.out.printf("%d     %s     %s     %s%n",i,getBinary(i),getOctal(i),getHexadecimal(i));
			
		}
		
	}
}	