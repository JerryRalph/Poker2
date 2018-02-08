import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HandTest {

	private static char CLUBS = 'C';
	private static char DIAMONDS = 'D';
	private static char SPADES = 'S';
	private static char HEARTS = 'H';
	private static int HAND = 5;
	private static int KING = 13;
	private static int TWO = 2;
	private static int THREE = 3;

	Hand deal = new Hand();

	@Test
	void testStringSplit() {
		deal.getHand("Player 1: 5H KD KS 3C 2D Player 2: 2C 3S 4S 8C AH");
		assertEquals(HAND, deal.playerOneHand().size());
		assertEquals(HEARTS, deal.playerOneHand().get(0).getSuit());
		assertEquals(DIAMONDS, deal.playerOneHand().get(1).getSuit());
		assertEquals(HAND, deal.playerOneHand().get(0).getValue());
		assertEquals(KING, deal.playerOneHand().get(1).getValue());
		assertEquals(HAND, deal.playerTwoHand().size());
		assertEquals(CLUBS, deal.playerTwoHand().get(0).getSuit());
		assertEquals(SPADES, deal.playerTwoHand().get(1).getSuit());
		assertEquals(TWO, deal.playerTwoHand().get(0).getValue());
		assertEquals(THREE, deal.playerTwoHand().get(1).getValue());

	}

	@Test
	void testToString() {
		deal.getHand("Player 1: 5H KD KS 3C 2D Player 2: 2C 3S 4S 8C AH");
		assertEquals(HAND, deal.playerOneHand().size());
		assertEquals("5H KD KS 3C 2D ", deal.playerOneHandString());
		assertEquals("2C 3S 4S 8C AH", deal.playerTwoHandString());

	}

}
