	  package exercise712;
	  
import java.util.Scanner;

public class DuplicateElimination2 {
	
	
	public static boolean deleteDublicate(int[] blu, int ab) {
		boolean result = false;
		for(int i = 0; i < blu.length; i++) {
			if(ab == blu[i]) {
				result = true;
				
				
			}
			
		}
		return result;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []blu= new int [5];
		System.out.println("Enter array entry between 10 and 100");
		int a = 0;
		
		for(int i = 0; i < blu.length; i++) {
			a = input.nextInt();
			
			if(a >= 10 && a<= 100) {
				if(!(deleteDublicate(blu,a))) {
					System.out.println(a);
					blu[i] = a;
				}
				else {
					i = i- 1;
				}
			}
			else {
				System.out.println("enter another entry within the range of 10 to 100");
				i = i -1;
			}

			for(int j : blu) {
				  if(j!= 0) 
					  System.out.printf( " %d",j);
					  
					  
				  
				  }
			
		}
		
		input.close();
	

	}

}
