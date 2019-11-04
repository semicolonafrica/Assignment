package figure7;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		
		myDeckOfCards.shuffle();
		
		for(int k = 1; k <=52; k++) {
			
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if( k % 4 == 0)
				System.out.println();
		}

	}

}
