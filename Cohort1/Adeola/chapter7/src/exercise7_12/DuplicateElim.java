package exercise7_12;
import java.util.Scanner;
public class DuplicateElim {
	public static boolean scanArray(int[] array, int num) {
		boolean result = false;
		for(int i=0; i<array.length;i++) {
			if(num == array[i]) {
				result = true;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("enter array entry between 10 and 100");
		int a = 0; //declare and initialize a to 0;
		for(int i=0; i<array.length; i++) { // loop to populate the array with values
			
			
			a= input.nextInt();
			if(a>=10 && a<=100) { // sets boundary for input btw 10 and 100
				if(!(scanArray(array, a))) { // calls array scanArray to check if input "a" already exist in array
					System.out.println(a);
					array[i] = a;
				}
				else {
					i=i-1; // adds 1 to counter 1 so as to complete loop
				}
			}
			else {
				System.out.println("enter number within range 10 to 100");
				i=i-1;// adds 1 to counter 1 so as to complete loop
			}
			//print the element of the array
			for(int k : array) {
				
				if(k !=0)
					System.out.printf("%d ", k);
			}
				
		}
		input.close();
	}

}
