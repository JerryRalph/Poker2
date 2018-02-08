
public enum Value {

	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(
			13), ACE(14);

	private int value;
	private static String TENVALUE = "10";
	private static String JACKVALUE = "11";
	private static String QUEENVALUE = "12";
	private static String KINGVALUE = "13";
	private static String ACEVALUE = "14";

	private static char TENS = 'T';
	private static char JACKS = 'J';
	private static char QUEENS = 'Q';
	private static char KINGS = 'K';
	private static char ACES = 'A';

	private static String faceCardValue;

	private Value(int value) {
		this.value = value;

	}

	public int getValue() {

		return value;
	}

	public static Value findValue(char cardValue) {
		for (Value card : Value.values()) {
			String aString = Character.toString(cardValue);
			if (card.isFaceCard(cardValue)) {
				aString = faceCardValue;
			}
			if (card.value == Integer.parseInt(aString)) {
				return card;
			}
		}
		return null;
	}

	private boolean isFaceCard(char card) {
		boolean check = false;

		if (isTen(card) || isJack(card) || isQueen(card) || isKing(card) || isAce(card)) {
			check = true;
		}
		return check;

	}

	private boolean isTen(char card) {
		faceCardValue = TENVALUE;
		return card == TENS;
	}

	private boolean isJack(char card) {
		faceCardValue = JACKVALUE;
		return card == JACKS;
	}

	private boolean isQueen(char card) {
		faceCardValue = QUEENVALUE;
		return card == QUEENS;
	}

	private boolean isKing(char card) {
		faceCardValue = KINGVALUE;
		return card == KINGS;
	}

	private boolean isAce(char card) {
		faceCardValue = ACEVALUE;
		return card == ACES;
	}

}
