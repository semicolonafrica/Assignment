package exercise6_24;

public class TableOfNumbers {
	public static String generateBinary(int number) {
		String binary = "";
		int digit = 0;
		while(number!=0) {
			digit = number%2;
			number = number/2;
			binary = digit +""+binary;
		}
		return binary;
	}
	public static String generateOctal(int number) {
		String octal = "";
		int digit = 0;
		while(number!=0) {
			digit = number%8;
			number = number/8;
			octal = digit +""+octal;
		}
		return octal;
	}
	public static String generateHex(int number) {
		String hex="";
		String digit = "";
		while(number!=0) {
			digit =""+ number%16;
			switch(digit) {
			case "10":
				digit="A";
				break;
			case "11":
				digit = "B";
				break;
			case "12":
				digit = "C";
				break;
			case "13":
				digit= "D";
				break;
			case "14":
				digit ="E";
				break;
			case "15":
				digit = "F";
				break;
			}
		hex = digit +hex;
		number /=16;
		}
		
		return hex;
	}
	public static void tableOfNumbers(int num) {
		for(int i = 1; i<=num; i++) {
			System.out.println(i+"      		"+generateBinary(i)+"  				 " +generateOctal(i)+ "  			 "+ generateHex(i));
		}
	}

	public static void main(String[] args) {
		System.out.println("decimal    " + "binary     "+"octaldecimal     "+"hexadecimal");
//		System.out.println(generateOctal(70));
//		System.out.println(generateOctal(71));
		tableOfNumbers(2000);
	}

}
