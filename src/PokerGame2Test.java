import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class PokerGame2Test {

	Hand deal;
	Score scoreOne;
	Score scoreTwo;

	PokerGame2 game;

	@Test
	void test() {
		deal.getHand("Player 1: KH KD 8S 8C 2D Player 2: 2C 3H 4S 8C AH");
		scoreOne = new Score(deal.playerOneHand());
		scoreTwo = new Score(deal.playerTwoHand());
		game = new PokerGame2(deal);
		game.displayWinner();
	}

}
