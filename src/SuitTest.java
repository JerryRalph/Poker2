import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuitTest {

	private static char CLUBS = 'C';
	private static char DIAMONDS = 'D';
	private static char SPADES = 'S';
	private static char HEARTS = 'H';

	@Test
	void testGetSuit() {
		assertEquals(CLUBS, Suit.CLUBS.getSuit());
		assertEquals(DIAMONDS, Suit.DIAMONDS.getSuit());
		assertEquals(SPADES, Suit.SPADES.getSuit());
		assertEquals(HEARTS, Suit.HEARTS.getSuit());
	}

	@Test
	void testFindSuit() {
		assertEquals(Suit.CLUBS, Suit.findSuit(CLUBS));
		assertEquals(Suit.DIAMONDS, Suit.findSuit(DIAMONDS));
		assertEquals(Suit.SPADES, Suit.findSuit(SPADES));
		assertEquals(Suit.HEARTS, Suit.findSuit(HEARTS));
	}

}
