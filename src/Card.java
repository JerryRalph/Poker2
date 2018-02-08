
public class Card implements Comparable<Card> {

	private Value value;
	private Suit cardSuit;

	public Card(Value cardValue, Suit cardSuit) {
		this.value = cardValue;
		this.cardSuit = cardSuit;

	}

	public int getValue() {
		return value.getValue();

	}

	public char getSuit() {
		return cardSuit.getSuit();

	}

	@Override
	public String toString() {

		return getValue() + Character.toString(getSuit());

	}

	@Override
	public int compareTo(Card compareCard) {
		int compareQuanity = ((Card) compareCard).getValue();
		return compareQuanity - this.value.getValue();
	}

}
