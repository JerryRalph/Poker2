
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Score {

	private static int PAIR = 2;
	private static int THREEKIND = 3;
	private static int FOURKIND = 4;
	private static int FIRSTCARD = 0;
	private static int HIGHCARD = 0;
	private static int ACE = 14;
	private int score = 0;
	private String handType = "";

	private List<Card> hand = new ArrayList<>();

	public Score(List<Card> hand) {
		this.hand = hand;

	}

	public String getHand() {
		if (royalFlush() || straightFlush() || isFourOfKind() || isFullHouse() || isFlush() || isStraight()
				|| isThreeOfKind() || isTwoPair() || isPair()) {
			return handType;
		}
		determineHighestCard();
		handType = "High Card";
		return handType;
	}

	public int getScore() {
		if (royalFlush() || straightFlush() || isFourOfKind() || isFullHouse() || isFlush() || isStraight()
				|| isThreeOfKind() || isTwoPair() || isPair()) {
			return score;
		}

		return score = determineHighestCard();
	}

	public int determineHighestCard() {
		score = sort().get(HIGHCARD).getValue();
		return sort().get(HIGHCARD).getValue();
	}

	public boolean isPair() {
		score = 200;
		handType = "Pair";
		return pairs().size() == 4 && pairs().contains(PAIR);

	}

	public boolean isTwoPair() {
		score = 300;
		handType = "Two Pair";
		return pairs().size() == 3 && pairs().contains(PAIR);

	}

	public boolean isThreeOfKind() {
		score = 400;
		handType = "Three of a Kind";
		return pairs().contains(THREEKIND);

	}

	public boolean isStraight() {
		int count = 1;
		sort();
		int nextCard = hand.get(FIRSTCARD).getValue();
		for (int i = 1; i < 5; i++) {
			if (nextCard == hand.get(i).getValue() + 1) {
				nextCard = hand.get(i).getValue();
				count = count + 1;
			}
		}
		score = 500;
		handType = "Straight";
		return count == 5;

	}

	public boolean isFlush() {
		int counter = 1;

		int card = hand.get(FIRSTCARD).getSuit();
		for (int i = 1; i < hand.size(); i++) {
			if (card == hand.get(i).getSuit()) {
				counter = counter + 1;

			}
		}
		score = 600;
		handType = "Flush";
		return counter == 5;
	}

	public boolean isFullHouse() {
		score = 700;
		handType = "Full House";
		return pairs().contains(THREEKIND) && pairs().contains(PAIR);

	}

	public boolean isFourOfKind() {
		score = 800;
		handType = "Four of a Kind";
		return pairs().contains(FOURKIND);

	}

	public boolean straightFlush() {
		boolean check = isStraight() && isFlush();
		score = 900;
		handType = "Straight Flush";
		return check;
	}

	public boolean royalFlush() {
		boolean check = straightFlush() && determineHighestCard() == ACE;
		score = 1000;
		handType = "Royal Flush";
		return check;
	}

	public List<Integer> pairs() {
		List<Integer> cardValues = new ArrayList<>();
		List<Integer> pairs = new ArrayList<>();
		for (Card cards : hand) {
			cardValues.add(cards.getValue());
		}
		Set<Integer> likeCards = new HashSet<Integer>(cardValues);
		for (Integer temp : likeCards) {
			pairs.add(Collections.frequency(cardValues, temp));

		}
		return pairs;
	}

	public List<Card> sort() {

		Collections.sort(hand);

		return hand;
	}

}
