package excercise4_37;

import java.util.Scanner;

public class Nth_Root {
	
	public int findNthRoot(int x, int y)
	{
		//divide y by 2 and set to i
		int i = y / 2; 
		//counter is used to 
		int counter = 1, mod;
		int store = 1;
		
		while(counter <= i)
		{
			mod = y % counter;
			
			if(mod == 0)
			{
				int pow = 1; // finds the power of counter for x number of times
				//find power of counter 
				while(pow <= x)
				{
					store = counter * store;
//					System.out.printf("%d%n",store);
					
					if(store == y) {
						return counter;
						
						}
				pow++;
				}

			}
		counter++;
			
		}
		
			return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nth_Root figure = new Nth_Root();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value x root of y:");
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.printf("nth root = %d",figure.findNthRoot(x, y));

	}

}
