package examples;
import java.util.Scanner;
public class Palindrome {
	static //create scanner object input
	Scanner input = new Scanner(System.in);
	
	//method that counts the number of digits contained in number
	public static int digitCounter(int number) {
		int value = number;
		int counter = 0;
		while(value>0) {
			value = value/10;
			counter++;
		}
		return counter;
	}
	
	public static boolean checkPalindrome(int number) {
		System.out.println("enter number: ");
		number = input.nextInt();
		int lenght = digitCounter(number);
		boolean result = true;
		int[] array =new int[lenght];
		
		for(int counter = 0; counter<lenght; counter++) {
			int mod = number%10;
			array[counter]= mod;
			number = number/10;
		}
		
		for(int counter = 0; counter<lenght; counter++) {
			if(array[counter]== array[lenght-1-counter]) {
				continue;
			}
			else {
				result = false;
			}
		}		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome(1));

	}

}
