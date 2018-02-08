import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class DisplayGameTest {

	Hand deal = new Hand();
	DisplayGame game = new DisplayGame();
	Score theScore;

	@Test
	public void test() {
		deal.getHand("Player 1: KH KD 8S 8C 2D Player 2: 2C 3H 4S 8C AH");
		assertEquals("KH KD 8S 8C 2D ", game.displayPlayerOneHand(deal));

	}

}
