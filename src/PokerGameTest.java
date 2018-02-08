import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PokerGameTest {
	PokerGame game;
	Hand deal = new Hand();
	private Score playerOne;
	private Score playerTwo;
	DisplayGame gameDisplay;

	Score theScore;

	@Test
	void testPlayerOneWins() {

		deal.getHand("Player 1: 5H KD KS 3C 2D Player 2: 2C 3S 4S 8C AH");
		playerOne = new Score(deal.playerOneHand());
		playerTwo = new Score(deal.playerTwoHand());
		game = new PokerGame(deal, playerOne, playerTwo);
		game.displayWinner();

	}

	@Test
	void testPlayerTwoWins() {

		deal.getHand("Player 1: AH JH KH TH QH Player 2: 2C 2S 4S 8C 5H");
		playerOne = new Score(deal.playerOneHand());
		playerTwo = new Score(deal.playerTwoHand());
		game = new PokerGame(deal, playerOne, playerTwo);
		game.displayWinner();

	}

	@Test
	void testPlayerHighCard() {

		deal.getHand("Player 1: 2C 3H 4H 5H 6H Player 2: 3C 4S 5S 6C 7H");
		playerOne = new Score(deal.playerOneHand());
		playerTwo = new Score(deal.playerTwoHand());
		game = new PokerGame(deal, playerOne, playerTwo);
		game.displayWinner();

	}

}
