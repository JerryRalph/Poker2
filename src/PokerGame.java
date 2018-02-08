
public class PokerGame {

	private Score playerOne;
	private Score playerTwo;
	private Hand hand;

	public PokerGame(Hand hand, Score playerOne, Score playerTwo) {
		this.hand = hand;
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;

	}

	public void displayWinner() {

		System.out.println("Player1    " + hand.playerTwoHandString() + "     " + playerOne.getHand() + "   "
				+ playerOne.sort().get(0).toString() + " High");
		System.out.println("Player2    " + hand.playerTwoHandString() + "      " + playerTwo.getHand() + "   "
				+ playerTwo.sort().get(0).toString() + " High");
		;
		if (determineWinner()) {
			DisplayGame.playerOneWins();

		} else

			DisplayGame.playerTwoWins();

	}

	private boolean determineWinner() {
		if (isTie()) {
			return playerOne.determineHighestCard() > playerTwo.determineHighestCard();
		} else
			return playerOne.getScore() > playerTwo.getScore();

	}

	private boolean isTie() {
		return playerOne.getScore() == playerTwo.getScore();
	}

}
