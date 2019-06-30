package numberSystems;

public class NumberSystemTable {
	
	
	public static void numberConversions() {
		String binary;
		String octal;
		String hexadecimal;
		
		System.out.printf("%s%13s%15s%17s%n" ,"Decimal", "Binary","Octal", "Hexadecimal");
		
		for(int i =1; i<= 256; i++) {
			
			binary = Integer.toBinaryString(i);
			octal = Integer.toOctalString(i);
			hexadecimal = Integer.toHexString(i);
			
			System.out.printf("%d\t\t%s\t\t%s\t\t%s %n" ,i, binary, octal, hexadecimal);
		}
	}

	public static void main(String[] args) {
		
			numberConversions();
	}

}