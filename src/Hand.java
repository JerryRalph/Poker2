import java.util.ArrayList;
import java.util.List;

public class Hand {

	private String player1;
	private String player2;
	private String playerHand;

	private static Suit suit;
	private static Value value;
	private static Card card;
	private static int WHITESPACE = 2;

	private List<Card> playerOneHand = new ArrayList<>();
	private List<Card> playerTwoHand = new ArrayList<>();

	public Hand() {

	}

	public void getHand(String hand) {
		this.playerHand = hand;
		player1 = playerHand.substring(playerHand.indexOf(":") + WHITESPACE, playerHand.indexOf("Player 2"));
		player2 = playerHand.substring(playerHand.lastIndexOf(":") + WHITESPACE);

	}

	public List<Card> playerOneHand() {
		String[] stringHand = playerHand(player1);
		playerOneHand = convertHand(stringHand);
		return playerOneHand;
	}

	public List<Card> playerTwoHand() {
		String[] stringHand = playerHand(player2);
		playerTwoHand = convertHand(stringHand);
		return playerTwoHand;
	}

	private String[] playerHand(String aHand) {
		String[] hand = aHand.split(" ");
		return hand;
	}

	private List<Card> convertHand(String[] aHand) {
		List<Card> theHand = new ArrayList<>();
		for (int aCard = 0; aCard < aHand.length; aCard++) {
			String cardString = aHand[aCard];
			char value1 = cardString.charAt(0);
			char suit1 = cardString.charAt(1);
			suit = Suit.findSuit(suit1);
			value = Value.findValue(value1);
			card = new Card(value, suit);
			theHand.add(card);
		}
		return theHand;

	}

	public String playerOneHandString() {

		return player1;
	}

	public String playerTwoHandString() {
		return player2;
	}

}
