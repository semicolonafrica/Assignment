package chapter6.exercise619;
import java.util.Scanner;

public class FillCharacter{
	
	public static void fillCharacter(int number, char filledCharacter){
		
		for(int i = 1; i<=Math.pow(number, 2); i++) {
		System.out.print(filledCharacter);
	   
	
		if(i % number==0) 
			System.out.println();
		    	
		}
}
		public static void main(String[] args) {		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number");
			char fill = input.next().charAt(0);
			int x = input.nextInt();
			
			fillCharacter(x,fill);
			
			input.close();
		

		
		
		
		
	}
	
	

}
