package exercise4_30;



import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		String x;
		
		
		while(counter <= 20) {
			System.out.println();
			
			System.out.print("*");
			x = input.nextLine();
		
			counter++;
		}
			
		
	input.close();
	}

}
