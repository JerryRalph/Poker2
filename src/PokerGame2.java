import java.util.List;

public class PokerGame2 {
	private Hand deal;
	Score scoreOne;
	Score scoreTwo;

	public PokerGame2(Hand deal) {
		this.deal = deal;

	}

	public void displayWinner() {

		if (determineWinner()) {
			DisplayGame.playerOneWins();

		} else

			DisplayGame.playerTwoWins();

	}

	private boolean determineWinner() {
		scoreOne = new Score(deal.playerOneHand());
		scoreTwo = new Score(deal.playerTwoHand());

		return (scoreOne.getScore() > scoreTwo.getScore());
	}

}
