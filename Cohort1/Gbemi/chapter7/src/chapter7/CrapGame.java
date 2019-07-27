/**
 * 
 */
package chapter7;

/**
 * (Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
answers the following questions:
a) How many games are won on the first roll, second roll, …, twentieth roll and after the
twentieth roll?
b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
twentieth roll?
c) What are the
 * @author gbemi
 *
 */
import java.security.SecureRandom;

public class CrapGame {
	
	
	private static final SecureRandom random = new SecureRandom();
	private enum Status{CONTINUE,WON,LOST};
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	private static Status gameStatus;
	public static int gameOfCrap() {
		
		int myPoint =0;
		
		
		int win=0;
		int lose=0;
		int counter = 1;
		
			int sum=rollDice();
			
			if(sum==SEVEN||sum==YO_LEVEN) {
				System.out.println("Player wins!\n");
				gameStatus=Status.WON;
				return ++win; 
				
			}
			else if(sum==TREY||sum==SNAKE_EYES||sum==BOX_CARS) {
				System.out.println("Player lose!\n");
				gameStatus=Status.LOST;
				return ++lose;
				
			}
			else {
				
				myPoint=sum;
				 gameStatus=Status.CONTINUE;
				 
				 while(gameStatus==Status.CONTINUE) {
					 sum=rollDice();
					 
					 counter++;
					 if(sum==myPoint) {
						 System.out.println("Player wins!\n");
						 win+=counter;
						 gameStatus=Status.WON;
						 return win;
					 }
					 else if (sum==SEVEN)
					 	{
						 lose+=counter;
						 
						 gameStatus=Status.LOST;
						 System.out.println("Player lose!\n");
						 return lose;
					 }
						 
				 }
				
				 
			}
			
			
		return win;

		// displayArray(win, "Wins");
		
	}
	public static int rollDice() {

		int die1=1+random.nextInt(6);
		
		int die2=1+random.nextInt(6);
		
		int sum=die1+die2;
		
		System.out.printf("Player rolled: %d + %d = %d%n", die1, die2, sum);
		

		 return sum;
	}
	
	public static void displayArray(int[] store,int [] store1) {
		System.out.printf("%s%8s%8s%n", "ROLLS","WINS","LOST");
		for(int g=1;g<store.length;g++) {
			
			System.out.printf("%2d%8d%8d%n",g,store[g],store1[g]);
			
		}
		
	}
		
	
	
	public static void runCraps() {
		int[] win= new int[30];
		int[] lose= new int[30];
		
		
		for(int z=1;z<=1000;z++) {
			int status=gameOfCrap();
			
			if(gameStatus==Status.WON) {
				++win[status];
			}
			
			if(gameStatus==Status.LOST) {
				++lose[status];
			}
		}
		displayArray(win,lose);
		
		
	}
	
	public static void main(String[] args) {
		
		//rollDice();
		runCraps();
	}

}
