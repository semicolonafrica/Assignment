package exercises629;
import java.util.Random;
import java.util.Scanner;


public class CoinTossGame {
	private enum Coin{Head, Tail};
	public static void main(String[] args) {
		CoinTossGame game = new CoinTossGame();
		game.beginGame();
	}
		private  void beginGame() {
			
			Scanner input = new Scanner(System.in);
			Coin guess;
			
			while(true) {
				System.out.println("Enter your guess coin(h) rep Head, (t) rep Tail,and (e) rep to Exit: ");
				String choice = input.nextLine();
				if(choice.equalsIgnoreCase("e")){
					break;
				}
					else if(choice.equalsIgnoreCase("h")) {
						guess = Coin.Head;
					}
					else if(choice.equalsIgnoreCase("t")) {
						guess = Coin.Tail;
					}
					else {
						System.out.println("You have Enter the wrong choice: ");
						continue;
					}
				Coin toss = tossCoin();
				if(guess == toss) {
					System.out.println("Conratulation! You win: ");
					
				}else {
					System.out.println("Oops! you just loose your toss: ");
				}
			}
			input.close();			

		
	}
	
	

	
	private  Coin tossCoin() {
		Random r = new Random();
		int a = r.nextInt(2);
		if(a == 0) {
			return Coin.Head;
		}
		else {
			return Coin.Tail;
		
	}
	
	}
		
	}

