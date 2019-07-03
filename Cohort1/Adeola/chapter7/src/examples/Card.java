package examples;
public class Card {
	public final String face;
	public final String suit;
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}
	@Override
	public String toString() {
		return face + " of " + suit;
	}
	
	
}
