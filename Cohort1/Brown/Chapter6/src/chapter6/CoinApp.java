package Chapter6.exercise6_29;

import java.util.Scanner;

public class CoinApp {
	

	private enum Side {HEAD,TAIL};
		
	private static  int head = 0;
	private static  int tail = 0;
	
		public static void flipCoin() {
		
		 int sentinel =1;
		
		
			while(sentinel == 1) {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter 1 to flip coin or 0 to quit: ");
				sentinel = input.nextInt();
			int toss = RandomInteger.generateRandomNumberInt(2,0);
		
		 
		 if(toss == 0) {
			 System.out.println(Side.HEAD);
			 head++;
			 
		 }
		 
		 else {
			 System.out.println(Side.TAIL);
			 tail++;
			
		 }
		 
		}
			
		
		System.out.println("Number of HEADS = " + head);
		System.out.println("Number of TAILS = " + tail);
	}


}
