package figure7;

public class Card {
	public final String face;
	public final String suit;
	
	public Card(String cardFace,String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	public String toString() {
		return face + " of " + suit;
	}
}
