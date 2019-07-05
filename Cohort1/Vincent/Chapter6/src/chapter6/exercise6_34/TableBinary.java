package chapter6.exercise6_34;

public class TableBinary {
   
	public static String convertToBinary(int decimal) {
		
		
		String binary = " ";
		
		while (decimal > 0) {
			int value = decimal % 2;
			binary = value + "" + binary;
			decimal /= 2 ;
		
		}
		
		
//		System.out.print(binary);
		System.out.println();
		
		return binary;
		
	}

	public static String convertToOctal(int number) {
		
		String octal = " ";
		while (number > 0) {
			int value = number % 8;
			octal = value + " " + octal ;
			number /= 8 ;
		}
		System.out.print(octal);
		return octal;

	}
	
	public static String convertToHexa(int number) {
		
		String hexadecimal = " ";
		
		
		while(number > 0) {
			int value = number % 16;
		
			
			switch (hexadecimal){
			
			case "10": 
				 hexadecimal = "A";
				break;
			case "11":
				 hexadecimal = "B";
				break;
			case "12":
				 hexadecimal = "C";		;
				break;
			case "13":
				hexadecimal = "D";
				break;
			case "14":
				hexadecimal = "E";
				break;
			case "15":
				hexadecimal = "F";
				break;	
			
			}
			hexadecimal = value + " " + hexadecimal;
			number /= 8;
		
		}
		return hexadecimal;
		
		}
	
	public static String displayMethods() {
		System.out.printf("%s%s%s", "binary", "octal", "hexadecimal");
		
		for(int count =1; count <= 245; count++) {
			System.out.printf("%d%s%s%s", count,convertToBinary(count) ,convertToOctal(count), convertToHexa(count));
			
			}
		return null;
	
	
	}

}
		
	


