package exercise7_12;
import java.util.Scanner;
import java.util.Arrays;

public class DuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayArray();
		
	}
	public static boolean checkDuplicate(int[] array,int number) {
//			boolean result = false;
		for(int count = 0; count < array.length; count++) {
				if(array[count] ==  number)
					return true;
		}
				return false;
	}
	public static void displayArray() {
		Scanner in = new Scanner(System.in);
		
		int[] arrayValue = new int[5];
		int number;
		for(int count = 0; count < arrayValue.length; count++) {
			System.out.println("Enter number: ");
			number = in.nextInt();
			
			if((checkDuplicate(arrayValue, number) == false))
				arrayValue[count] = number;
			
				for(int each: arrayValue)
					if( each != 0)
						System.out.printf("%d ", each);
					
				System.out.println();
				
		}
		
	}
}
