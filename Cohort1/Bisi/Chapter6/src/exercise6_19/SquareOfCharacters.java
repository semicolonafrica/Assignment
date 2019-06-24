package exercise6_19;

	import java.util.Scanner;
	
	public class SquareOfCharacters {
		
		public static void squareOfCharacters(){
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter number for side: ");
				int side  = input.nextInt();
				
				System.out.print("Enter number for side: ");
				char fill = input.next().charAt(0);
				
				for(int i = 0; i < side; i++) {
					
						for(int j = 0;j < side; j++) {
						
						System.out.print(fill);
			}
						System.out.println("");
		}			
	 }
		public static void main(String[] args) {
			
			SquareOfCharacters.squareOfCharacters();
	}
}	
