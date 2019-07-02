package chapter6_exercises;
//Program that displays a table of the binary, octal and hexadecimal
//equivalents of the decimal numbers in the range 1 through 256
//Exercise 6.34
//Program written by Oyemade Temitope
public class TableofBinaryOctalHexadecimal {
	
	
	public static void table() {
		String binary;
		String octal;
		String hex;
		
		System.out.printf("%s%13s%15s%17s%n" ,"Decimal", "Binary","Octal", "Hexadecimal");
		
		for(int i =1; i<= 256; i++) {
			
			binary = Integer.toBinaryString(i);
			octal = Integer.toOctalString(i);
			hex = Integer.toHexString(i);
			
			System.out.printf("%d\t\t%s\t\t%s\t\t%s %n" ,i, binary, octal, hex);
		}
	}

	public static void main(String[] args) {
		
			table();
	}

}
