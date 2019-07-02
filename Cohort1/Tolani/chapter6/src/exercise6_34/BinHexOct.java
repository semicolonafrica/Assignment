package exercise6_34;

import exercise6_15.Maths;

public class BinHexOct {
	
	public static void printResult() {
		System.out.println("\tBinary\t\tOctal\tHexadecimal");
		
		for(int i =1;i<=256;i++) {
			System.out.println(i+"\t\t" +returnBinary(i) +"\t\t" +returnOctal(i) +"\t" +returnHex(i));
		}
	}
	
	
	public static String returnBinary(int value) {
		String space = "";
		int remainder = 0;
		while(value>0) {
			remainder = Maths.remainder(value,2);
			space=remainder+space;
			value = Maths.quotient(value, 2);
		}
		return space;
	}
	
	public static String returnOctal(int value) {
		String space = "";
		int remainder = 0;
		while(value>0) {
			remainder = Maths.remainder(value,8);
			space=remainder+space;
			value = Maths.quotient(value, 8);
		}
		return space;
	}
	
	public static String returnHex(int value) {
		String space ="";
		String remainder = "";
		while(value>0) {
			remainder = "" + Maths.remainder(value, 16);
			switch(remainder) {
			case "10" :
				remainder = "A";
				break;
			case "11" :
				remainder = "B";
				break;
			case "12" :
				remainder = "C";
				break;
			case "13" :
				remainder = "D";
				break;
			case "14" :
				remainder = "E";
				break;
			case "15" :
				remainder = "F";
				break;
				
			}
			space =  ""+ remainder + space;
			value = value /16;
			
		}
		
		
	return space;
	}
	
	

}
