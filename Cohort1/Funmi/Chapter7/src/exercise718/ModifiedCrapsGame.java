package exercise718;

import java.security.SecureRandom;


public class ModifiedCrapsGame {
	static SecureRandom randomNumbers = new SecureRandom();
	
	enum Status{Win,Lost, Continue};
	static int [] GamesWon = new int[30];
	static int[] GameLost = new int[30];
//	int [] GamesLost;
	static int winTotal;

	public static void playGames() {
		
		int totalOfDice = rollDice();
		
		int myNumberPoint = 0;
		Status gamesOfStatus;
		int roll = 1;
//		GamesWon = new int[20];
//		GameLost = new int[20];

		
		switch(totalOfDice) {
		case 7:
		case 11:
			gamesOfStatus = Status.Win;
			break;
			
		case 2:
		case 3:
		case 12:
			gamesOfStatus = Status.Lost;
			break;
			
			default:
				gamesOfStatus =  Status.Continue;
				myNumberPoint = totalOfDice;
				break;
			
		}
		while(gamesOfStatus == Status.Continue) {
			totalOfDice = rollDice();
				++roll;
			
			if(totalOfDice == myNumberPoint)
			gamesOfStatus = Status.Win;
			
			else if(totalOfDice == 7) {
				gamesOfStatus = Status.Lost;
				
			}
			
		}

		if(gamesOfStatus == Status.Win) {
			++GamesWon[roll];
			System.out.println("Wow Congratulatio! Player Wins and you win with this\n");
		
		}
		else {
			++GameLost[roll];
			System.out.println("OoPs! Sorry you just lose your games and you loss with this \n");
			
		}

	}
		public static int rollDice() {
			int die1 = 1 + randomNumbers.nextInt(6);
			int die2 = 1 + randomNumbers.nextInt(6);
			int sum = die1 + die2;
			System.out.printf("player rolled %d + %d = %d%n",die1,die2,sum);
			return sum;
		
			
		}
		public static void printStatus(int [] num ,int [] value) {
			
			System.out.printf("%s%8s%8s%n", "Roll", "Wins", "Lose");
			for(int x = 1; x < num.length; x++) {
				System.out.printf("%d%8d%8d%n", x, num[x],value[x]);
				}
		}
		
		public static void rungame() {
			
			for(int k = 0; k < 10000; k++) {
				playGames();
			}
			printStatus(GamesWon,GameLost);
		}

	}

