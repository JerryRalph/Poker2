import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScoreTest {
	Hand deal = new Hand();
	Score theScore;

	@Test
	void testNumberOfPairs() {
		deal.getHand("Player 1: KH KD 8S 8C 2D Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.pairs().contains(2));
	}

	@Test
	void testHighestCard() {

		deal.getHand("Player 1: 5H 4D KS 3C 2D Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(13, theScore.determineHighestCard());
		assertEquals("13S", theScore.sort().get(0).toString());
		assertEquals(13, theScore.getScore());

	}

	@Test
	void testPair() {
		deal.getHand("Player 1: 5H 5D 7S 8C 9D Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.pairs().contains(2));
		assertEquals(true, theScore.isPair());
		assertEquals(200, theScore.getScore());
	}

	@Test
	void testTwoPair() {
		deal.getHand("Player 1: 5H 5D 8S 8C 9D Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.pairs().contains(2));
		assertEquals(true, theScore.isTwoPair());
		assertEquals(300, theScore.getScore());
	}

	@Test
	void testThreeOfKind() {
		deal.getHand("Player 1: 7H KD KS 8C KD Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.pairs().contains(3));
		assertEquals(true, theScore.isThreeOfKind());
		assertEquals(400, theScore.getScore());
	}

	@Test
	void testIsStraight() {
		deal.getHand("Player 1: 3H 4D 5S 6C 7D Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());

		assertEquals(6, theScore.sort().get(1).getValue());
		assertEquals(true, theScore.isStraight());
		assertEquals(500, theScore.getScore());
	}

	@Test
	void testFlush() {
		deal.getHand("Player 1: 7H 4H KH 8H JH Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.isFlush());
		assertEquals(600, theScore.getScore());
	}

	@Test
	void testFullHouse() {
		deal.getHand("Player 1: 8H KD KS 8C KD Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.pairs().contains(2));
		assertEquals(true, theScore.isFullHouse());
		assertEquals(700, theScore.getScore());
	}

	@Test
	void testFourOfKind() {
		deal.getHand("Player 1: KH KD KS KC 9D Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.pairs().contains(4));
		assertEquals(true, theScore.isFourOfKind());
		assertEquals(800, theScore.getScore());
	}

	@Test
	void testStraightFlush() {
		deal.getHand("Player 1: 4D 5D 6D 7D 8D Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.straightFlush());
		assertEquals(900, theScore.getScore());
	}

	@Test
	void testRoyalFlush() {
		deal.getHand("Player 1: AD JD QD KD TD Player 2: 2C 3H 4S 8C AH");
		theScore = new Score(deal.playerOneHand());
		assertEquals(true, theScore.royalFlush());
		assertEquals(1000, theScore.getScore());
		assertEquals("AD JD QD KD TD ", deal.playerOneHandString());
	}

}
