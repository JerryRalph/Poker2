
public class DisplayGame {

	// private Hand hand;

	public DisplayGame() {
		// this.hand = hand;
	}

	public static void playerOneWins() {

		System.out.println("       Player 1 wins");

	}

	public static void playerTwoWins() {

		System.out.println("       Player 2 wins");

	}

	public String displayPlayerOneHand(Hand hand) {

		return hand.playerOneHandString();
	}

}
