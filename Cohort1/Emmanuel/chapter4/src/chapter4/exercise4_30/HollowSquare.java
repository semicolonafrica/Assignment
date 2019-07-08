package chapter4.exercise4_30;

import java.util.Scanner;

//Emmanuel Akinbode

public class HollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of square sides");
		int square = input.nextInt();
		int counter = 1;
		
		while(counter <= 1)
		{
			
			int top = 1;

				while(top <= square)
				{
					System.out.print(" * ");
					top++;
				}
				System.out.println();
				
				int sides = 1;
				int value = square * 2;
				
				
				while(sides <= square)
				{
					int f = square;
					while(f <= value)
					{
						System.out.print(f % square == 0 ? "*" : "   ");
						f++;
					}
					System.out.println("");
					sides++;
				}
				
				int bottom = 1;
				while (bottom <= square)
				{
					System.out.print(" * ");
					bottom++;
				}
			counter++;
		}
			input.close();
		
	}

}
