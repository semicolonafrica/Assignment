package coinTossing;

import java.security.SecureRandom;
import java.util.Scanner;

import coinTossing.TossCoin.Coin;

public class TossCoin {
	
	public enum Coin {HEADS, TAILS};

	public static void toss() {
		char sentinel = 'd';
		char tossCoin = 'p';
		
		TossCoin.flip();
		
	}
	
	public static void flip() {
		Scanner input = new Scanner( System.in );
		char play;

	    System.out.print("Enter p to play or any other key to exit: ")  ;
	    play = input.next().charAt(0);
		
		
		
		SecureRandom randomNumbers = new SecureRandom();
		Coin coinSides = null;
		int headCount = 0;
		int tailCount = 0;
		
		for (    ; play == 'p' || play == 'P' ;   ) {
			int side = 1 + randomNumbers .nextInt(2);
			
			switch(side) {
			case 1:
				System.out.println(coinSides.HEADS);
				headCount++;
				break;
			case 2:
				System.out.println(coinSides.TAILS);
				tailCount++;
				break;
			}
			
			System.out.printf("%d head(s) tossed %n",headCount);
			
			System.out.printf("%d tails(s) tossed",	tailCount);
			System.out.println();
			System.out.println();
			
			System.out.print("Enter p to play or any other key to exit: ")  ;
		      play =  input.next().charAt(0);
		}
			

			      

			
			
}
	
	public static void main(String args[]) {
		TossCoin.toss();
	}
}




//
//import java.util.Scanner;
//
//class EvalSqrt
//{
//  public static void main (String[] args )
//  {
//    Scanner scan = new Scanner( System.in );
//    double x;
//
//    System.out.print("Enter a value for x or -1 to exit: ")  ;
//    x = scan.nextDouble();
//
//    for (    ; x >= 0.0 ;   )  
//    {
//      System.out.println( "Square root of " + x + " is " + Math.sqrt( x ) ); 
//
//      System.out.print("Enter a value for x or -1 to exit: ")  ;
//      x =  scan.nextDouble();
//    }
//  }
//}
