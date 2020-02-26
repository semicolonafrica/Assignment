package exercise7_12;
import java.util.Scanner;
public class Duplicate {
	Scanner input = new Scanner(System.in);
	
	public static boolean  searchDuplicate(int [] array, int x) {
		boolean check = false;
		
		for(int count = 0; count < array.length; count++) {
			
			if(array[count] == x) 
				check = true;
		}
		return check;
	}
	
	public void eliminate() {
		int number;
		int num [] = new int [5];
		System.out.println("Enter number between 10 and 100");

		System.out.print("Enter number: ");
		
		for(int counter = 0; counter < num.length; counter++) {
			
			number = input.nextInt();
			
			if(!(searchDuplicate(num, number))) {
				
				System.out.println(number);
				
				num[counter] = number;
				}
			
			for(int v : num) {
				
				if(v !=0)
				System.out.printf("%d ", v);
				
			}
			
			}
		
		
			
		}			
				}

	

