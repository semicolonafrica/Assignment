package examples;
import java.security.SecureRandom;
public class DeckOfCards {
	private Card deck[];
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final SecureRandom random = new SecureRandom();
	
	public DeckOfCards() {
		
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		deck =new Card[NUMBER_OF_CARDS];
		currentCard = 0 ;
		
			for(int counter = 0; counter<deck.length; counter++) {
				deck[counter] = new Card(faces[counter%13], suits[counter/13]);
			}
		
			
		}
	public void shuffle() {
		currentCard = 0;
		
		for(int first = 0; first<deck.length;first++) {
			int second = random.nextInt(NUMBER_OF_CARDS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public Card dealCard() {
		if(currentCard < deck.length) {
			return deck[currentCard++];
		}
		else {
			return null;
		}
	}
	
}
