package chapter6.chapter6_Group;
	import java.security.SecureRandom;
	import java.util.Scanner;
	
	public class TossCoin {
		
		public enum Coin {HEAD, TAIL};

		public static void flip() {
			SecureRandom objRandom = new SecureRandom();
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter p to play or any other key to exit.");
		    char play = input.next().charAt(0);
			
			Coin coinSides = null;
			int headCount = 0;
			int tailCount = 0;
			
			for ( ; play == 'p' || play == 'P' ; ) {
				
				int side = 1 + objRandom.nextInt(2);
				
				switch(side) {
				case 1:
					System.out.println(coinSides.HEAD);
					headCount++;
					break;
				case 2:
					System.out.println(coinSides.TAIL);
					tailCount++;
					break;
				}
				
				
				System.out.printf("%d head(s) tossed %n",headCount);
				
				System.out.printf("%d tails(s) tossed",	tailCount);
				System.out.println();
				System.out.println();
				
				System.out.print("Enter p to play or any other key to exit.")  ;
			      play =  input.next().charAt(0);
			}				
		}		
	}




	//HERE IS MY REFERENCE TO AN ONLINE MATERIAL ON USING SENTINEL IN FOR LOOP.
//
	//import java.util.Scanner;
	//
	//class EvalSqrt
	//{
	//  public static void main (String[] args )
	//  {
//	    Scanner scan = new Scanner( System.in );
//	    double x;
	//
//	    System.out.print("Enter a value for x or -1 to exit: ")  ;
//	    x = scan.nextDouble();
	//
//	    for (    ; x >= 0.0 ;   )  
//	    {
//	      System.out.println( "Square root of " + x + " is " + Math.sqrt( x ) ); 
	//
//	      System.out.print("Enter a value for x or -1 to exit: ")  ;
//	      x =  scan.nextDouble();
//	    }
	//  }
	//}

//}
