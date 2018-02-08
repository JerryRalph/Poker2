import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTest {

	@Test
	void testGetValue() {
		assertEquals(14, new Card(Value.ACE, Suit.CLUBS).getValue());
	}

	@Test
	void testGetSuit() {
		assertEquals('C', new Card(Value.ACE, Suit.CLUBS).getSuit());
	}

	@Test
	void testToString() {
		assertEquals("14C", new Card(Value.ACE, Suit.CLUBS).toString());
	}

}
