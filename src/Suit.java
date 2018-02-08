
public enum Suit {

	HEARTS('H'), CLUBS('C'), DIAMONDS('D'), SPADES('S');

	private final char suit;

	private Suit(char cardSuit) {

		this.suit = cardSuit;

	}

	public char getSuit() {
		return suit;
	}

	public static Suit findSuit(char cardSuit) {
		for (Suit card : Suit.values()) {

			if (card.suit == (cardSuit)) {
				return card;
			}
		}
		return null;
	}

}
