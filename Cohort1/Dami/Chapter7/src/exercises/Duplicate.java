package exercises;
// Duplicate Elimination by @DamiDrevid
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] duplicate = new int[5];
		
		for(int a = 0; a < duplicate.length; a++) {
			System.out.println("Enter number");
			int number = input.nextInt();
			
			if(number < 10 || number > 100) {
				System.out.println("Invalid! Re-enter number");
				number = input.nextInt();
			}
	
			if(number != duplicate[0] && number != duplicate[1] && 
					number != duplicate[2] && number != duplicate[3] && number != duplicate[4]) {
				duplicate[a] = number;
				System.out.println(duplicate[a]);
				
				for(int x : duplicate) {
					if(x != 0)
					System.out.printf("%d ",x);
					}
			}
			
			else {
				System.out.println("Duplicate! Re-enter number");
				number = input.nextInt();
				duplicate[a] = number;
				System.out.println(duplicate[a]);
			}
			
		}
		for(int k = 0; k < duplicate.length; k++) {	
		System.out.printf("%4d",duplicate[k]);
		}
	}

}
