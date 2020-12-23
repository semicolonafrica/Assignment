package exercise6_34;

import java.util.Scanner;
public class BinaryOctHex {
	
	public static void findBinary() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the range of numbers to convert: ");
		int number = input.nextInt();
		for(int i = 0; i<=number; i++) {
			System.out.printf("%-4d%-10s%-15s%-15s%n",i,convertBinary(i),convertOctadecimal(i),convertHexadecimal(i));
			input.close();
		}
	}
	public static String convertBinary(int counter) {
		 
		int mod;
		String binary = "",binaryMod="";
				while(counter > 0) {
					mod = counter % 2;
					binary = Integer.toString(mod);
					binaryMod = binary + binaryMod;
					counter = counter/2;
			}
				
			return binaryMod;	
	}
	public static String convertOctadecimal(int counter) { 
		int mod;
		String octal = "",octalMod="";
				while(counter > 0) {
					mod = counter % 8;
					octal = Integer.toString(mod);
					octalMod = octal + octalMod;
					counter = counter/8;
			}
				return octalMod;
	}
	public static String convertHexadecimal(int counter) { 
		int mod;
		String hexal = "",hexalMod="";
		
				while(counter > 0) {
					mod = counter % 16;
					hexal = Integer.toString(mod);
					hexalMod = hexal + hexalMod;
					counter = counter/16;
					
					switch(mod) {
					case 10:
						hexal = "A";
						break;
					case 11:
						hexal= "B";
						break;
					case 12:
						hexal= "C";
						break;
					case 13:
						hexal= "D";
						break;
					case 14:
						hexal= "E";
						break;
					case 15:
						hexal= "F";
						break;
						
					}
					
					return hexal;
					
			}
				return hexalMod;
	}

	
	
}
