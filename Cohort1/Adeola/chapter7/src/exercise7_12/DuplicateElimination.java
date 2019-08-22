package exercise7_12;
import java.util.Scanner;

public class DuplicateElimination {
	public static boolean scanArray(int[] array, int num) {
		boolean result = false;
		for(int i = 0; i<array.length; i++) {
			if(num != array[i]) {
				result = true;
				continue;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] testArray = new int[5];
		System.out.println("enter array entry between 10 and 100");
		testArray[0]= input.nextInt();
		
		for(int i=1; i<testArray.length; i++) {
			System.out.println("enter new array entry between 10 and 100");
			int a= input.nextInt();
			if(scanArray(testArray, a)== false) {
				testArray[i]=a;
			}
			else {
				while(scanArray(testArray, a)== true) {
					System.out.println("enter another entry between 10 and 100");
					a=input.nextInt();
				}
//				testArray[i]=a;
			}
		}
		for(int i =0; i<testArray.length; i++) {
			System.out.print(testArray[i]+ " ");
		}
		input.close();
	}

}
